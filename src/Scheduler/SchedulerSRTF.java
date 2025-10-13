package Scheduler;

public class SchedulerSRTF extends Scheduler{

    // Constructor
    public SchedulerSRTF(){
        super();                    // Cridada constructor de la classe de la qual hereda
        setPolitica(POLITICA.SRTF);
    }

    public Proces getCurrentProces(){ return getShortestRemainingProces(); }

    public Proces getShortestRemainingProces(){  // EXAMEN
        Proces shortest = null;
        int minCicles = Integer.MAX_VALUE;
        for(int i=0; i<numProcesos; i++){
            if(procesos[i].numPendingCicles< minCicles){
                minCicles = procesos[i].numPendingCicles;
                shortest = procesos[i];
            }
        }
        return shortest;
    }
}
