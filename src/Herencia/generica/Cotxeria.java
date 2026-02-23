package Herencia.generica;

public class Cotxeria<E> { // classe genèrica (E: element)

    // Propietats
    E plaça1, plaça2;
    int num = 5;        // Classe genèrica pot tenir atributs no-genèrics
    String adreça = "";

    // Constructor
    Cotxeria(){ this.plaça1 = null; this.plaça1 = null; }

    // Setters
    public void aparcaPlaça1(E x){ this.plaça1 = x; }
    public void aparcaPlaça2(E x){ this.plaça2 = x; }

    // Altres
    public boolean estaPlena(){ return plaça1 != null && plaça2 != null; }








}
