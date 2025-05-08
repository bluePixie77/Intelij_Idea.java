package POO.triangle;

import processing.core.PApplet;

public class Triangle {
    Punt2D a, b, c;

    // Constructors
    // AGREGACIÓ
    Triangle(Punt2D p1, Punt2D p2, Punt2D p3){
        this.a = p1; this.b = p2; this.c = p3;
    }

    // COMPOSICIÓ
    Triangle(float x1, float y1, float x2, float y2, float x3, float y3){
        this.a = new Punt2D("A", x1, y1);
        this.a = new Punt2D("B", x2, y2);
        this.a = new Punt2D("C", x3, y3);
    }

    // Setters
    void setA(Punt2D a){this.a = a;}
    void setB(Punt2D b){this.b = b;}
    void setC(Punt2D c){this.c = c;}

    void setABC(Punt2D a, Punt2D b, Punt2D c){this.a = a; this.b = b; this.c = c;}

    // Getters
    Punt2D getA(){return this.a;}
    Punt2D getB(){return this.b;}
    Punt2D getC(){return this.c;}


    // Altres funcions
    void print(){
        System.out.print("Triangle: ");
        this.a.print();
        this.b.print();
        this.c.print();
    }
    void display(PApplet p5, int tColor){
        p5.stroke(255,0,0); p5.strokeWeight(3); p5.fill(tColor);
        p5.beginShape();
        p5.vertex(this.a.x, this.a.y);
        p5.vertex(this.b.x, this.b.y);
        p5.vertex(this.c.x, this.c.y);
        p5.endShape(p5.CLOSE);

        // punts individuals
        this.a.display(p5);
        this.b.display(p5);
        this.c.display(p5);
    }


}
