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
public class Jugador {
    
    private String equipo;
    private String nombre;
    protected int numero;
    public int visible;
    
    public Jugador(){
        this("Sin nombre");
    }
    
    public Jugador(String nombre){
        this(nombre, 0);
    }
    
    public Jugador(String nombre, int numero){
        this.nombre = nombre;
        this.numero = numero;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getEquipo() {
        return this.equipo == null ? "Sin equipo" : this.equipo;
    }
    
    public void setEquipo(String equipo){
        this.equipo = equipo;
    }
    
    public int getNumero() {
        return this.numero;
    }
    
    public void setNumero(int numero){
        this.numero = numero;
    }
    
    protected String presentar(){
        return this.nombre+" juega en "+this.getEquipo()+" con la camiseta "+this.numero;
    }
}
