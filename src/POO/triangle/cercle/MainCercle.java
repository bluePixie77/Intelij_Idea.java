package POO.triangle.cercle;

import POO.triangle.Punt2D;
import processing.core.PApplet;

public class MainCercle extends PApplet{

    // Declaració varaibles classe Cercle
    Cercle c1, c2;


    public static void main(String[] args){
        PApplet.main("POO.triangle.cercle.MainCercle");
    }
    public void settings(){
        size(700, 700);
    }
    public void setup(){
        background(255);
        // Instanciació variables classe Cercle + constructors
        c1 = new Cercle();
        c2 = new Cercle(new Punt2D(200, 200), 100);
    }
    public void draw(){
        background(255);
        translate(width/2, height/2);
        line(-width, 0, width, 0);
        line(0, -height, 0, height);

        // Dibuixa els cercles
        this.c1.display(this);
        this.c2.display(this);

        float r = dist(c1.getCentre().getX(), c1.getCentre().getY(), mouseX-width/2, mouseY-height/2);
        this.c1.setRadi(r);
    }
    public void mousePressed(){

    }
}
