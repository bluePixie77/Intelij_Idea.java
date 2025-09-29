package Activitatsbasiques.Xarxes;

import java.util.Scanner;

public class CodiCeasarAscii {
    // 65-90: Abecedari en majúscules
    // 97-122: Abecedari en minúscules

    public static void main(String[] args) {
        int shift = -5;
        String original = "Hola, que tal CESAR!";
        System.out.println("Missatge Original: "+ original);

        String xifrat = xifrar(original, shift);
        System.out.println("Missatge Xifrat: "+ xifrat);

        String desxifrat = desxifrar(xifrat, shift);
        System.out.println("Missatge Desxifrat: "+ desxifrat);
    }
    public static char xifrar(char c, int shift){

        // Letra majúscula 'A' - 'Z'
        if(Character.isLetter(c) && Character.isUpperCase(c)){
            int asciiCode = c;
            int shiftCode = asciiCode + shift;
            if(shiftCode>=65 && shiftCode<=90){
                return (char) shiftCode;
            }
            else if(shiftCode>90){
                shiftCode = 65 + ((shiftCode - 65) % 26);
                return (char) shiftCode;
            }
            else {
                shiftCode = (shiftCode - 65) + 91;
                return (char) shiftCode;
            }
        }
        // Letra minúscula 'a' - 'z'
        else if(Character.isLetter(c) && !Character.isUpperCase(c)) {
            int asciiCode = c;
            int shiftCode = asciiCode + shift;
            if(shiftCode>=97 && shiftCode<=122){
                return (char) shiftCode;
            }
            else if(shiftCode>122){
                shiftCode = 97 + ((shiftCode - 97) % 26);
                return (char) shiftCode;
            }
            else {
                shiftCode = (shiftCode - 97) + 123;
                return (char) shiftCode;
            }
        }
        // No lletra
        else {
            return c;
        }
    }
    public static String xifrar(String original, int shift){
        String xifrat="";
        for(int i=0; i<original.length(); i++){
            xifrat += xifrar(original.charAt(i), shift);
        }
        return xifrat;
    }
    public static String desxifrar(String xifrat, int shift){
        return xifrar(xifrat, -shift);
    }
}
