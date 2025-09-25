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
        Pasaporte pasaporte = new Pasaporte("112334", "12/03/2000", "img", "PNG");
        Titular titular = new Titular("mariano", "42701023");
        pasaporte.mostrarPasaporte();
        
        System.out.println("el nombre del titular es: " + titular.getNombre());
        System.out.println("el dni es: " + titular.getDni());
    }
}
