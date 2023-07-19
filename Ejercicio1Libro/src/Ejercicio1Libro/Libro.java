package Ejercicio1Libro;

import java.util.Scanner;


public class Libro {
private String isbn, titulo, autor, numeroDePaginas;

    public Libro() {
    }

    public Libro(String isbn, String titulo, String autor, String numeroDePaginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
    }
    
    public void Solicitar(){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el ISBN.");
        isbn = entrada.nextLine();
        
        System.out.println("Ingrese el Título.");
        titulo = entrada.nextLine();
        
        System.out.println("Ingrese el Autor.");
        autor = entrada.nextLine();
        
        System.out.println("Ingrese el Número de páginas.");
        numeroDePaginas = entrada.nextLine();

        
    }
    
    public void Mostrar(){
        System.out.println("ISBN: " + isbn + "\n" + "Título: " + titulo +  "\n" + "Autor: " + autor + "\n" + "Número de páginas: " + numeroDePaginas);
        
    }

    @Override
    public String toString() {
        return "Libro{" + "isbn=" + isbn + ", titulo=" + titulo + ", autor=" + autor + ", numeroDePaginas=" + numeroDePaginas + '}';
    }
    


}
