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
public class Principal {

    /**
     * @param args the command line arguments
     */
    private String equipo = "Sistemas FC";
    private Arquero arquero;
    private Defensa defensa_izquierdo;
    private Defensa defensa_central;
    private Defensa defensa_derecho;
    private Delantero delantero;
    private Volante volante;
    
    public Principal() {
        arquero = new Arquero("Carlos Duran", this.equipo, 1);
        
        defensa_izquierdo = new Defensa();
        defensa_izquierdo.setNombre("Daniel Calderon");
        defensa_izquierdo.numero = 4; //valido, pero es una mala práctica acceder a los miembros de la clase directamente, solo deberian accederse y modificarse mediante la interfaz de la clase.
        defensa_izquierdo.setEquipo(this.equipo);
        
        defensa_derecho = new Defensa();
        defensa_derecho.setNombre("Jonathan Castiblanco");
        defensa_derecho.setNumero(2); // forma correcta de modificar los miembros de la clase.
        defensa_derecho.setEquipo(this.equipo);
         
        defensa_central = new Defensa();
        defensa_central.setNombre("Johan Castillo");
        defensa_central.setNumero(3);
        defensa_central.setEquipo(this.equipo);
        
        volante = new Volante();
        volante.setNombre("Diego Carrero");
        volante.setNumero(10);
        volante.setEquipo(this.equipo);
        
        delantero = new Delantero();
        delantero.setNombre("Julian Arias ");
        delantero.setNumero(7);
        delantero.setEquipo(this.equipo);
        
        presentar(arquero);
        presentar(defensa_izquierdo);
        presentar(defensa_central);
        presentar(defensa_derecho);
        presentar(volante);
        presentar(delantero);
        
        narrarPartidoDeFutbol(delantero);  
        narrarPartidoDeFutbol(volante);
        narrarPartidoDeFutbol(defensa_central);
        narrarPartidoDeFutbol(defensa_izquierdo);
        narrarPartidoDeFutbol(defensa_derecho);
        narrarPartidoDeFutbol(arquero);
        
    }
    
    public void presentar(Jugador jugador){ //metodo polimorfico capaz de interpretar cualquier subclase de Jugador (Arquero, Defensa, ...etc)
        System.out.println(jugador.presentar());
    }
    
    public void narrarPartidoDeFutbol(JugadorDeFutbol jugador){ //metodo polimorfico capaz de interpretar cualquier implementación de JugadorDeFutbol
        //jugador.presentar(); //->no es valido porque no es un metodo que se encuentra en al interfaz JugadorDeFutbol es un metodo de la clase Jugador
        
        jugador.obtenerPosicion();
        jugador.realizarJugada();
    }
    public static void main(String[] args) {
        Principal principal = new Principal();
    }
    
}
