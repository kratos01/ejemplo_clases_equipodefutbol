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
public class Arquero extends Jugador implements JugadorDeFutbol{

    public Arquero(String nombre, String equipo, int numero) {
        super(nombre, numero); //se llama al constructor de la clase base
        super.setEquipo(equipo); //llamado a metodo de la clase base
        System.out.println(this.getClass().getSimpleName()+": acceso a miembro protected"+super.numero); //Acceso a miembros protected
    }
    
    public String presentar(){
        return super.presentar() + " (juega de arquero)";
    }
    
    @Override
    public String obtenerPosicion() {
       return "Arquero";
    }

    @Override
    public void realizarJugada() {
        int aleatorio = (int)(Math.random() * 5) + (1 <= 5 ? 1 : 5);
        System.out.println("El arquero se lanza y "+( aleatorio > 3 ? "atrapa el balon" : "no alcanza y el otro equipo hace gol!!" ));
    }
    
}
