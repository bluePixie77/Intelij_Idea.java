package POO.triangle.people;

public class MainPersona {
    public static void main(String[] args) { // HERÈNCIA (extends)
        // Declaració variables Persona
        Persona p1, p2;
        // Declaració variables Alumne
        Alumne a1, a2;
        //
        Professor pr1, pr2;
        //
        Jugador j1, j2;

        // Instanciació d'objectes de cada classe
        p1 = new Persona("Joan", 30, Persona.SEXE.HOME);
        p2 = new Persona("Noah", 26, Persona.SEXE.ALTRE);
        //
        a1 = new Alumne("Pere", 15, Persona.SEXE.HOME, 1, 'A');
        a2 = new Alumne("Maria", 16, Persona.SEXE.DONA, 2, 'B');
        //
        pr1 = new Professor("Manel", 50, Persona.SEXE.HOME, 28, "física");
        pr2 = new Professor("Carme", 50, Persona.SEXE.DONA, 28, "català");
        //
        j1 = new Jugador("Toni", 18, Persona.SEXE.HOME, "FCB", 20, Jugador.POSICIO.DAVANTER);

        // Cridada al mètode print() dels objectes Alumne
        a1.print(); a2.print();
        //
        p1.print(); p2.print();
        //
        pr1.print(); pr2.print();
        //
        j1.print();
    }
}
