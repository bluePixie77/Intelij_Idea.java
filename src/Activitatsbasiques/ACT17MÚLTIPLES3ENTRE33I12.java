package Activitatsbasiques;

public class ACT17MÚLTIPLES3ENTRE33I12 {


        public static void main(String[] args) {

            // ACT. 17 -  Múltiples de 3 entre 33 i 12 (ordre descendent, sense -3)

            for (int i = 33; i >= 12; i--) {
                if (i % 3 == 0) {       //mod = %  (resto a la divisió)
                    System.out.println(i);
                }
            }

        }


}
