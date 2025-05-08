package POO.triangle.people;

public class Professor extends Persona {
    int anysDocent;
    String departament;

    public Professor(String n, int e, Persona.SEXE s, int a, String dep) {
        super(n, e, s);
        this.anysDocent = a;
        this.departament = dep;
    }
    @Override
    void print(){
        System.out.printf("NOM: %s / Anys docent: %d / Departament: %s\n", nom, anysDocent, departament);
    }
}
