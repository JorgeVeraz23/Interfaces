/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class Bicicleta implements Rueda, Silla{
    
    public Bicicleta(){
        
    }
    
    public void avanzar(){
        System.out.println("La bicicleta avanza");
    }
    
    public void detenerse(){
        System.out.println("La bicicleta se detiene");
    }

    @Override
    public void sentarse() {
        System.out.println("Sentarse");
    }
    
    
}
