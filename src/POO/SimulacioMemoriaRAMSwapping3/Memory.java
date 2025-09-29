package POO.SimulacioMemoriaRAMSwapping3;
import processing.core.PApplet;

public class Memory {

    // Atributs o propietats
    int mida;
    Proces[] procesos;
    int numProcesos;

    Hole[] holes;
    int numHoles;

    // Constructor
    Memory(int m){
        this.mida = m;
        this.procesos = new Proces[100];
        this.numProcesos = 0;

        this.numHoles = 0;
        holes = new Hole[100];
        addHole(0, this.mida);
    }

    // Altres mètodes
    void display(PApplet p5){
        p5.stroke(0); p5.strokeWeight(3); p5.fill(220);
        p5.rect(100, 100, mida, 300);

        p5.fill(0); p5.textSize(20); p5.textAlign(p5.LEFT);
        p5.text("Memòria RAM", 100, 60);
        p5.text("Total: "+this.mida, 100, 400);

        int mO = calcularMemoriaOcupada();
        p5.text("Memòria Ocupada: "+mO, 100, 540);

        int mLl = mida - mO;
        p5.text("Memòria Lliure: "+mLl, 100, 500);

        int nP = numProcessos();
        p5.text("Num Procesos Actius: "+nP, 100, 620);

        int nF = numForats();
        p5.text("Num Forats: "+nF, 100, 660);

        for(int i=0; i<procesos.length; i++){
            if(procesos[i] != null) {
                procesos[i].display(p5, 100, 100, 300);
            }
        }
    }

    int calcularMemoriaOcupada(){
        int memoriaOcupada = 0;
        for(int i=0; i<procesos.length; i++){
            if(procesos[i] != null){
                memoriaOcupada += procesos[i].mida;
            }
        }
        return memoriaOcupada;
    }

    void swapIn(Proces p){
        boolean swapped = false;
        for(int i=0; i<numHoles && !swapped; i++){
            if(holes[i]!=null && holes[i].mida>=p.mida){
                int espaiRestant = holes[i].mida - p.mida;
                procesos[numProcesos] = p;
                procesos[numProcesos].setAddress(holes[i].address);
                numProcesos++;
                swapped = true;
                System.out.println("SWAPPED IN " + p.nom);

                holes[i].address = holes[i].address + p.mida;
                holes[i].mida = espaiRestant;
                if(holes[i].mida == 0){
                    holes[i] = null;
                    System.out.println("Hole Removed");
                }
            }
        }
        if(!swapped){
            System.out.println("Error SWAP IN del procés "+p.nom);
        }
    }

    void swapOut(Proces p){
        for(int i=0; i<numProcesos; i++){
            if(procesos[i] == p){
                addHole(p.address, p.mida);
                procesos[i] = null;
                // numProcesos--;
                System.out.println("SWAPPED OUT "+p.nom);
            }
        }
    }

    int numProcessos(){     // no necessari pq tenim variable numProcessos, però per practicar
        int numProcesos = 0;
        for(int i=0; i<procesos.length; i++){
            if(procesos[i] != null){
                numProcesos++;
            }
        }
        return numProcesos;
    }

    void addHole(int address, int mida){
        holes[numHoles] = new Hole(address, mida);
        numHoles++;
        System.out.println("New Hole");
    }

    int numForats(){
        int nF = 0;
        for(int i=0; i<holes.length; i++){
            if(holes[i] != null){
                nF++;
            }
        }
        return nF;
    }

    public void compactaForats(int n1, int n2){
        if(holes[n1].address < holes[n2].address){
            holes[n1].mida += holes[n2].mida;
            holes[n2] = null;
        }else{
            holes[n2].mida += holes[n1].mida;
            holes[n1] = null;
        }
    }
}
