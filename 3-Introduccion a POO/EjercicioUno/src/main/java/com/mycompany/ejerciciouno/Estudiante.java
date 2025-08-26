/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciouno;

/**
 *
 * @author lucko
 */
public class Estudiante {
    String nombre;
    String apellido;
    String curso;
    double calificacion;
    
    void mostrarInfo(){
        System.out.println("nombre: " + nombre);
        System.out.println("apellido: " + apellido);
        System.out.println("curso: " + curso);
        System.out.println("calificacion: " + calificacion);
    }
    
    void subirCalificacion(double puntos){
        if(puntos > 0){
             calificacion = calificacion + puntos;
        } 
    }
    
    void bajarCalificacion(double puntos){
        if(puntos > 0){
             calificacion = calificacion - puntos;
        } 
    }
}
