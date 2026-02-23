package Herencia.llistesAbstractes;

import java.util.LinkedList;

public class MainLinkedList {

    public static void main(String[] args) {

        // Declaració de llista de Nodes
        LinkedList<Integer> llistaNums; // Integer és una classe, int és un tipus bàsic
        LinkedList<Character> llistaLletres;
        int[] array;

        // Creació o instanciació
        llistaNums = new LinkedList<>(); // = llistaNums = new ArrayList<Integer>();
        llistaLletres = new LinkedList<>();
        array = new int[10];

        // Afegir elements, addElement
        llistaNums.add(22);
        llistaNums.add(13);
        llistaLletres.add('A');
        array[0] = 7;

        // mètode isEmpty()
        boolean esBuida = llistaNums.isEmpty();

        // numElements, mida dinàmica de la llista
        int num = llistaNums.size();

        // removeElement (o posició o objecte)
        llistaNums.remove(0);

        // Consultar objecte d'una posició (no es borra)
        int primer = llistaNums.get(0);

        // Recórrer l'array
        for(int i=0; i<llistaNums.size(); i++){ // llistaNums.size() = array.length()
            System.out.print(llistaNums.get(i)+ ", ");
        }

        for(Integer i : llistaNums){
            System.out.print(i + ", ");
        }

    }

}
