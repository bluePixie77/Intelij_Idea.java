package Activitatsbasiques;

import java.util.Scanner;

public class ACT19NPrimeresPotènciesDe2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = input.nextInt();

        int pot= 1;
        for(int i=1;i<=n; i++){
            pot*=2;
        }


        System.out.println("");
    }

}
