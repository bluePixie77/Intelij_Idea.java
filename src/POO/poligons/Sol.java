package POO.poligons;

import POO.triangle.Punt2D;

import static processing.core.PApplet.*;

public class Sol extends Poligon{
    float radiInterior;
    float radiExterior;
    // Constructor
    Sol(Punt2D c, float rI, float rE){
        super(33, c, rE);
        updatePuntsInteriors(c);
        this.radiInterior = rI;
    }

    // Setter
    public void setRadiInterior(float r){this.radiInterior = r;}
    public void setRadiExterior(float r){this.radiExterior = r;}

    public void updatePuntsInteriors(Punt2D c) {
        float angStep = 360f / punts.length;
        float ang = 0;
        for (int i = 0; i < punts.length; i += 2) {
            if (i%3==0) {
                punts[i].x = c.getX() + radiInterior * cos(radians(ang));
                punts[i].y = c.getY() + radiInterior * sin(radians(ang));
            }
            ang += 2 * angStep;
        }
    }
}
