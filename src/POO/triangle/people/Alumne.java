package POO.triangle.people;

public class Alumne extends Persona{

    // Atributs propis classe Alumne
    int curs;
    char grup;

    // Constructor
    Alumne(String n, int e, SEXE s, int c, char g){
        super(n, e, s); // Constructor Classe Pare (superclasse)
        this.curs = c;
        this.grup = g;
    }

    void print(){
        System.out.printf("Nom: %s / Edat: %d / Sexe: %s // Curs i Grup: %d%c.\n", nom, edat, sexe, curs, grup);
    }


}
