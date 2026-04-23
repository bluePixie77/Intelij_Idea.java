package Vocabulari.POO;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args){

        System.out.println("NUM VEHICLES: "+Vehicle.comptador);

        Vehicle v = new Moto("IB4437CL", 4, 68);  // Casting ascendent o upcasting
        System.out.println(v);
        // CODI DE HASHING o HASH CODE: si toString() NO es troba modificat, s'indica la posició de l'objecte i codi de hashing aleatori

        // Accés a propietat NO estàtica de Vehicle (objecte.propietat)
        System.out.println(v.matricula);
        // Accés a propietat ESTÀTICA de Vehicle (classe.propietat)
        System.out.println("NUM VEHICLES: "+Vehicle.comptador);

        // Accés a mètode NO estàtica de Vehicle (objecte.mètode())
        System.out.println(v.getMatricula());
        // Accés a mètode ESTÀTIC de Vehicle (classe.mètode())
        System.out.println(Vehicle.sumaRodes());
                                   //    enumerat:classe.enum.opcioEnum
        Cotxe c = new Cotxe("0B15171XS", Cotxe.COMBUSTIBLE.ELECTRIC);

        // POLIMORFISME: classes diferents (normalment SUBCLASSES) criden al mateix mètode per a objectes de classes diferents
        v.print();
        c.print();

        Vehicle[] vehicles = new Vehicle[10];
        vehicles[0] = v;
        vehicles[1] = c;
        // POLIMORFISME (detecta quin tipus de print ha d'executar segons el tipus de Vehicle)
        for(int i = 0; i < 2; i++){
            vehicles[i].print();
        }

        // SENSE polimorfisme
        for(int i = 0; i < 2; i++){
            if(vehicles[i] instanceof Moto){
                ((Moto)vehicles[i]).printMoto();
            }
            else if(vehicles[i] instanceof Cotxe){
                ((Cotxe)vehicles[i]).printCotxe();
            }
        }

        // Instanciació de classe GENÈRICA
        PlaçaParking<Moto> pm = new PlaçaParking<>();
        pm.aparcar((Moto)v);

        PlaçaParking<Cotxe> pc = new PlaçaParking<>();
        pc.aparcar(c);


        // TADs (Tipus Abstracte de Dades) genèrics (ArrayList, LinkedList, Stack (push i pop), Queue (enqueue, dequeue...)
        // Coleccions:
        ArrayList<Vehicle> vs = new ArrayList<>(); // Creació o instanciació
        vs.add(v);   // Addició
        vs.add(c);
        System.out.println(vs.get(0)); // Accés
        System.out.println(vs.size()); // Mida

        LinkedList<String> noms = new LinkedList<>(); // Creació o instanciació
        noms.add("Paco");   // Addició
        noms.add("Pep");
        noms.add("Marta");
        System.out.println(noms.get(0)); // Accés
        System.out.println(noms.size()); // Mida

    }
}

/* VISIBILITAT DE PROPIETATS I MÈTODES
        - private
        + public
        # protected

     * ERRORS:
           -SINTÀCTIC: errada d'escriptura/ortografia informàtica
           -EXECUCIÓ:
                -ArrayIndexOutOfBounds: Accés a una casella d'un array no existent o que supera el límit
                -StackOverflow: Supera el límit de la pila (cridades recursives)
                -NullPointerException
                -DivisionByZero: Error de divisió amb 0

           -LÒGIC o DE DISENY: no es fa la funció correcta

     * ENVOLTORI (WRAP)
       Tipus bàsics --> Classes
       int              Integer
       float            Float

    *
    PARÀMETRE: en la signatura de la funció (quan es crea) --> void hola(String m){...}
    ARGUMENTS: en la cridada a la funció (quan s'usa)      --> hola("Paco");
                                                           --> hola(n);
    *
    VARIABLE
    CONSTANT

    *
    OVERLOAD: diferents versions de signatures (més o menys paràmetres)
    OVERRIDE: es modifica una classe heredada

    *
    TYPE CASTING: procés de conversió dels valors d'un tipus de dades a un altre tipus de dades
    - CASTING ASCENDENT
    - CASTING DESCENDENT (downcasting)
*/
