package POO.SimulacioMemoriaRAMSwapping2;
import processing.core.PApplet;

public class Proces {

    // Atributs o propietats
    String nom;
    int color;
    int mida;
    int address;

    // Constructor
    Proces(String n, int c, int m){
        this.nom = n;
        this.color = c;
        this.mida = m;
    }

    // Setters
    void setAddress(int a){ this.address = a; }

    // Altres mètdoes
    void display(PApplet p5, float x, float y, float h){
        p5.fill(this.color); p5.stroke(0); p5.strokeWeight(3);
        p5.rect(x+this.address, y, this.mida, h);

        p5.fill(0); p5.textAlign(p5.CENTER); p5.textSize(20);
        p5.text(this.nom, x+this.address+(this.mida/2), y+h/2);
    }
}
