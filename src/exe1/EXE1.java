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
public class EXE1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Biblioteca b = new Biblioteca("Biblioteca Caçador");
        
        //System.out.println(b.getNome());
        b.setNome("Biblioteca de Caçador");
        //System.out.println(b.getNome());
        
        Autor a = new Autor("john jackson miller");
        
        //System.out.println(a.getNome());
        a.setNome("John Jackson Miller");
        //System.out.println(a.getNome());
        
        
        Livro l = new Livro("978-85-7657-211", a, b);
        System.out.println(l.getIsbn());
        l.setIsbn("978-85-7657-211-4");
        System.out.println(l.getIsbn());
        //l.info()
       
        Capitulo c = new Capitulo(0, l);
        System.out.println(c.getNumero());
        c.setNumero(57);
        System.out.println(c.getNumero());
        //c.info();
    }
    
}
