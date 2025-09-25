/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciotres;

/**
 *
 * @author lucko
 */
public class EjercicioTres {

    public static void main(String[] args) {
        Editorial editorial = new Editorial("Editorial Sudamericana","calle falsa123");
        Libro libro = new Libro("Cien años de soledad", "anssdwd", editorial);
        Autor autor = new Autor("Garcia Marquez", "Colombia");
        
        libro.setAutor(autor);
        libro.mostrarLibro();
    }
}
