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
public class ejercicioOcho {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese el precio base del producto: ");
        double precioBase = Integer.parseInt(input.nextLine()); 
        
        System.out.print("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): ");
        double impuesto = Integer.parseInt(input.nextLine()); 
        
        System.out.print("Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): ");
        double descuento = Integer.parseInt(input.nextLine()); 
        
        double precioFinal = sucesionDeSimbolos(precioBase, impuesto, descuento);
        System.out.print("El precio final del producto es:" + precioFinal);
   
   }
    
    static double sucesionDeSimbolos(double precioBase, double impuesto, double descuento){
        double impuestoDecimal = impuesto / 100.0;
        double descuentoDecimal = descuento / 100.0;
        
        double precioFinal =  precioBase + (precioBase * impuestoDecimal) - (precioBase * descuentoDecimal);
        return precioFinal;  
    } 
}
