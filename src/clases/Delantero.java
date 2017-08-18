/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * 
*/

public class Delantero extends Jugador implements JugadorDeFutbol  {

    public Delantero() {
        super();
    }
public String presentar(){
    return super.presentar()+ "(juega de delantero)";
  
    }

    @Override
    public String obtenerPosicion() {
       return "delantero";
    }

    @Override
    public void realizarJugada() {
        int aleatorio = (int)(Math.random() * 5) + (1 <= 5 ? 1 : 5);
        System.out.println("El delantero le pega al arco y "+( aleatorio > 3 ? "anota golllll!!!!!" : "ha fallado el tiro se ha estrellado en el palo" ));
    }



    
}

