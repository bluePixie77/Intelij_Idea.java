package Vocabulari.POO;

// CLASSE GENÈRICA: funcionalitat d'una classe per diferents tipus de dades (convenció 'E'), permetent major flexibilitat
// a l'estructura estricta de Java

// Caràcters (ç) UNICODE admesos en Java, que és un llenguatge de programació universal
public class PlaçaParking<E> {

    E moto;

    public PlaçaParking(){
        this.moto = null;
    }

    public void aparcar(E m){
        this.moto = m;
    }

    public void desAparcar(E m){
        this.moto = null;
    }

    public boolean isFree(){
        return this.moto == null;
    }

}