/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bicicleta;

/**
 *
 * @author RUBEN
 */
public class Bicicleta {


  private int velocidad;
    private int plato;
    private int piñon;
    
    public Bicicleta() {
        velocidad = 0;
        plato = 1;
        piñon = 1;
    }

 public int getVelocidad() {
        return velocidad;
    }
    
    public void setVelocidad(int nuevaVelocidad) {
        velocidad = nuevaVelocidad;
    }
    

    public int getPlato() {
        return plato;
    }
    
    public void setPlato(int nuevoPlato) {
        plato = nuevoPlato;
    }
    
    public int getPiñon() {
        return piñon;
    }
    
    public void setPiñon(int nuevoPiñon) {
        piñon = nuevoPiñon;
    }
    
    public void acelerar() {
        velocidad *= 3;
    }
    
    public void frenar() {
        velocidad /= 3;
    }
    
    public void cambiarPlato(int nuevoPlato) {
        plato = nuevoPlato;
    }
    
    public void cambiarPiñon(int nuevoPiñon) {
        piñon = nuevoPiñon;
    } 
    }
    

