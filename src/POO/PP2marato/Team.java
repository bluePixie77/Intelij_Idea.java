package POO.PP2marato;

public class Team {

    // Atributs o propietats
    private String name;
    private Runner[] runners;
    private int numRunners;
    private boolean international;

    // Constructor
    public Team(String name, boolean international){
        this.name = name;
        this.runners = new Runner[6];
        this.numRunners = 0;
        this.international = international;
    }

    // Setters
    public void setName(String name) {this.name = name;}
    public void setRunners(Runner[] runners) {this.runners = runners;}
    public void setNumRunners(int numRunners) {this.numRunners = numRunners;}
    public void setInternational(boolean international) {this.international = international;}

    // Getters
    public String getName() {return name;}
    public Runner[] getRunners() {return runners;}
    public int getNumRunners() {return numRunners;}
    public boolean isInternational() {return international;}

    // Altres mètodes
    public void addRunner(Runner runner){
        this.runners[numRunners] = runner;
        numRunners++;
    }
    public float averageTimes(){
        if(numRunners==0){return 0;}
        float sumaTime = 0; float numTiempos = 0;
        for(int i=0; i<numRunners; i++){
            float averageRunner = runners[i].averageTimes();
            if (averageRunner > 0.0f) {
                sumaTime += averageRunner;
                numTiempos++;
            }
        }
        return sumaTime/numTiempos;
    }
    public boolean areAllProfessional(){
        if(numRunners==0){return false;}
        for(int i=0; i<numRunners; i++){
            if(runners[i].isProfessional()){return true;}
        }
        return false;
    }
    public int getNumProfessionals(){
        if(areAllProfessional()){return numRunners;}
        int numProfessionals = 0;
        for(int i=0; i<numRunners; i++){
            if(runners[i].isProfessional()){
                numProfessionals++;
            }
        }
        return numProfessionals;
    }
}
