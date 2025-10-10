/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciodos;

/**
 *
 * @author lucko
 */
public class EjercicioDos {

    public static void main(String[] args) {
        Biblioteca b1 = new Biblioteca("Biblioteca 1");
        
        Autor a1 = new Autor("A1", "Gabriel Garcia Marquez", "Colombia");
        Autor a2 = new Autor("A2", "Jane Austen", "Inglaterra");
        Autor a3 = new Autor("A3", "Haruki Murakami", "Japon");
        
        b1.agregarLibro("L1", "Crónica de una muerte anunciada", 1981, a1);
        b1.agregarLibro("L2", "Orgullo y prejuicio", 1813, a2);
        b1.agregarLibro("L3", "Tokio Blues", 1987, a3);
        b1.agregarLibro("L4", "Cien años de soledad", 1967, a1);
        b1.agregarLibro("L5", "Emma", 1815, a2);
        
        b1.listarLibros();
        
        System.out.println("-----------------------");
        System.out.println(b1.buscarLibroPorIsbn("L2"));
        
        System.out.println("-----------------------");
        System.out.println(b1.filtrarLibrosPorAnio(1815));
        
        System.out.println("-----------------------");
        b1.eliminarLibro("L4");
        
        System.out.println("-----------------------");
        b1.obtenerCantidadLibros();
        
        System.out.println("-----------------------");
        b1.mostrarAutoresDisponibles();
    }
}
