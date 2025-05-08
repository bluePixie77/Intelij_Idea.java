package POO.poligons;

import POO.triangle.Punt2D;
import processing.core.PApplet;

public class MainHexagon extends PApplet{

    Hexagon h; // Declaració
    public static void main(String[] args){
        PApplet.main("POO.poligons.MainHexagon");
    }

    public void settings(){
        size(700, 700);
    }
    public void setup(){
        h = new Hexagon(new Punt2D("0", 0, 0), 200);
    }
    public void draw(){
        background(250);
        translate(width/2, height/2);
        line(-width, 0, width, 0);
        line(0, -height, 0, height);
        h.display(this);
    }
}
