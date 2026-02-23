package Herencia.abstracta;

public abstract class ClasseAbstracta {

    // Propietat
    String nom;
    // Constructor
    ClasseAbstracta(String n) { this.nom = n; }

    public static class SubClasse1 extends ClasseAbstracta {

        // Propietats
        int x;
        // Constructor
        SubClasse1(String n, int x) {
            super(n);
            this.x = x;
        }
    }


}
