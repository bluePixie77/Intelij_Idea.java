package Herencia.object;

public class MainToString1 {

    public static void main(String[] args) {
        // Objectes
        Persona p1, p2;
        // Instanciació/creació d'objectes
        p1 = new Persona("Paco", 33);
        p2 = new Persona("Pep", 33);

        String txtP1 = p1.toString();
        String txtP2 = p2.toString();

        System.out.println(p1); // = System.out.println(p1.toString());
        System.out.println(p2); // si no té toString, s'imprimeix l'adreça de memòria (hashCode()),
        // núm. identificatiu per la màquina

        if(p1.equals(p2)){  // Per als Strings, també s'ha d'usar equals(), pq són objectes
            System.out.println("Iguals P1 i P2");
        }else{
            System.out.println("Diferents P1 i P2");
        }
    }

    public static class Persona{ // Una classe dins una altra (com si fos dins el fitxer MainToString1)
        // Propietats
        String nom;
        int edat;

        // Constructor
        public Persona(String nom, int edat){ this.nom=nom; this.edat=edat; }
        // Setters i getters […]

        // Altres mètodes
        // @Override
        public String toString(){
            return nom.toUpperCase()+": "+edat;
        }

        public boolean equals(Object o){
            Persona po = (Persona)o;
            if(this.nom.equals(po.nom) && this.edat == po.edat){ // NO recursivitat, po crida el seu propi mètode equals()
                return true;
            }else{
                return false;
            }

        }
    }
}
