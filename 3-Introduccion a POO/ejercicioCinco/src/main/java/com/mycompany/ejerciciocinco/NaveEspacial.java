/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciocinco;

/**
 *
 * @author lucko
 */
public class NaveEspacial {
    private String nombre;
    private double combustible;
    
    public void despegar(String nombre, double combustible){
        this.nombre = nombre;
        this.combustible = combustible;
    }
    
    public void avanzar(double distancia){
        if(distancia <= combustible){
            combustible = combustible - distancia;
            System.out.println("avanzaste sin problema esta distancia " + distancia);
        } else {
            System.out.println("no tienes la cantidad de combustible necesario para avanzar esta distancia " + distancia);
        }
    }
    
    public void recargarCombustible(double cantidad){
        combustible = combustible + cantidad;
    }
    
    public void mostrarEstado(){
        System.out.println("nombre " + nombre);
        System.out.println("combustible: " + combustible);
    }
}
