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
public class ejercicioCuatro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese el precio del producto: ");
        double precio = Integer.parseInt(input.nextLine());
        
        System.out.print("Ingrese la cegoria del descuento (A , B , C): ");
        char categoria = input.nextLine().charAt(0);
        
          switch(categoria){
            case 'A':
            case 'a':
                System.out.println("Descuento aplicado: 10%");
                System.out.print("Precio final: " + (precio * (1 - (10.0 / 100))) );
                break;
            case 'B':
            case 'b': 
                System.out.println("Descuento aplicado: 15%");
                System.out.println("Precio final: " + (precio * (1 - (15.0 / 100))) );
                break;
            case 'C':
            case 'c':   
                System.out.println("Descuento aplicado: 20%");
                System.out.print("Precio final: " + (precio * (1 - (20.0 / 100))) );
                break; 
            default:
                System.out.println("operacion invalida");
        }
    }
}
