/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exe3;

/**
 *
 * @author gabyv
 */
public class Carta {
    private int numero;
    private String naipe;

    public Carta(int num, String nai) throws Exception {
        this.setNumero(num);
        this.setNaipe(nai);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int num)throws Exception {
        if(num>0 && num<=13){
            this.numero = num;
        }else{
            throw new Exception("Carta inválida!!");
        }
        
    }

    public String getNaipe() {
        return naipe;
    }

    public void setNaipe(String nai)throws Exception {
        if(nai=="Copas" || nai=="Espadas"  || nai=="Ouros" || nai=="Paus"){
            this.naipe = nai;
        }else{
            throw new Exception("Carta inválida!!");    
        }
        
    }  
    
    @Override
    public String toString(){
        return "Carta: " + numero + " de " + naipe;
    }
}
