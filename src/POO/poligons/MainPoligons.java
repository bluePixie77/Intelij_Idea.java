package POO.poligons;

import POO.triangle.Punt2D;
import processing.core.PApplet;

public class MainPoligons extends PApplet{

    Poligon t; // Declaració
    Hexagon h;
    Pentagon p;
    public static void main(String[] args){
        PApplet.main("POO.poligons.MainPoligons");
    }

    public void settings(){
        size(700, 700);
    }
    public void setup(){
        t = new Poligon(6, new Punt2D("0", 0, 0), 200);
        h = new Hexagon(new Punt2D("H", 200, 200), 100);
        p = new Pentagon(new Punt2D("P", -200, -200), 100);
    }
    public void draw(){
        background(250);
        translate(width/2, height/2);
        t.display(this);
        h.display(this);
        p.display(this);
    }
}
