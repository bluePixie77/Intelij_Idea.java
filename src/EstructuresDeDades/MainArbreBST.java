package EstructuresDeDades;

import processing.core.PApplet;

public class MainArbreBST extends PApplet {

    // Atributs o propietats
    ArbreBST arbreBST;

    public static void main(String[] args){
        PApplet.main("EstructuresDeDades.MainArbreBST");
    }

    public void settings(){
        size(1400, 800);
    }

    public void setup(){
        arbreBST = new ArbreBST();
        for(int t=0; t<10; t++){    // Creació arbre (sense repetits)
            int nr = (int) random(0, 100);
            arbreBST.addElement(nr);
        }
    }

    public void draw(){
        background(255);
        arbreBST.display(this, arbreBST.arrel, width/2, 100, 50, 0);
    }

    public void keyPressed() {
        arbreBST = new ArbreBST();
        for(int t=0; t<10; t++){    // Creació arbre (sense repetits)
            int nr = (int) random(0, 100);
            arbreBST.addElement(nr);
        }
    }
}
