package POO.PP2marato;

public class MainRunners {
    // Declaració / Inicialització arrays
    public static Team[] allTeams = new Team[6];
    public static Race[] allRaces = new Race[10];
    public static Runner[] allRunners = new Runner[100];

    // Altres mètodes
    public static String bestProfessionalRunnerOfTeam(Team t){
        float best = Float.MAX_VALUE;
        String name = null;
        for (int i = 0; i<t.getNumRunners(); i++) {
            Runner r = t.getRunners()[i];
            if(r.isProfessional()){
                float time = r.bestTime();
                if (time != 0.0f && time < best) {
                    best = time;
                    name = r.getName();
                }
            }
        }
        return name;
    }

    public static String bestTeam(Team[] teams){
        float best = Float.MAX_VALUE;
        String name = null;
        for (int i = 0; i < teams.length; i++) {
            Team t = teams[i];
            if (t!=null && t.getNumRunners()>0) {
                float aTime = t.averageTimes();
                if (aTime != 0.0f && aTime < best) {
                    best = aTime;
                    name = t.getName();
                }
            }
        }
        return name;
    }

    public static Runner[] getClassifiedRunners(Race r, String nameTeam){
        Runner[] classified = new Runner[r.getNumRunners()];
        int numClassRunners = 0;
        for(int i=0; i<r.getNumRunners(); i++){
            Runner runner = r.getRunners()[i];
            float time = r.getTimes()[i];
            if (runner.getTeam().equals(nameTeam)) {
                if (time>0.0f && time<=r.getClassificationTime()) {
                    classified[numClassRunners] = runner;
                    numClassRunners++;
                }
            }
        }
        // Només classified runners
        Runner[] result = new Runner[numClassRunners];
        for(int i=0; i<numClassRunners; i++) {
            result[i] = classified[i];
        }
        return result;
    }
    public static void printClassifiedRunners(Race r, String nameTeam){
        Runner[] classificats = getClassifiedRunners(r, nameTeam);

        System.out.printf("Corredors classificats de l’equip %s a la carrera %s: \n", nameTeam, r.getRaceID());
        for(int i=0; i<classificats.length; i++){
            System.out.println(classificats[i].getName());
        }
    }

    public static boolean hasImproved(Runner r, Race[] races){
        float lastTime = 0;
        for (int i=0; i<r.getNumRaces(); i++) {
            String raceID = r.getRaceIDs()[i];
            float time = r.getTimes()[i];
            for(int j=0; j<races.length; j++) {
                Race race = races[j];
                if(race!=null && race.getRaceID().equals(raceID)) {
                    if (lastTime!=0 && time >= lastTime) {
                        return false;
                    }
                    lastTime = time; break;
                }
            }
        }
        return true;
    }

    public static boolean everClassified(Runner r, Race[] races){
        for (int i=0; i<r.getNumRaces(); i++) {
            String raceID = r.getRaceIDs()[i];
            float time = r.getTimes()[i];
            for (int j=0; j<races.length; j++) {
                Race race = races[j];
                if (race != null && race.getRaceID().equals(raceID)) {
                    if (time>race.getClassificationTime() || time==0) {
                        return false;
                    }
                    break;
                }
            }
        }
        return true;
    }

    public static float avgNumRunners(Race[] races){
        int total=0; int count=0;
        for(int i=0; i<races.length; i++){
            Race race = races[i];
            if(race!=null) {
                total += race.getNumRunners();
                count++;
            }
        }
        return (float) total/count;
    }
    public static float avgTimesRaces(Race[] races){
        float total=0; int count=0;
        for(int i=0; i<races.length; i++){
            Race race = races[i];
            if(race!=null && race.getNumRunners()>0){
                total += race.averageTimes();
                count++;
            }
        }
        return total/count;
    }
    public static String[] racesWhereWinnerIsNotProfessional(Race[] races) {
        String[] r = new String[races.length];
        int numNClassRunners = 0;
        for(int i = 0; i < races.length; i++){
            Race race = races[i];
            if(race!=null && race.getNumRunners()>0){
                int bRunner = 0;
                float bestTime = race.getTimes()[0];
                for(int j = 1; j < race.getNumRunners(); j++){
                    if(race.getTimes()[j] < bestTime){
                        bestTime = race.getTimes()[j];
                        bRunner = j;
                    }
                }
            }
        }
        // Only not professional classified runners
        String[] result = new String[numNClassRunners];
        for(int i=0; i<numNClassRunners; i++){
            result[i] = r[i];
        }
        return result;
    }

