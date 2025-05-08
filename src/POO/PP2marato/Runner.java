package POO.PP2marato;

public class Runner {

    // Atributs o propietats
    private String name;
    private String team;
    private String[] raceIDs;
    private float[] times;
    private int numRaces;
    private boolean professional;

    // Constructor
    public Runner(String name){
        this.name = name;
        this.team = "Sense Equip";
        this.professional = false;
        this.numRaces = 0;
        this.raceIDs = new String[5];
        this.times = new float[5];
    }
    public Runner(String name, String team, boolean professional){
        this.name = name;
        this.team = team;
        this.professional = professional;
        this.numRaces = 0;
        this.raceIDs = new String[5];
        this.times = new float[5];
    }

    // Setters
    public void setName(String name) {this.name = name;}
    public void setTeam(String team) {this.team = team;}
    public void setRaceIDs(String[] raceIDs) {this.raceIDs = raceIDs;}
    public void setTimes(float[] times){this.times = times;}
    public void setNumRaces(int numRaces) {this.numRaces = numRaces;}
    public void setProfessional(boolean professional) {this.professional = professional;}

    // Getters
    public String getName() {return name;}
    public String getTeam() {return team;}
    public String[] getRaceIDs() {return raceIDs;}
    public float[] getTimes() {return times;}
    public int getNumRaces() {return numRaces;}
    public boolean isProfessional() {return professional;}

    // Altres mètodesR
    public void addRace(String raceID) {
        if (numRaces < raceIDs.length) {
            raceIDs[numRaces] = raceID;
            numRaces++;
        }
    }
    public void addTime(float time) {
        if (numRaces > 0 && numRaces - 1 < times.length) {
            times[numRaces - 1] = time;
        }
    }
    public float bestTime() {
        if (numRaces == 0) return 0.0f;
        float bTime = Float.MAX_VALUE;
        for (int i = 0; i < numRaces; i++) {
            if (times[i] > 0.0f && times[i] < bTime) {
                bTime = times[i];
            }
        }
        if (bTime == Float.MAX_VALUE) return 0.0f;
        return bTime;
    }
    public String bestRace() {
        float bTime = bestTime();
        if (bTime == 0.0f) return null;
        for (int i = 0; i < numRaces; i++) {
            if (times[i] == bTime) {
                return raceIDs[i];
            }
        }
        return null;
    }
    public float averageTimes() {
        float sumaTime = 0.0f;
        int count = 0;
        for (int i = 0; i < numRaces; i++) {
            if (times[i] > 0.0f) {
                sumaTime += times[i];
                count++;
            }
        }
        if (count == 0) return 0.0f;
        return sumaTime / count;
    }
}

    /*public void addRace(String raceID){
        this.raceIDs[numRaces] = raceID;
        numRaces++;
    }

    public void addTime(float time){
        for(int i = 0; i< times.length; i++){
            if(raceIDs != null && times[i]== 0){
                times[i] = time;
                break;
            }
        }
    }
    public float bestTime(){
        float bTime = 0;
        for(int i=0; i<numRaces; i++){
            if(times[i]<bTime){
                bTime = times[i];
            }
        }
        return bTime;
    }
    public float averageTimes(){
        float sumaTime = 0;
        for(int i=0; i<times.length; i++){
            sumaTime += times[i];
        }
        if(numRaces==0){return 0;}
        return sumaTime/numRaces;
    }
    public String bestRace(){
        float bTime = bestTime(); String bRace = null;
        if(numRaces==0){return null;}
        for(int i=0; i<numRaces; i++){
            if(bTime==times[i]){
                bRace = raceIDs[i]; break;
            }
        }
        return bRace;
    } */

