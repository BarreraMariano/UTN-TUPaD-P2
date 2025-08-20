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
public class ejercicioCinco {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese un numero (0 para terminar): ");
        int num = Integer.parseInt(input.nextLine());
        int suma = 0;
        
        while(num != 0){
            if(num % 2 == 0){
                suma += num;
            }
            System.out.print("Ingrese un numero (0 para terminar): ");
            num = Integer.parseInt(input.nextLine());
        }
         System.out.println("La suma de los numeros pares es: " + suma);
     }
}
