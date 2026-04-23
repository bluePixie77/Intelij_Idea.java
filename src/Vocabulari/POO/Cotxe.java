package Vocabulari.POO;

// SUBCLASSE
public class Cotxe extends Vehicle{
    // Definició tipus ENUMERAT
    public enum COMBUSTIBLE { BENZINA, DIESEL, ELECTRIC }

    // Variable de tipus enum
    COMBUSTIBLE combustible;


    public Cotxe(String matricula, COMBUSTIBLE c){
        super(matricula);
        this.combustible = c;
    }

    // (Override)
    // POLIMORFISME
    public void print(){
        System.out.println("COTXE: "+matricula);
    }

    public void printCotxe(){
        System.out.println("COTXE: "+matricula);
    }

}
