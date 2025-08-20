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
public class ejercicioTres {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese su edad: ");
        int edad = Integer.parseInt(input.nextLine());
        
        if(edad <= 12){
            System.out.print("Niño");
        } else if (edad > 12 && edad <= 17) {
            System.out.print("Adolecente");
        } else if (edad > 18 && edad <= 59) {
            System.out.print("adulto");
        } else if (edad > 60) {
            System.out.print("Adulto Mayor");
        }
     }
}
