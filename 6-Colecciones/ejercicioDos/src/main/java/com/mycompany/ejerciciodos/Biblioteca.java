/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciodos;

import java.util.ArrayList;

/**
 *
 * @author lucko
 */
public class Biblioteca {
    private String nombre;
    private ArrayList<Libro> libros;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }
    
    public void agregarLibro(String isbn, String titulo,int anioPublicacion, Autor autor) {
        Libro nuevoLibro = new Libro(isbn, titulo, anioPublicacion, autor);
        this.libros.add(nuevoLibro);
    } 
    public void listarLibros(){
        System.out.println("La lista de libros: ");
        for(int i = 0; i < this.libros.size(); i++){
            System.out.println(this.libros.get(i));
        }
    } 
    public Libro buscarLibroPorIsbn(String isbn) {
        int i = 0;
        Libro lEncontrado = null;

        while(i < this.libros.size() && !this.libros.get(i).getIsbn().equals(isbn)){
            i++;
        }
        
        if (i < this.libros.size()){
            lEncontrado = this.libros.get(i);
        }
        
        return lEncontrado;
    }
    
    public Libro filtrarLibrosPorAnio(int anio) {
        int i = 0;
        Libro lEncontrado = null;
        
        while(i < this.libros.size() && this.libros.get(i).getAnioPublicacion() != anio){
            i++;
        }
        
        if (i < this.libros.size()){
            lEncontrado = this.libros.get(i);
        }
        
        return lEncontrado;
    } 
    
    public void eliminarLibro(String isbn){
        Libro lBorrar = buscarLibroPorIsbn(isbn);
        
        System.out.println(lBorrar);
        this.libros.remove(lBorrar);
        listarLibros();
    } 
    
    
    public void obtenerCantidadLibros(){
        System.out.println("La cantidad de libros en la bibliota es :" + this.libros.size());
    } 
    
    public ArrayList<String>  mostrarAutoresDisponibles() {
        ArrayList<String> autoresDisponibles = new ArrayList<>();
        
        for(Libro libro:libros){
            String autorId = libro.getAutor().getId();
            
            if (!autoresDisponibles.contains(autorId)) {
                libro.getAutor().mostrarInfo();
                autoresDisponibles.add(autorId);
            }
        }
        
        return autoresDisponibles;
    }
}