    public static void main(String[] args) {
        // 5 objectes runner
        allRunners[0] = new Runner("Paco");
        allRunners[1] = new Runner("Bel", "Equip B", true);
        allRunners[2] = new Runner("Neus", "Equip A", false);
        allRunners[3] = new Runner("Xisca", "Equip C", true);
        allRunners[4] = new Runner("Lluís");

        // Assignar valors a les propietats team i professional
        allRunners[0].setTeam("Equip A");
        allRunners[0].setProfessional(true);
        allRunners[4].setTeam("Equip B");
        allRunners[4].setProfessional(false);
        allRunners[2].setTeam("Equip C");

        // Crear carreres i temps
        allRunners[0].addRace("Palma");
        allRunners[0].addTime(12.5f);
        allRunners[1].addRace("Manacor");
        allRunners[1].addTime(14f);
        allRunners[1].addRace("Palma");
        allRunners[1].addTime(13f);
        allRunners[2].addRace("Manacor");
        allRunners[2].addTime(10f);
        allRunners[3].addRace("Palma");
        allRunners[3].addTime(19f);
        allRunners[4].addRace("Muro");
        allRunners[4].addTime(14f);

        // bestRace i bestTime de cada corredor
        Runner r1 = allRunners[0];
        System.out.printf("Millor carrera de %s va ser a %s amb temps %.2f.\n",
                           r1.getName(), r1.bestRace(), r1.bestTime());
        Runner r2 = allRunners[1];
        System.out.printf("Millor carrera de %s va ser a %s amb temps %.2f.\n",
                           r2.getName(), r2.bestRace(), r2.bestTime());
        Runner r3 = allRunners[2];
        System.out.printf("Millor carrera de %s va ser a %s amb temps %.2f.\n",
                           r3.getName(), r3.bestRace(), r3.bestTime());
        Runner r4 = allRunners[3];
        System.out.printf("Millor carrera de %s va ser a %s amb temps %.2f.\n",
                           r4.getName(), r4.bestRace(), r4.bestTime());
        Runner r5 = allRunners[4];
        System.out.printf("Millor carrera de %s va ser a %s amb temps %.2f.\n",
                           r5.getName(), r5.bestRace(), r5.bestTime());


        // Instanciació 3 objectes Team
        allTeams[0] = new Team("Equip A", true);
        allTeams[1] = new Team("Equip B", false);
        allTeams[2] = new Team("Equip C", true);

        // addRunner a Teams
        allTeams[0].addRunner(allRunners[0]);
        allTeams[1].addRunner(allRunners[1]);
        allTeams[0].addRunner(allRunners[2]);
        allTeams[2].addRunner(allRunners[3]);
        allTeams[1].addRunner(allRunners[4]);

        // Average Times
        Team t1 = allTeams[0];
        System.out.printf("Temps mig de l'equip %s és %.2f. \n", t1.getName(), t1.averageTimes());
        Team t2 = allTeams[1];
        System.out.printf("Temps mig de l'equip %s és %.2f. \n", t2.getName(), t2.averageTimes());
        Team t3 = allTeams[2];
        System.out.printf("Temps mig de l'equip %s és %.2f. \n", t3.getName(), t3.averageTimes());

        // NumProfessionals
        System.out.printf("L'equip %s té %d corredor/s professionals.\n", t2.getName(), t2.getNumProfessionals());

        // Instanciació 3 objectes Race
        allRaces[0] = new Race("Carrera 1", false, 13);
        allRaces[1] = new Race("Carrera 2");
        allRaces[2] = new Race("Carrera 3", true, 14.5f);

        // Corredors i temps a les carreres
        allRaces[0].addRunner(allRunners[0]);
        allRaces[0].addTimeToRunner(allRunners[0], 12.5f);
        allRaces[0].addRunner(allRunners[1]);
        allRaces[0].addTimeToRunner(allRunners[1], 13.2f);
        allRaces[0].addRunner(allRunners[2]);
        allRaces[0].addTimeToRunner(allRunners[2], 12.0f);
        allRaces[0].addRunner(allRunners[4]);
        allRaces[0].addTimeToRunner(allRunners[4], 11.7f);

        allRaces[1].addRunner(allRunners[0]);
        allRaces[1].addTimeToRunner(allRunners[0], 11.8f);
        allRaces[1].addRunner(allRunners[1]);
        allRaces[1].addTimeToRunner(allRunners[1], 12.9f);
        allRaces[1].addRunner(allRunners[3]);
        allRaces[1].addTimeToRunner(allRunners[3], 14.0f);

        // bestRunner i bestTime
        Race c1 = allRaces[0];
        System.out.printf("Millor corredor/a de la %s és %s amb temps %.2f. \n",
                           c1.getRaceID(), c1.bestRunner(), c1.bestTime());

        // bestProfessionalRunnerOfTeam
        System.out.printf("%s és el/la millor corredor/a de l'equip %s.\n",
                           bestProfessionalRunnerOfTeam(t1), t1.getName());
        System.out.printf("%s és el/la millor corredor/a de l'equip %s.\n",
                           bestProfessionalRunnerOfTeam(t2), t2.getName());

        // classifiedRunners
        printClassifiedRunners(allRaces[0], allTeams[0].getName());

        // bestTeam
        System.out.printf("%s és el millor equip.\n", bestTeam(allTeams));
    }
}
