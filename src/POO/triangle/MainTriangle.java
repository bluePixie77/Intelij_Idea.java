package POO.triangle;

import processing.core.PApplet;

public class MainTriangle extends PApplet{

    // Declaració
    Punt2D p1, p2, p3;
    Triangle t1;
    public static void main(String[] args) {
        PApplet.main("POO.triangle.MainTriangle");
    }
    public void settings(){
        size(600, 600);
    }
    public void setup(){
        p1 = new Punt2D();
        p2 = new Punt2D("A", 200, 200);
        p3 = new Punt2D("B", -200, 100);

        t1 = new Triangle(p1, p2, p3);
    }
    public void draw(){
        background(255);
        translate(width/2, height/2);
        /* dibuix punts
        p1.display(this);
        p2.display(this);
        p3.display(this);
        */
        t1.display(this, color(255, 200, 0, 50));
    }
    public void mousePressed(){
        Punt2D pMouse = new Punt2D("O", mouseX-width/2, mouseY-height/2);
        t1.setA(pMouse);
    }
}
