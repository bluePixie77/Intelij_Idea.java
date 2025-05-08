package POO.triangle.cercle;

import POO.triangle.Punt2D;
import processing.core.PApplet;

public class Cercle {

    // Importació punt2D
    Punt2D centre;
    float radi;

    // Constructor(s)
    public Cercle(Punt2D centre, float radi) {
        this.centre = centre;
        this.radi = radi;
    }

    public Cercle() {
        this.centre = new Punt2D(0, 0);
        this.radi = 80;
    }

    // Getter i Setter de Centre
    public Punt2D getCentre() {return centre;}
    public void setCentre(Punt2D centre) {this.centre = centre;}

    // Getter i Setter de Radi
    public float getRadi() {return radi;}
    public void setRadi(float radi) {this.radi = radi;}

    // Altres funcions
    public void display(PApplet p5){
        p5.fill(0, 255, 200, 50); p5.strokeWeight(2);
        p5.circle(this.centre.getX(), this.centre.getY(), this.radi*2);
        p5.fill(200, 0, 255, 50);
        this.centre.display(p5);
    }
}
