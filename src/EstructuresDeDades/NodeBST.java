package EstructuresDeDades;

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
    public void setFillDret(NodeBST dret){ this.dret = dret;}

    // Altres mètodes
    public void visitar(){
        System.out.print(this.valor + ", ");
    }



}
