/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exe3;

import java.util.Random;

/**
 *
 * @author gabyv
 */
public class Baralho {
   private Carta[] cartas;

    public Baralho() throws Exception {
        cartas = new Carta[52];
        
        String[] naips = {"Copas","Espadas","Ouros","Paus"};
        
        for(int i = 0; i<52; i++){
            cartas[i] = new Carta((i%13)+1, naips[i/13]);
        }
    }
   
    public void embaralhar(){
        Random embaralha = new Random();
        int i1 = 0;
        int i2 = 0;
        for(int i = 0; i<100; i++){
            i1 = embaralha.nextInt(52);
            i2 = embaralha.nextInt(52);
            Carta aux = cartas[i1];
            cartas[i1] = cartas[i2];
            cartas[i2] = aux;
        }
    }
    
    @Override
    public String toString(){
        String fr = "Cartas presentes no baralho\n";
        for(int i=0; i< 52; i++){
            fr = fr.concat((i+1) + "ª " + cartas[i] + "\n");
        }
       return fr;
    }
}
