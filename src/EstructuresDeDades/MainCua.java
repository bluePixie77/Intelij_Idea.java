package EstructuresDeDades;

import processing.core.PApplet;

public class MainCua extends PApplet{

    Cua c;
    int lastIn = -1;
    int lastOut = -1;

    public static void main(String[] args) {
        PApplet.main("EstructuresDeDades.MainCua");
    }

    public void settings(){
        size(1600, 800);
    }

    public void setup(){
        c = new Cua();
    }

    public void draw(){
        background(100, 255, 100);
        c.display(this, 100, 200);

        textSize(54); textAlign(LEFT);
        text("CUA (QUEUE)", 100, 400);

        textSize(34);
        text("Núm. Elements: "+c.numElements(), 100, 500);
        text("Empty: "+c.isEmpty(), 100, 550);
        text("Full: "+c.isFull(), 100, 600);
        text("Last Dequeued: "+lastOut, 100, 650);
        text("Last Enqueued: "+lastIn, 100, 700);
    }

    public void keyPressed(){

        if(key=='a' || key=='A'){
            if(!c.isFull()) {
                lastIn = (int) random(0, 100);
                c.encola(lastIn);
                println("ENQUEUE: " + lastIn);
            }
            else {
                println("NO ENQUEUE, Queue is full!!");
            }
        }
        else if(key=='r' || key=='R'){
            if(!c.isEmpty()) {
                lastOut = c.desencola();
                println("DEQUEUE: " + lastOut);
            }
            else {
                println("NO DEQUEUE, Queue is empty!!");
            }
        }
    }

}
