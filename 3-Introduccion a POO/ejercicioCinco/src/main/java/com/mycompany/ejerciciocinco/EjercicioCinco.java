/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciocinco;

/**
 *
 * @author lucko
 */
public class EjercicioCinco {

    public static void main(String[] args) {
        NaveEspacial nave = new NaveEspacial();
        
        nave.despegar("nave 1", 50);
        nave.mostrarEstado();
        
        nave.avanzar(30);
        nave.mostrarEstado();
        
        nave.avanzar(30);
        
        nave.recargarCombustible(40);
        nave.mostrarEstado();
        
        nave.avanzar(30);
        nave.mostrarEstado();
        
        nave.avanzar(30);
        nave.mostrarEstado();
    }
}
