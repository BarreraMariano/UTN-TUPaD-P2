/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp2;

/**
 *
 * @author lucko
 */
public class ejercicioTrece {
    public static void main(String[] args) {
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
        
        System.out.println("Precios originales:");
        mostrarPreciosOriginales(precios, 0);
        
        precios[2] = 129.99;
        System.out.println();
        
        System.out.println("Precios modificados:");
        mostrarPreciosModificados(precios, 0);
    }
    
    public static void mostrarPreciosOriginales(double[] precios, int indice) {
        if (indice >= precios.length) {
            return;
        }
        
        System.out.printf("Precio: $%.2f%n", precios[indice]);
      
        mostrarPreciosOriginales(precios, indice + 1);
    }
    
     public static void mostrarPreciosModificados(double[] precios, int indice) {
        if (indice >= precios.length) {
            return;
        }

        System.out.printf("Precio: $%.2f%n", precios[indice]);
        
        mostrarPreciosModificados(precios, indice + 1);
    }
}
