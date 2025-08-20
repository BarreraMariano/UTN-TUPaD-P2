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
public class ejercicioSeis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int positivos = 0;
        int negativos = 0;
        int ceros = 0;

        
        for(int i = 1; i < 11; i++){
            System.out.print("Ingresa el numero: " + i + " ");
            int num = Integer.parseInt(input.nextLine());
            
             if(num > 0){
                positivos += 1;
            } else if (num < 0){
                negativos += 1;
            } else {
                ceros += 1;
            }
        }
        
        System.out.println("resultados: " + " positivos: " + positivos + " negativos: " + negativos + " ceros " + ceros);
    }
}
