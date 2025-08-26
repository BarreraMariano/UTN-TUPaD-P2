/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciotres;

/**
 *
 * @author lucko
 */
public class EjercicioTres {

    public static void main(String[] args) {
        Libro libro = new Libro();
        
        libro.setAñoPublicacion(-2);
        System.out.println(libro.getAñoPublicacion());
        
        libro.setAñoPublicacion(1981);
        System.out.println(libro.getAñoPublicacion());  
    }
}
