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
public class ejercicioUno {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingresa un año: ");
        int añoIngresado = Integer.parseInt(input.nextLine());
        
        if(añoIngresado % 4 == 0 && añoIngresado % 100 != 0 || añoIngresado % 400 == 0){
            System.out.print("El año " + añoIngresado + " es bisiesto");
        }else{
            System.out.print("El año " + añoIngresado + " no es bisiesto");   
        } 
    }
}
