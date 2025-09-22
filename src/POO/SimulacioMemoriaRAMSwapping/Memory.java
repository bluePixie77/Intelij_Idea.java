package POO.SimulacioMemoriaRAMSwapping;

public class Memory {

    // Atributs o propietats
    int mida;
    Proces[] procesos;
    int numProcesos;
    int freeAddress;

    // Constructor
    Memory(int m){
        this.mida = m;
        this.procesos = new Proces[100];
        this.numProcesos = 0;
        this.freeAddress = 0;
    }

    // Altres mètodes

}
