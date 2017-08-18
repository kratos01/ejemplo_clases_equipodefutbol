/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Steven
 */
public class Defensa extends Jugador implements JugadorDeFutbol{

    public Defensa(){
        super();
    }
    
    public String presentar(){
        return super.presentar() + " (juega de defensa)";
    }
    
    @Override
    public String obtenerPosicion() {
        return "Defensa";
    }

    @Override
    public void realizarJugada() {
        int aleatorio = (int)(Math.random() * 5) + (1 <= 5 ? 1 : 5);
        System.out.println("El defensa hace su movimiento y "+( aleatorio > 3 ? "quita el balon" : "pierde el balon" ));
        
    }
    
}
