package POO.triangle.people;

public class Persona {
    enum SEXE{HOME, DONA, ALTRE}

    // Atributs o propietats
    String nom;
    int edat;
    SEXE sexe;

    // Constructor
    public Persona(String nom, int edat, SEXE sexe) {
        this.nom = nom;
        this.edat = edat;
        this.sexe = sexe;
    }

    // Getters i Setters
    public String getNom() {return nom;}
    public void setNom(String nom) {this.nom = nom;}

    public int getEdat() {return edat;}
    public void setEdat(int edat) {this.edat = edat;}

    public SEXE getSexe() {return sexe;}
    public void setSexe(SEXE sexe) {this.sexe = sexe;}

    // Altres funcions
    void print(){
        System.out.printf("Nom: %s / Edat: %d / Sexe: %s.\n", nom, edat, sexe);
    }
}
