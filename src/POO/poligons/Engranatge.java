package POO.poligons;

import POO.triangle.Punt2D;

import static processing.core.PApplet.*;

public class Engranatge extends Poligon{
    float radiInterior;
    // Constructor
    Engranatge(Punt2D c, float rI, float rE){
        super(12, c, rE);
        updatePuntsInteriors(c);
        this.radiInterior = rI;
    }

    // Setter
    public void setRadiInterior(float r){this.radiInterior = r;}

    public void updatePuntsInteriors(Punt2D c) {
        float angStep = 360f / 12;
        float ang = 0;
        for (int i = 0; i < punts.length; i += 2) {
            if(i%4>2){
                punts[i].x = c.getX() + radiInterior * cos(radians(ang));
                punts[i].y = c.getY() + radiInterior * sin(radians(ang));
            }
            ang += 2 * angStep;
        }
    }
}
