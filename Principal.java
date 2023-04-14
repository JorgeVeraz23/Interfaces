/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class Principal {
    
    public static void main(String[] args){
        
       Carro c = new Carro();
       Bicicleta b = new Bicicleta();
       
       c.avanzar();
       b.detenerse();
       b.avanzar();
       b.sentarse();
        
    }
    
}
