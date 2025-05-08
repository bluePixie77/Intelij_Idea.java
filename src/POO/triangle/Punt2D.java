package POO.triangle;

import processing.core.PApplet;

public class Punt2D {

    // Atributs, propietats o variables de classe
    public float x, y;
    String nom;

    // Mètodes
    // Constructor(s)
    Punt2D(){
        this.x = 0; this.y = 0; this.nom = "0";
    }

    public Punt2D(String nom, float x, float y){
        this.nom = nom; this.x = x; this.y = y;
    }
    public Punt2D(float x, float y){
        this.nom = "A"; this.x = x; this.y = y;
    }

    // Setters (Mutadores)
    void setX(float x){this.x = x;}
    void setY(float y){this.y = y;}
    void setNom(String nom){this.nom = nom;}

    void setXY(float x, float y){this.x = x; this.y = y;}

    // Getters (Accesores)
    public String getNom(){ return this.nom; }
    public float getX(){ return this.x; }
    public float getY(){ return this.y; }

    // Altres funcions
    public void display(PApplet p5){
        p5.fill(0);
        p5.ellipse(this.x, this.y, 30, 30);
        p5.textSize(30); p5.fill(0);
        p5.text(this.nom, this.x+30, this.y);
    }
    void print(){
        System.out.println(this.nom+":("+this.x+", "+this.y+")");
    }
}
