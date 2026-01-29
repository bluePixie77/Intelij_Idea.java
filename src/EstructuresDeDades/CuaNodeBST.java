package EstructuresDeDades;
import processing.core.PApplet;

public class CuaNodeBST {

    NodeBST[] array;
    int last;

    public CuaNodeBST(){
        array = new NodeBST[10];
        last = -1;
    }

    public void encola(NodeBST n){
        array[last + 1] = n;
        last++;
    }

    public NodeBST desencola(){
        NodeBST temp = array[0];
        for(int i=1; i<=last; i++){
            array[i-1] = array[i];
        }
        last--;
        return temp;
    }

    public boolean isEmpty(){
        return last == -1;
    }

    public boolean isFull(){
        return last == array.length-1;
    }

    public int numElements(){
        return last + 1;
    }
}


