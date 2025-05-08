package POO.PP2marato;

public class Race {

    // Atributs o propietats
    private String raceID;
    private Runner[] runners;
    private float[] times;
    private boolean isFinals;
    private int numRunners;
    private float classificationTime;

    // Constructors
    public Race(String raceID){
        this.raceID = raceID;
        this.runners = new Runner[8];
        this.times = new float[8];
        this.isFinals = false;
        this.classificationTime = 0;
        this.numRunners = 0;
    }
    public Race(String raceID, boolean isFinals, float classTime){
        this.raceID = raceID;
        this.runners = new Runner[8];
        this.times = new float[8];
        this.isFinals = isFinals;
        this.classificationTime = classTime;
        this.numRunners = 0;
    }

    // Setters
    public void setRaceID(String raceID) {this.raceID = raceID;}
    public void setRunners(Runner[] runners) {this.runners = runners;}
    public void setTimes(float[] times) {this.times = times;}
    public void setFinals(boolean finals) {isFinals = finals;}
    public void setNumRunners(int numRunners) {this.numRunners = numRunners;}
    public void setClassificationTime(float classTime) {this.classificationTime = classTime;}

    // Getters
    public String getRaceID() {return raceID;}
    public Runner[] getRunners() {return runners;}
    public float[] getTimes() {return times;}
    public boolean isFinals() {return isFinals;}
    public int getNumRunners() {return numRunners;}
    public float getClassificationTime() {return classificationTime;}

    // Altres mètodes
    public void addRunner(Runner r){
        this.runners[numRunners] = r;
        numRunners++;
    }



    public void addTimeToRunner(Runner r, float time){
        for(int i=0; i<numRunners; i++){
            if(runners[i]==r){
                times[i] = time; break;
            }
        }
    }
    public float bestTime() {
        if (numRunners == 0) return 0.0f;
        float bTime = Float.MAX_VALUE;
        for (int i = 0; i < numRunners; i++) {
            if (times[i] > 0.0f && times[i] < bTime) {
                bTime = times[i];
            }
        }
        if (bTime == Float.MAX_VALUE) return 0.0f;
        return bTime;
    }
    public String bestRunner() {
        float bTime = bestTime();
        if (bTime == 0.0f) return null;
        for (int i = 0; i < numRunners; i++) {
            if (times[i] == bTime) {
                return runners[i].getName();
            }
        }
        return null;
    }
    public float averageTimes(){
        float sumaTime = 0;
        for(int i=0; i<times.length; i++){
            sumaTime += times[i];
        }
        if(numRunners==0){return 0;}
        return sumaTime/numRunners;
    }
    public float differenceBestFromWorst(){
        float worstTime = 0;
        for(int i=0; i<numRunners; i++){
            if(times[i]>worstTime && times[i]!=0){
                worstTime = times[i];
            }
        }
        return worstTime - bestTime();
    }
}
