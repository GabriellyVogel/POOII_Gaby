/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exe1;

/**
 *
 * @author gabyv
 */
public class Livro {
    private String isbn;
    private Autor autor;
    private Biblioteca biblioteca;

    public Livro(String isbn, Autor autor, Biblioteca biblioteca) {
        this.isbn = isbn;
        this.autor = autor;
        this.biblioteca = biblioteca;
    }

    public String getIsbn() {
        return isbn;
    }

    public Autor getAutor() {
        return autor;
    }

    public Biblioteca getBiblioteca() {
        return biblioteca;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public void setBiblioteca(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }
    public void info(){
        System.out.println("Informações do Livro: ");
        System.out.println("ISBN: " + isbn);
        System.out.println("Autor: " + autor);
        System.out.println("Biblioteca: " + biblioteca);
    }
}
