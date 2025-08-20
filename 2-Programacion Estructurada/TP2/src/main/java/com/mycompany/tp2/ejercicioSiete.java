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
public class ejercicioSiete {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     int nota;  
     
     do {
     System.out.print("Ingrese una nota (0-10): ");
     nota = Integer.parseInt(input.nextLine());
     
     if(nota > 10 || nota < 0){
         System.out.println("Error: Nota inválida. Ingrese una nota entre 0 y 10");
     } 
     }while( nota > 10 || nota < 0);
     
     System.out.println("Nota guardada correctamente"); 
}
}    
