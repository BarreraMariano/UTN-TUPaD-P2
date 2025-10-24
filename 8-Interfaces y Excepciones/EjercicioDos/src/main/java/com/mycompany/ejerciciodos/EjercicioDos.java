/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciodos;

/**
 *
 * @author lucko
 */
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class EjercicioDos {

    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
        int opcion;
        
        do {
            System.out.println("\n=== MENÚ DE EJERCICIOS SOBRE EXCEPCIONES ===");
            System.out.println("1. División segura");
            System.out.println("2. Conversión de cadena a número");
            System.out.println("3. Lectura de archivo");
            System.out.println("4. Validación de edad con excepción personalizada");
            System.out.println("5. Try-with-resources");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            
            try {
                opcion = Integer.parseInt(scanner.nextLine());
                
                switch (opcion) {
                    case 1:
                        ejercicioDivisionSegura(scanner);
                        break;
                    case 2:
                        ejercicioConversionNumero(scanner);
                        break;
                    case 3:
                        ejercicioLecturaArchivo();
                        break;
                    case 4:
                        ejercicioValidacionEdad(scanner);
                        break;
                    case 5:
                        ejercicioTryWithResources();
                        break;
                    case 0:
                        System.out.println("¡Hasta luego!");
                        break;
                    default:
                        System.out.println("Opción inválida.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Debe ingresar un número válido.");
                opcion = -1;
            }
            
        } while (opcion != 0);
        
        scanner.close();
    }
    
    // Ejercicio 1: División segura
    public static void ejercicioDivisionSegura(Scanner scanner) {
        try {
            System.out.print("Ingrese el dividendo: ");
            double dividendo = Double.parseDouble(scanner.nextLine());
            
            System.out.print("Ingrese el divisor: ");
            double divisor = Double.parseDouble(scanner.nextLine());
            
            if (divisor == 0) {
                throw new ArithmeticException("División por cero");
            }
            
            double resultado = dividendo / divisor;
            System.out.println("Resultado: " + resultado);
            
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir por cero.");
        } catch (NumberFormatException e) {
            System.out.println("Error: Debe ingresar números válidos.");
        }
    }
    
    // Ejercicio 2: Conversión de cadena a número
    public static void ejercicioConversionNumero(Scanner scanner) {
        System.out.print("Ingrese un número entero: ");
        String entrada = scanner.nextLine();
        
        try {
            int numero = Integer.parseInt(entrada);
            System.out.println("Número convertido: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Error: La cadena '" + entrada + "' no es un número entero válido.");
        }
    }
    
    // Ejercicio 3: Lectura de archivo
    public static void ejercicioLecturaArchivo() {
        String nombreArchivo = "archivo.txt";
        
        try {
            BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo));
            String linea;
            
            System.out.println("Contenido del archivo '" + nombreArchivo + "':");
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }
            
            reader.close();
        } catch (java.io.FileNotFoundException e) {
            System.out.println("Error: El archivo '" + nombreArchivo + "' no existe.");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
    
    // Ejercicio 4: Validación de edad
    public static void ejercicioValidacionEdad(Scanner scanner) {
        try {
            System.out.print("Ingrese su edad: ");
            int edad = Integer.parseInt(scanner.nextLine());
            
            if (edad < 0) {
                throw new EdadInvalidaException("La edad no puede ser negativa.");
            }
            if (edad > 120) {
                throw new EdadInvalidaException("La edad no puede ser mayor a 120 años.");
            }
            
            System.out.println("Edad válida: " + edad + " años");
            
        } catch (EdadInvalidaException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error: Debe ingresar un número válido.");
        }
    }
    
    // Ejercicio 5: Try-with-resources
    public static void ejercicioTryWithResources() {
        String nombreArchivo = "archivo.txt";
        
        try {
            leerArchivoConTryWithResources(nombreArchivo);
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
    
    public static void leerArchivoConTryWithResources(String nombreArchivo) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            int numeroLinea = 1;
            
            System.out.println("Contenido del archivo (usando try-with-resources):");
            while ((linea = reader.readLine()) != null) {
                System.out.println(numeroLinea + ": " + linea);
                numeroLinea++;
            }
        }
    }
}
