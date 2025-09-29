package POO.SimulacioMemoriaRAMSwapping3;
import processing.core.PApplet;

public class Hole {

    // Atributs i propietats
    int address;
    int mida;

    // Constructor
    public Hole(int address, int mida){
        this.address = address;
        this.mida = mida;
    }

    // Altres mètodes
    public void display(PApplet p5, float x, float y, float h){
        p5.fill(50); p5.stroke(0); p5.strokeWeight(3);
        p5.rect(x+address, y, mida, h);
    }
}