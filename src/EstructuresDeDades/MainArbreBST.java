package EstructuresDeDades;

import processing.core.PApplet;

public class MainArbreBST extends PApplet {

    // Atributs o propietats
    ArbreBST arbreBST;
    int vMax, vMin, valorCerca;
    boolean resultatCerca;

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
        vMax = arbreBST.getMaxim();
        vMin = arbreBST.getMinim();
        valorCerca = (int) random(0, 100);
        resultatCerca = arbreBST.cercaElement(valorCerca, arbreBST.arrel);
    }

    public void draw(){
        background(255);
        arbreBST.display(this, arbreBST.arrel, width/2, 100, 50, 0);
        fill(0); textSize(18); textAlign(LEFT);
        text("MAX: " +vMax, 100, 100);
        text("MIN: " +vMin, 100, 120);
        text("CERCA: " +valorCerca+"Resultat: "+resultatCerca, 100, 140);

    }

    public void keyPressed() {
        if(key=='a' || key== 'A'){
            arbreBST = new ArbreBST();
            for(int t=0; t<10; t++){    // Creació arbre (sense repetits)
                int nr = (int) random(0, 100);
                arbreBST.addElement(nr);
            }
            vMax = arbreBST.getMaxim();
            vMin = arbreBST.getMinim();
        }
        else if(key=='c' || key== 'c'){
            valorCerca = (int) random(0, 100);
            resultatCerca = arbreBST.cercaElement(valorCerca, arbreBST.arrel);
        }
    }
}
