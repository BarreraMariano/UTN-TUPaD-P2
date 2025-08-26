/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciodos;

/**
 *
 * @author lucko
 */
public class Mascota {
    String nombre;
    String especie;
    int edad;
    
    void mostrarInfo(){
        System.out.println("nombre: " + nombre);
        System.out.println("especie: " + especie);
        System.out.println("edad: " + edad);
    }
    
    void cumplirAnios(){
        edad++;
    }
}
