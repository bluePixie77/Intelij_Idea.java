package EstructuresDeDades;

import processing.core.PApplet;

public class LlistaNodes {

    Node head, tail;
    int numNodes;

    // Constructor
    public LlistaNodes(){
        this.head = null;
        this.tail = null;
        this.numNodes = 0;
    }

    // Mètodes
    public boolean isEmpty(){
        return this.head==null && this.tail==null;
    }

    public void prepend(int v){     // Afegir node a l'inici
        if(isEmpty()){
            Node n = new Node(v);
            head = n; tail = n;
        }else{
            Node n = new Node(v, head);
            head = n;
        }
        numNodes++;
    }

    public void append(int v){           // Afegir node al final
        if(isEmpty()){
            Node n = new Node(v);
            head = n; tail = n;
        }else{
            Node n = new Node(v);
            tail.seg = n;           // darrer node fins ara, ara apunta cap al nou node
            tail = n;               // tail ara apunta al nou node
        }
        numNodes++;
    }

    public int numElements(){   // poc eficient per llistes molt llargues
        int count = 0;
        Node x = head;
        while(x!=null){
            x = x.seg;      // ens movem d'un node cap al seu següent
            count++;
        }
        return count;
    }

    public int numElements2(){  // Duim un comptador actualitzat periòdicamente
        return this.numNodes;
    }

    // Getters
    public int getFirst(){
        return head.valor; // mateix packadge i valor és protected, per tant, no fa falta usar getter
    }
    public int getLast(){
        return tail.valor;
    }
    public int getElementAt(int i){
        int v = 0;
        if(i<numNodes){
            int k=0;
            Node n = head;
            while(k < i){
                n = n.seg;
                k++;
            }
            return n.valor;
        }
        return -1; // posició invàlida
    }

    public void insertAt(int i, int v){
        if (i == 0) {
            prepend(v);
        }else if(i==numNodes-1){
            append(v);
        } else if(i<numNodes){
            int k=0;
            Node nAnt = head;
            while(k < i-1){
                nAnt = nAnt.seg;
                k++;
            }
            Node nSeg = nAnt.seg;
            Node nouNode = new Node(v, nSeg);
            nAnt.seg = nouNode;
            numNodes++;
        }
    }
    public void removeAt(){}

    void display(PApplet p5, int x, int y, int wn) {

        if (!isEmpty()) {

            Node n = head;
            int i = 0;
            do {
                n.display(p5, x + 2*i*wn, y, wn);
                n = n.getSegNode();
                i++;
            } while (n!=null);
        }

        p5.fill(0);
        p5.textAlign(p5.CENTER);
        p5.text("HEAD", x + wn/2, y -50);
        p5.line(x + wn/2, y - wn, x + wn/2, y);
    }

}