package Scheduler;

import processing.core.PApplet;

public class Scheduler {
    enum POLITICA {FIFO, SJF, SRJF, RR}

    // Atributs o propietats
    POLITICA politica;
    String log;
    Proces[] procesos;      // Agregació o composició
    int numProcesos;
    int numCicles;


    // Contructor
    public Scheduler(){
        this.procesos = new Proces[10];
        this.numProcesos = 0;
        this.numCicles = 0;
        this.log = "";
        this.politica = POLITICA.FIFO;
    }

    // Setters
    public void setPolitica(POLITICA p){ this.politica = p; }

    // Altres mètodes

    public int getIndexProces(Proces p){
        return 0;
    }

    public Proces getCurrentProces(){
        return null;
    }

    public void display(PApplet p5,float x, float y, float s){

    }
    public void updateLog(Proces p){

    }
    public void enterProces(Proces p){  // enter = agregació
        if(numProcesos<procesos.length-1){
            procesos[numProcesos] = p;
            numProcesos++;
        }
    }

    public void exitProces(Proces p){

    }

    public void run(){

    }


}
