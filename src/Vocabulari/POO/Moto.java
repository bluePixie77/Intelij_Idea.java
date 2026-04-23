package Vocabulari.POO;

// HERÈNCIA: subclasse Moto hereda/obté les propietats i mètodes de la superclasse
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
}
