/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciouno;

/**
 *
 * @author lucko
 */
public class EjercicioUno {

    public static void main(String[] args) {
        Estudiante est = new Estudiante();
        est.nombre = "mariano";
        est.apellido = "barrera";
        est.curso = "3º C";
        est.calificacion = 7.5;
        est.mostrarInfo();
        
        est.subirCalificacion(2.5);
        est.mostrarInfo();
        
        est.bajarCalificacion(5.5);
        est.mostrarInfo();
    }
}
