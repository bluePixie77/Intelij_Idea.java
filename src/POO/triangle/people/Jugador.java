package POO.triangle.people;

public class Jugador extends Persona {
    enum POSICIO{PORTER, DAVANTER, DEFENSOR, MIGCAMPISTA}
    // Atributs o propietats de Jugador
    String nomEquip;
    int numGols;
    POSICIO pos;

    // Constructor
    public Jugador(String nom, int edat, SEXE sexe, String nomEquip, int numGols, POSICIO pos){
        super(nom, edat, sexe);
        this.nomEquip = nomEquip;
        this.numGols = numGols;
        this.pos = pos;
    }

    // Getters i Setters
    public String getNomEquip() {return nomEquip;}
    public void setNomEquip(String nomEquip) {this.nomEquip = nomEquip;}

    public int getNumGols() {return numGols;}
    public void setNumGols(int numGols) {this.numGols = numGols;}

    public POSICIO getPos() {return pos;}
    public void setPos(POSICIO pos) {this.pos = pos;}

    @Override
    void print(){
        System.out.printf("Nom: %s --> %d anys, sexe %s. Equip: %s. %d gols i %s.\n", nom, edat, sexe, nomEquip, numGols, pos);
    }
}
