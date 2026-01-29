package EstructuresDeDades;

import processing.core.PApplet;

public class ArbreBST {

    // Atributs o propietats
    NodeBST arrel;

    // Constructors
    public ArbreBST(){
        arrel = null;
    }
    public ArbreBST(int n){
        this.arrel = new NodeBST(n);
    }

    // Altres mètodes
    public boolean isEmpty(){
        return this.arrel == null;
    }

    public void addElement(int n){
        if(isEmpty()){
            arrel = new NodeBST(n);
        } else {
            NodeBST pare = this.arrel;
            while(pare.esq!=null && n<pare.valor ||
                  pare.dret!=null && n>pare.valor){

                if(n<pare.valor){ pare = pare.esq; }
                else { pare = pare.dret; }
            }
            if(n<pare.valor){ pare.esq = new NodeBST(n); }
            else{ pare.dret = new NodeBST(n); }
        }
    }

    public boolean cercaElement(int valor, NodeBST n){
        // Esquerra a dreta
        if(n==null){
            return false;   // QUAN HI HA RETURN A UNA CRIDADA RECURSIVA, S'HAN DE FER RETURNS PER TOTES LES CRIDADES
        } else if(n.valor == valor){
            return true;
        } else {
            if(valor<n.valor && n.esq!=null){
                return cercaElement(valor, n.esq);
            } else if(valor>n.valor && n.dret!=null) {
                return cercaElement(valor, n.dret);
            }
            return false;
        }
    }

    public int getMinim(){
        NodeBST pare = this.arrel;
        while(pare.esq != null){
            pare = pare.esq;
        }
        return pare.valor;
    }
    public int getMaxim(){
        NodeBST pare = this.arrel;
        while(pare.dret != null){
            pare = pare.dret;
        }
        return pare.valor;
    }


    void display(PApplet p5, NodeBST n, float x, float y, float r, int level){
        float dx = (p5.width/3)/(level+2);
        n.display(p5, x, y, r, level);

        if(n.esq != null){
            display(p5, n.esq, x-dx, y + 2*r, r, level +1);
        }
        if(n.dret != null){
            display(p5, n.dret, x+dx, y + 2*r, r, level +1);
        }
    }

    public void bfs(NodeBST node, int valor){  // Breadth First Search (podria fer-se amb arbres no binaris de cerca)
        CuaNodeBST c = new CuaNodeBST();
        node.setVisitat(true);
        c.encola(node);
        while(!c.isEmpty()){
            NodeBST nActual = c.desencola();
            nActual.visitar();
            if(nActual.valor == valor){
                System.out.println("TROBAT");
            }
            for(NodeBST fill : adjecents(nActual)){  // Bucle for-each (per cada fill, iterar num. adjecents)
                if(fill!=null && !fill.visitat){
                    fill.setVisitat(true);
                    c.encola(fill);
                }
            }
        }
        System.out.print("\n\n  ");
    }
    public NodeBST[] adjecents(NodeBST n){  // array amb fills de node 'n'
        NodeBST[] nodes = new NodeBST[2];
        nodes[0] = n.esq;
        nodes[1] = n.dret;
        return nodes;
    }
}
