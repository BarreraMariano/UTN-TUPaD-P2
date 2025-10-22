/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciodos;

/**
 *
 * @author lucko
 */
public class EjercicioDos {

    public static void main(String[] args) {
        Figura[] figuras = {
            new Circulo(5),
            new Rectangulo(4, 6)
        };

        for (Figura figura : figuras) {
            figura.mostrarArea();
        }
    }
}
