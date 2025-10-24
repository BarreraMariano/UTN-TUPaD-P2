/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciodos;

/**
 *
 * @author lucko
 */
import java.util.Scanner;

public class ConversionCadenaNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("ingrese un numero entero: ");
        String entrada = scanner.nextLine();
        
        try {
            int numero = convertirAEntero(entrada);
            System.out.println("Numero convertido: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Error: La cadena '" + entrada + "' no es un numero entero valido.");
        } finally {
            scanner.close();
        }
    }
    
    public static int convertirAEntero(String cadena) {
        return Integer.parseInt(cadena);
    }
}