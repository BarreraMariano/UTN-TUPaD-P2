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
public class ejercicioDos {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        
        System.out.print("Ingresa el primer numero: ");
        int num1 = Integer.parseInt(input.nextLine());
        System.out.print("Ingresa el segundo numero: ");
        int num2 = Integer.parseInt(input.nextLine());
        System.out.print("Ingresa el tercer numero: ");
        int num3 = Integer.parseInt(input.nextLine());
        
        int numeroM = num1;
        
        if(numeroM < num2){
            numeroM = num2;
        } else if (numeroM < num3){
            numeroM = num2;
        }
        
        System.out.print("El numero mayor es " + numeroM);
    }
}
