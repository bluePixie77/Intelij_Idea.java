package POO.SimulacioMemoriaRAMSwapping;

import processing.core.PApplet;

public class MainSwapping extends PApplet {

    public static void main(String[] args) {
        PApplet.main("POO.SimulacioMemoriaRAMSwapping.MainSwapping");
    }

    // Atributs
    Proces p1;

    public void settings(){
        size(1400, 800);
    }

    public void setup(){
        p1 = new Proces("P1", color(255, 0, 0), 64);
    }

    public void draw(){
        background(255);
        p1.display(this, 100, 100, 50);
    }
}
