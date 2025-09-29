package Activitatsbasiques.Xarxes;

public class CompressioText {
    public static void main(String[] args) {
        String originalText = "ABCCCCCCC DEF GGGGGG ZUQ";
        String zipped = zipText(originalText);
        System.out.printf("Zipped Message: %s.\n", zipped);
        String unzipped = unzipText(zipped);
        System.out.printf("Unzipped Message: %s.\n", unzipped);
    }

    public static String zipText(String original){
        String zipped = "";
        int index = 0; int count = 0;
        while(index<original.length()) {
            char currentChar = original.charAt(index);

            // Si és el darrer caràcter del text, no hi ha següent (nextChar)
            if (index == original.length() - 1) {
                zipped += currentChar;
                index++;
            }
            // Si no és el darrer caràcter del text, ho ha següent (nextChar)
            else {
                char nextChar = original.charAt(index+1);


                if (currentChar != nextChar) {
                    zipped += currentChar;
                    index++;
                } else {
                    while (nextChar == currentChar) {
                        count++;
                        nextChar = original.charAt(index + count);
                    }
                    zipped += currentChar + String.valueOf(count);
                    index += count;
                    count = 0;
                }
            }
        }

        return zipped;
    }

    public static String unzipText(String zipped){
        String unzipped = "";
        int index = 0;

        // Mentre no arribem al final del text
        while(index<zipped.length()){

            char currentChar = zipped.charAt(index);

            // Si és el darrer caràcter del text, no hi ha següent (nextChar)
            if(index == zipped.length()-1){
                unzipped += currentChar;
                index++;
            }
            // Si no és el darrer caràcter del text, hi ha següent (nextChar)

            else{
                char nextChar = zipped.charAt(index+1);

                // Si és un número ('0'-'9')
                if(Character.isDigit(nextChar)){
                    int times = Character.getNumericValue(nextChar);
                    for(int t=0; t<times; t++){
                        unzipped += currentChar;
                    }
                    index += 2;
                }
                // Si no és un número
                else{
                    unzipped += currentChar;
                    index++;
                }
            }


        }
        return unzipped;
    }

}
