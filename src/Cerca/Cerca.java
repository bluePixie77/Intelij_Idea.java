package Cerca;

public class Cerca {

    public static void main(String[] args){

        int[] a = {4, 8, 1, 5, 9, 3};
        int[] b = {1, 3, 5, 8, 9, 13};

        System.out.println("CERCA LINEAL (NO ordenada).");
        System.out.printf("Posició de %d dins l'array a: %d.\n", 5, cercaLineal(a, 5));
        System.out.printf("Posició de %d dins l'array a: %d.\n\n", 5, cercaLineal(a, 7));

        System.out.println("CERCA LINEAL (ordenada).");
        System.out.printf("Posició de %d dins l'array a: %d.\n", 5, cercaLinealOrdenada(b, 5));
        System.out.printf("Posició de %d dins l'array a: %d.\n", 7, cercaLinealOrdenada(b, 7));

    }

    public static int cercaLineal(int[] a, int v){ // mètode de la classe, es pot usar sense crear objecte
        for(int i=0; i<a.length; i++){
            if(a[i]==v){
                return i;
            }
        }
        return -1;
    }
    public static int cercaLinealOrdenada(int[] a, int v){
        int i=0;
        while(i<a.length && a[i]<=v){
            if(a[i]==v){
                return i;
            }

            i++;
        }
        return -1;
    }
}
