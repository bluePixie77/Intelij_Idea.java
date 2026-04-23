package Vocabulari.POO;

// Classe ABSTRACTA: no es poden crear objectes d'aquesta classe. Sol servir de SUPERCLASSE en relacions d'herència
public abstract class Vehicle {

    // ESTAT: conjunt de PROPIETATS, ATRIBUTS o VARIABLES de la classe
    String matricula;
    int numRodes; // TIPUS DE DADES PRIMITIUS/BÀSICS: int, double, char, boolean...

    // Propietats i mètodes ESTÀTICS: propietat o mètode comuna, única i compartida amb tota la classe
    public static int comptador = 0; // Ús habitual de propietats ESTÀTIQUES. Inicialitzat a nivell de classe a 0


    // COMPORTAMENT: conjunt de MÈTODES o FUNCIONS de la classe

        // CONSTRUCTOR(s): mètode per instanciar/crear mètodes de la classe
    // Exemple de sobre-càrrega (OVERLOAD): funcions amb el mateix nom i diferents paràmetres
    public Vehicle(String matricula, int nR){
        this.matricula = matricula; // 'this' per aclarir ambigüetats i convenció habitual entre programadors
        numRodes = nR;
        comptador++;
    }
    public Vehicle(String matricula){
        this.matricula = matricula;
        this.numRodes = 4;  // valor per defecte directament assignat
        comptador++;
    }

        // Setters o mutadores: permeten modificar d'un o més atributs de la classe
    // Convenció habitual setNom i getNom. Getter pot tenir altres paràmetres (formatejar dades retornades)
    public void setMatricula(String m){ this.matricula = m; }

        // Getters o accessores: mètodes que permeten accedir al valor d'un atribut o propietat de la classe
    public String getMatricula() { return this.matricula; }

    // Sobre-escriptura o override dels mètodes heretats de la classe Object
    public boolean equals(Object o){
        Vehicle altre = (Vehicle) o; // Casting descendent o downcasting: de superclasse a subclasse
        return this.matricula.equalsIgnoreCase(altre.matricula);
    }

    // Sobre-escriptura o override del mètode toString heretat de la classe Object
    public String toString(){
        return "VEHICLE: "+matricula+" ("+numRodes+")";
    }

    // Mètode estàtic de la classe Vehicle
    public static int sumaRodes(){
        return comptador * 4;
    }

    // (Override)
    public void print(){
    }
}
