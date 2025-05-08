package POO.poligons;

import POO.triangle.Punt2D;
import processing.core.PApplet;

import static processing.core.PApplet.*;

public class Poligon {
    Punt2D[] punts; // COMPOSICIÓ: atributs d'una altra classe

    // Constructor(s)
    Poligon(int n){
        punts = new Punt2D[n];
    }

    Poligon(int n, Punt2D centre, float radi){
        this(n); // Cridada a l'altre constructor de Poligon
        float angStep = 360f / n;
        float ang = 0;
        for(int i=0; i<punts.length; i++){
            float x = centre.getX() + radi*cos(radians(ang));
            float y = centre.getY() + radi*sin(radians(ang));
            String t = String.valueOf(i+1);
            setPuntAt(i, new Punt2D(t, x, y));
            ang += angStep;
        }
    }

    // Setter
    void setPuntAt(int i, Punt2D p){punts[i] = p;}

    // Getter
    Punt2D getPuntAt(int i){return punts[i];}

    void display(PApplet p5){
        p5.stroke(0); p5.fill(200, 0, 0, 50);

        // Dibuixar
        p5.beginShape();
         for(int i=0; i<punts.length; i++){
             p5.vertex(punts[i].getX(), punts[i].getY()); // com que Punts2D no és al mateix package, usam getX/getY
         }
        p5.endShape(p5.CLOSE);
        for(int i=0; i<punts.length; i++){
           punts[i].display(p5);
        }
    }
}
