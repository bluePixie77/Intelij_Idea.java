package Activitatsbasiques.Xarxes;

import java.util.Scanner;

public class CodiCesar {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter shift: ");
        int shift = input.nextInt();
        String original = "HOLA QUE TAL CESAR!";

        String xifrat = xifrar(original, shift);

        System.out.printf("Missatge original: %s\n", original);
        System.out.printf("Missatge xifrat: %s\n", xifrat);
        System.out.printf("Missatge desxifrat: %s\n", xifrar(xifrat, -shift));
    }

    // final (és una CONSTANT, no variable)
    public static final char[] ALPHABET26 = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N',
            'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    public static char xifrar(char c, int shift){
        int pos = -1;
        for(int i=0; i<ALPHABET26.length; i++){
            if(ALPHABET26[i]==c){
                pos = i;
            }

        }
        if(pos>=0) {
            int shiftPos = (pos + shift);

            // me pas per la dreta
            if(shiftPos>=ALPHABET26.length){
                shiftPos = shiftPos % ALPHABET26.length;
            }
            // estic a la meitat de l'array
            else if(shiftPos>=0 && shiftPos<ALPHABET26.length){
                shiftPos = shiftPos;
            }
            // me pas per l'esquerra
            else if(shiftPos<0){
                shiftPos = ALPHABET26.length + shiftPos;
            }

            return ALPHABET26[shiftPos];
        }else{
            return c;
        }
    }

    public static String xifrar(String original, int shift){
        String xifrat = "";
        for(int i=0; i<original.length(); i++){  // .length (ARRAY: propietat) / .length() (STRING: mètode o funció)
            xifrat += xifrar(original.charAt(i), shift);
        }
        return xifrat;
    }
}
