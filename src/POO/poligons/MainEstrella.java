package POO.poligons;

import POO.triangle.Punt2D;
import processing.core.PApplet;

public class MainEstrella extends PApplet{

    Estrella e; // Declaració
    Sol s;
    Punt2D c = new Punt2D("0", 0, 0);
    public static void main(String[] args){
        PApplet.main("POO.poligons.MainEstrella");
    }

    public void settings(){
        size(800, 800);
    }
    public void setup(){
        e = new Estrella(c, 100, 300);
        s = new Sol(c, 100, 300);
    }
    public void draw(){
        background(250);
        translate(width/2, height/2);
        line(-width, 0, width, 0);
        line(0, -height, 0, height);
        //e.display(this);
        s.display(this);

        float rI = map(40, 0, width, 40, 400);
        e.setRadiInterior(rI);
        e.updatePuntsInteriors(c);
        s.setRadiInterior(rI);
        s.updatePuntsInteriors(c);
    }
}
