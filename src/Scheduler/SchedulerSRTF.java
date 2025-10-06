package Scheduler;

public class SchedulerSRTF extends Scheduler{

    // Constructor
    public SchedulerSRTF(){
        super();
        setPolitica(POLITICA.SJF);
    }

    public Proces getCurrentProces(){ return getShortestProces(); }

    public Proces getShortestProces(){  // EXAMEN
        Proces shortest = null;
        int minCicles = Integer.MAX_VALUE;
        for(int i=0; i<numProcesos; i++){
            if(procesos[i].numCiclesCPU< minCicles){
                minCicles = procesos[i].numPendingCicles;
                shortest = procesos[i];
            }
        }
        return shortest;
    }
}
