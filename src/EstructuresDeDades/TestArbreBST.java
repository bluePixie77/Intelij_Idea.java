package EstructuresDeDades;

public class TestArbreBST {

    public static void main(String[] args) {

        // Objectes ( 5 nodes independents )
        NodeBST arrel = new NodeBST(23);
        NodeBST n11 = new NodeBST(11);
        NodeBST n44 = new NodeBST(44);
        NodeBST n5 = new NodeBST(5);
        NodeBST n28 = new NodeBST(28);

        // Ordenació manual
        arrel.setFillEsq(n11);
        arrel.setFillDret(n44);
        n11.setFillEsq(n5);
        n44.setFillEsq(n28);

        System.out.println("\nRecorregut INORDER:");
        inorder(arrel);

        System.out.println("\nRecorregut PREORDER:");
        preorder(arrel);

        System.out.println("\nRecorregut POSTORDER:");
        postorder(arrel);

        System.out.println("\nRecorregut REVERS INORDER:");
        reverseInorder(arrel);
    }

    public static void inorder(NodeBST n){
        if(n!=null){
            inorder(n.esq); // Left
            n.visitar();    // Node
            inorder(n.dret);// Right
        }
    }

    public static void preorder(NodeBST n){
        if(n!=null){
            n.visitar();     // Node
            preorder(n.esq); // Left
            preorder(n.dret);// Right
        }
    }

    public static void postorder(NodeBST n){
        if(n!=null){
            postorder(n.esq); // Left
            postorder(n.dret);// Right
            n.visitar();      // Node
        }
    }

    public static void reverseInorder(NodeBST n){
        if(n!=null){
            reverseInorder(n.dret);// Right
            n.visitar();    // Node
            reverseInorder(n.esq); // Left
        }
    }
}
