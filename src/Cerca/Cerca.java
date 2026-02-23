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
        System.out.printf("Posició de %d dins l'array a: %d.\n\n", 7, cercaLinealOrdenada(b, 7));

        System.out.println("CERCA BINÀRIA / DICOTÒMICA (ordenat).");
        System.out.printf("Posició de %d dins l'array a: %d.\n", 5, cercaBinaria(b, 5, 0, b.length-1));
        System.out.printf("Posició de %d dins l'array a: %d.\n", 7, cercaBinaria(b, 7, 0, b.length-1));

        System.out.println("CERCA BINÀRIA / DICOTÒMICA RECURSIVA (ordenat).");
        System.out.printf("Posició de %d dins l'array a: %d.\n", 5, cercaBinariaR(b, 5, 0, b.length-1));
        System.out.printf("Posició de %d dins l'array a: %d.\n", 7, cercaBinariaR(b, 7, 0, b.length-1));

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

    public static int cercaBinaria(int[] a, int v, int bot, int top){   // cerca dicotòmica
        while(bot<=top){
            int middle = (bot+top)/2;
            if(a[middle]==v){
                return middle;
            }
            else if(a[middle] > v){
                top = middle-1;
            }
            else if(a[middle] < v){
                bot = middle+1;
            }
        }
        return -1;
    }
    public static int cercaBinariaR(int[] a, int v, int bot, int top){   // cerca dicotòmica recursiva
        if(bot<=top){
            int middle = (bot+top)/2;
            if(a[middle]==v){
                return middle;  // cas base
            }
            else if(a[middle] > v){
                return cercaBinariaR(a, v, bot, middle-1); // cridada recursiva 1
            }
            else if(a[middle] < v){
                return cercaBinariaR(a, v, middle+1, top); // cridada recursiva 2
            }
        }
        return -1;
    }
}