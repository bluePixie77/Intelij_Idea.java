package Herencia.abstracta;

public class MainAbstracta {

    public static void main(String[] args) {

        ClasseAbstracta ca;
        ClasseAbstracta.SubClasse1 sb1;

        // ca = new ClasseAbstracta("djsfksda") // ERROR: no es poden crear objectes de la classe abstracta
        sb1 = new ClasseAbstracta.SubClasse1("aa", 3);

    }
}
