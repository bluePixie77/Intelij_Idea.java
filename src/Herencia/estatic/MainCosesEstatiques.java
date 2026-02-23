package Herencia.estatic;

public class MainCosesEstatiques {

    public static void main(String[] args){

        CosesEstatiques c1, c2;

        c1 = new CosesEstatiques(10, 20);
        c2 = new CosesEstatiques(15, 25); // valor de y es "tropitja": ara és 25

        System.out.println("X de C1: "+c1.x);
        System.out.println("X de C2: "+c2.x);
        System.out.println("Y de la classe: "+ CosesEstatiques.y); // accedim a y a través de la classe

        c1.hola();               // es crida a través d'un objecte
        CosesEstatiques.sHola(); // mètode comú de la classe
    }
}
