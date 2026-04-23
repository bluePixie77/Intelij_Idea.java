package Vocabulari.POO;

public class ParkingB {

    // COMPOSICIÓ: atributs d'una altra classe creats dins aquesta classe
    Vehicle[] vehicles;
    int numVehicles; // Contador (habitual en arrays, estructures estàtiques)

    public ParkingB(Vehicle[] vehicles) {
        vehicles = new Vehicle[10];
    }

    public ParkingB(Vehicle[] vehicles, int numPlaces){
        vehicles = new Vehicle[numPlaces];
        numVehicles = 0;
    }

    // MÈTODE DE COMPOSICIÓ dels vehicles (que cream aquí) al parking.
    // Es passen com a paràmetres els atributs necessaris per crear l'objecte
    public void addMoto(String matricula, int nR, int cilindrada){
        Vehicle v = new Moto(matricula, nR, cilindrada);
        vehicles[numVehicles] = v;
        numVehicles++;
    }

    public void print(){}
}
