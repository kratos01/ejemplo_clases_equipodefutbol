/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author julian arias
 */
class Volante extends Jugador implements JugadorDeFutbol{

    public Volante() {
    }

    public String presentar(){
        return super.presentar() + ("volante");
        
    }

    @Override
    public String obtenerPosicion() {
        return "volante";
    }

    @Override
    public void realizarJugada() {
          int aleatorio = (int)(Math.random() * 5) + (1 <= 5 ? 1 : 5);
        System.out.println("El volante hace pase al delantero y "+( aleatorio > 3 ? "logra hacer el pase correcto" : "ha fallado y el jugador del otro equipo se queda con el balon" ));
    }
    
    
}
