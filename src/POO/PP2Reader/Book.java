package POO.PP2Reader;

public class Book {

    public enum Genre{NOVELA, POESIA, ECONOMIA}

    // Atributos o propiedades
    private String titol;
    private String autor;
    private String isbn;
    private Genre genre;
    private int numPagines;

    // Constructor(es)
    public Book(String titol, String autor, String isbn){
        this.titol = titol;
        this.autor = autor;
        this.isbn = isbn;
        this.genre = null;
        this.numPagines = -1;
    }
    public Book(String titol, String autor, String isbn, Genre genre, int nP){
        this.titol = titol;
        this.autor = autor;
        this.isbn = isbn;
        this.genre = genre;
        this.numPagines = nP;
    }

    // Getters (accesores)
    public String getTitol() {return titol;}

    public String getAutor() {return autor;}

    public String getIsbn() {return isbn;}

    public Genre getGenre() {return genre;}

    public int getNumPagines() {return numPagines;}


    // Setters (mutadores)
    public void setTitol(String titol){this.titol = titol;}
    public void setAutor(String autor){this.autor = autor;}
    public void setIsbn(String isbn){this.isbn = isbn;}
    public void setGenre(Genre genre){this.genre = genre;}
    public void setNumPagines(int nP){this.numPagines = nP;}

    // Otros métodos

    public String toString(){
        return "Llibre: "+titol+"; Autor: "+autor+"; ISBN: "+isbn+"; Gènere: "+genre+"; Núm. Pàgines: "+numPagines;
    }

    public boolean equals(Object o){
        return getIsbn().equals(((Book)o).getIsbn());
    }
}