package Vocabulari.POO;

public class ParkingA {

    // AGREGACIÓ: atributs d'una altra classe ja creats
    Vehicle[] vehicles;
    int numVehicles; // Contador (habitual en arrays, estructures estàtiques)

    public ParkingA(Vehicle[] vehicles) {
        vehicles = new Vehicle[10];
    }

    public ParkingA(Vehicle[] vehicles, int numPlaces){
        vehicles = new Vehicle[numPlaces];
        numVehicles = 0;
    }

    // MÈTODE D'AGREGACIÓ dels vehicles (ja creats) al parking
    public void addVehicle(Vehicle v){ // DEPENDÈNCIA: paràmetres o tipus de retorn d'una altra classe
        vehicles[numVehicles] = v;
        numVehicles++;
    }

    // Exemple dependència quan una classe té PARÀMETRES en un mètode d'una altra classe
    public boolean mesGran(ParkingB altreParking){
        return this.vehicles.length > altreParking.vehicles.length;
    }

    // Exemple dependència quan una classe té un mètode amb TIPUS DE RETORN d'una altra classe
    public ParkingB converteix(){
        ParkingB pB = new ParkingB(vehicles);
        for(int i = 0; i < numVehicles; i++){
            String matricula = vehicles[i].matricula;
            int nR = vehicles[i].numRodes;
            int cilindrada = ((Moto)vehicles[i]).getCilindrada();
            pB.addMoto(matricula, nR, cilindrada);
        }
        return pB;
    }

    // POLIMORFISME: Un mètode amb una signatura i paràmetres iguals (mateixa cridada) que existeix en múltiples clases
    // i pot cridar-se per aquestes diferentes clases
    public void print(){}

}
