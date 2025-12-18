package EstructuresDeDades;

import processing.core.PApplet;

public class MainLlistaNodes extends PApplet{

    // Objectes de la classe
    LlistaNodes llN;

    public static void main(String[] args){
        PApplet.main("EstructuresDeDades.MainLlistaNodes");
    }

    // Mètodes bàsics
    public void settings(){
        size(1600, 800);
    }
    public void setup(){
        llN = new LlistaNodes();

    }
    public void draw(){
        background(200);

        llN.display(this, 50, 120, 50);
    }
    public void keyPressed(){
        if(key=='a' || key=='A'){
            int n = (int)random(0,100);
            llN.append(n);
            println("APPEND del valor n: " + n);

        }else if(key=='p' || key=='P'){
            int n = (int)random(0,100);
            llN.preppend(n);
            println("PREPPEND del valor n: " + n);
        }else if(key=='i' || key=='I'){
            int i = (int) random(0, llN.numNodes);
            int n = (int)random(0,100);
            llN.insertAt(i, n);
            llN.preppend(n);
            println("INSERT de "+ n +" AT"+ i);
        }
    }
}
