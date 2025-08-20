/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp2;

import java.util.Scanner;

/**
 *
 * @author lucko
 */
public class ejercicoNueve {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese el precio base del producto: ");
        double precioProducto = Integer.parseInt(input.nextLine());
        System.out.print("Ingrese el peso del paquete: ");
        double pesoProducto = Integer.parseInt(input.nextLine());
        System.out.print("Ingrese la zona de envío (Nacional/Internacional):  ");
        String zonaProducto =input.nextLine();
        
        double costoEnvio = calcularCostoEnvio(pesoProducto, zonaProducto);
        double costoTotal = calcularTotalCompra(precioProducto, costoEnvio);
        
        System.out.println("El costo de envío es: " + costoEnvio);
        System.out.println("El total a pagar es: " + costoTotal);
   }
     
    static double calcularCostoEnvio(double peso, String zona){
        double costo = 0;
        
        if(zona.equalsIgnoreCase("nacional")){
            costo = 5 * peso;
        } else if (zona.equalsIgnoreCase("internacional")){
            costo = 10 * peso;
        }
        return costo;
    }  
    
    static double calcularTotalCompra(double precioProducto, double costoEnvio){
        double precioFinal = precioProducto + costoEnvio;
        return precioFinal;
    }
}
