package Activitatsbasiques.Repas;

public class FuncioRecursivaP2 {
    public int alternateSum(int a, int b){
        if(a==0){
            return b;
        }else if(b==0){
            return a;
        }else{
            return a-b+alternateSum(a-1, b-1);
        }
    }

}
class Main {
    public static void main(String[] args) {
        for (int i = 0, j = 10; i <= 10 || j > i; i++, j--) {
            System.out.println(i + " - " + j);
        }
    }
}
