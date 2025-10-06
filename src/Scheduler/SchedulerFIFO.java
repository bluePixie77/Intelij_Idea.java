package Scheduler;

public class SchedulerFIFO extends Scheduler{

    // Constructor
    public SchedulerFIFO(){
        super();
        setPolitica(POLITICA.FIFO);
    }

    public Proces getCurrentProces(){ return procesos[0]; }
}
