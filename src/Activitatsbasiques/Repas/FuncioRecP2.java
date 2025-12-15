package Activitatsbasiques.Repas;

public class FuncioRecP2 {
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
