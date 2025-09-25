package POO.SimulacioMemoriaRAMSwapping;

import processing.core.PApplet;

public class Memory {

    // Atributs o propietats
    int mida;
    Proces[] procesos;
    int numProcesos;
    int freeAddress;

    // Constructor
    Memory(int m){
        this.mida = m;
        this.procesos = new Proces[100];
        this.numProcesos = 0;
        this.freeAddress = 0;
    }

    // Altres mètodes

    void display(PApplet p5){

        p5.stroke(0); p5.strokeWeight(3); p5.fill(220);
        p5.rect(100, 100, mida, 300);

        p5.fill(0); p5.textSize(20); p5.textAlign(p5.LEFT);
        p5.text("Memòria RAM", 100, 60);
        p5.text("Total: "+this.mida, 100, 400);
        //p5.text("Memoria ocupada: ", x);


        for(int i=0; i<procesos.length; i++){
            if(procesos[i] != null) {
                procesos[i].display(p5, 100, 100, 300);
            }
        }
    }

    float calcularMemoriaOcupada(){
        float memoriaOcupada = 0;
        for(int i=0; i<procesos.length; i++){
            if(procesos[i] != null){
                memoriaOcupada += procesos[i].mida;
            }
        }
        return memoriaOcupada;
    }
    void swapIn(Proces p){
        if(freeAddress+p.mida < mida){
            procesos[numProcesos] = p;
            numProcesos++;
            p.setAddress(freeAddress);
            freeAddress += p.mida;
        }else{
            System.out.println("ERROR de SWAP IN del procés "+p.nom+".");
        }
    }

    void swapOut(Proces p){
        for(int i=0; i<numProcesos; i++){
            if(procesos[i] == p){
                procesos[i] = null;
                numProcesos--;
                System.out.println("SWAPPED OUT "+p.nom);

            }

        }
    }
}
