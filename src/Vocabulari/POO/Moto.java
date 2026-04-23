package Vocabulari.POO;

// HERÈNCIA: SUBCLASSE Moto hereda/obté les propietats i mètodes de la superclasse
public class Moto extends Vehicle{

    // ENCAPSULAMENT = propietats privades + mètodes públics
    // Propietats privades (encapsulament)
    private int cilindrada;

    public Moto(String matricula, int nR, int cilindrada){
        super(matricula, nR);
        this.cilindrada=cilindrada;
    }

    // Setters i getters públics (encapsulament)
    public int getCilindrada() { return cilindrada; }
    public void setCilindrada(int cilindrada) { this.cilindrada = cilindrada; }

    // POLIMORFISME: mètode amb mateixa signatura (i normalment paràmetres) que varien mínimament en funció segons la classe
    public void print(){
        System.out.println("MOTO: "+matricula);
    }

    public void printMoto(){
        System.out.println("MOTO: "+matricula);
    }
}
