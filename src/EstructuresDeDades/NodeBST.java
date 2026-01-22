package EstructuresDeDades;

import processing.core.PApplet;

public class NodeBST {

    // Atributs
    int valor;
    NodeBST esq, dret;

    // Constructor
    public NodeBST(int v){
        this.valor = v;
        this.esq = null;
        this.dret = null;
    }

    // Setters
    public void setFillEsq(NodeBST esq){ this.esq = esq; }
    public void setFillDret(NodeBST dret){ this.dret = dret; }

    // Altres mètodes
    public void visitar(){
        System.out.print(this.valor + ", ");
    }

    public void inordre(){
        if(this.esq != null){ this.esq.inordre(); }  // Left
        visitar();                                    // Node
        if(this.dret != null){ this.dret.inordre(); }// Right
    }
    public void postordre(){
        if(this.esq != null){ this.esq.postordre(); }  // Left
        if(this.dret != null){ this.dret.postordre(); }// Right
        visitar();                                    // Node
    }
    public void preordre(){
        visitar();                                    // Node
        if(this.esq != null){ this.esq.preordre(); }  // Left
        if(this.dret != null){ this.dret.preordre(); }// Right
    }
    public void revers(){
        if(this.dret != null){ this.dret.revers(); }// Right
        visitar();                                  // Node
        if(this.esq != null){ this.esq.revers(); }  // Left
    }

    void display(PApplet p5, float x, float y, float r, int level){

        float dx = (p5.width/3)/(level+2);
        p5.pushStyle();

        if(this.esq!=null){
            p5.line(x, y, x - dx, y + 2*r);
        }

        if(this.dret!=null){
            p5.line(x, y, x + dx, y + 2*r);
        }
        p5.fill(255);
        p5.ellipse(x, y, r,r);
        p5.fill(0); p5.textSize(18); p5.textAlign(p5.CENTER);
        p5.text(this.valor, x, y + r/6);
        p5.popStyle();
    }

}
