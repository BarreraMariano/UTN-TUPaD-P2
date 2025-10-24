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

public class DivisionSegura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("ingrese el dividendo: ");
            double dividendo = scanner.nextDouble();
            
            System.out.print("ingrese el divisor: ");
            double divisor = scanner.nextDouble();
            
            double resultado = dividir(dividendo, divisor);
            System.out.println("resultado: " + resultado);
            
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir por cero.");
        } catch (Exception e) {
            System.out.println("Error: Entrada invalida.");
        } finally {
            scanner.close();
        }
    }
    
    public static double dividir(double dividendo, double divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("división por cero");
        }
        return dividendo / divisor;
    }
}
