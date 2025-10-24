/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciodos;

/**
 *
 * @author lucko
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class LecturaArchivo {
    public static void main(String[] args) {
        String nombreArchivo = "archivo.txt";
        
        try {
            leerArchivo(nombreArchivo);
        } catch (FileNotFoundException e) {
            System.out.println("Error: El archivo '" + nombreArchivo + "' no existe.");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
    
    public static void leerArchivo(String nombreArchivo) throws FileNotFoundException, IOException {
        BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo));
        String linea;
        
        System.out.println("Contenido del archivo:");
        while ((linea = reader.readLine()) != null) {
            System.out.println(linea);
        }
        
        reader.close();
    }
}
