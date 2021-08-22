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
public class Capitulo {
    private int numero;
    private Livro livro;

    public Capitulo(int numero, Livro livro) {
        this.numero = numero;
        this.livro = livro;
    }

    public int getNumero() {
        return numero;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }
    
    public void info(){
        System.out.println(livro);
        System.out.println("Número de capítulos : " + numero);
    }
    
}
