package POO.SimulacioMemoriaRAMSwapping3;
import processing.core.PApplet;

public class Main3 extends PApplet {
    public static void main(String[] args) {
        PApplet.main("POO.SimulacioMemoriaRAMSwapping3.Main3");
    }

    // Atributs
    Proces p0, p1 , p2, p3, p4, p5;
    Memory memory;

    public void settings(){
        size(1400, 800);
    }

    public void setup(){
        memory = new Memory(1024);

        p0 = new Proces("SO", color(0, 0, 255), 512);
        p1 = new Proces("P1", color(255, 0, 0), 64);
        p2 = new Proces("P2", color(255, 255, 0), 128);
        p3 = new Proces("P3", color(255, 0, 255), 256);
        p4 = new Proces("P4", color(0, 255, 255), 64);
        p5 = new Proces("P5", color(155, 255, 60), 128);

        memory.swapIn(p0);
    }

    public void draw(){
        background(255);
        memory.display(this);
        if(frameCount == 100){
            memory.swapIn(p1);
        }
        else if(frameCount == 200){
            memory.swapIn(p2);
        }
        else if(frameCount == 300){
            memory.swapIn(p3);
        }
        else if(frameCount == 400){
            memory.swapOut(p1);
        }
        else if(frameCount == 500){
            memory.swapIn(p4);
        }
        else if(frameCount == 600){
            memory.swapOut(p3);
        }
        else if(frameCount == 700){
            memory.swapIn(p5);
        }
    }

    public void keyPressed(){
        if(key == 'c' || key== 'C'){
            memory.compacta();
        }
    }
}
