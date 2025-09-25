/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciotres;

/**
 *
 * @author lucko
 */
public class Libro {
    private String titulo;
    private String isbn;
    private Autor autor;
    private Editorial editorial;

    public Libro(String titulo, String isbn, Editorial editorial) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.editorial = editorial;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
    
    public void mostrarLibro(){
        if(autor != null){
            System.out.println("El titulo del libro " + titulo + " el ISBN " + isbn + " el autor es " + autor.getNombre() 
            + " y la nacionalidad " + autor.getNacionalidad());
            System.out.println("La editora es " + editorial.getNombre() + " y la direccion es " + editorial.getDireccion());
        } else {
            System.out.println(titulo + " no tiene autor.");
        }
    }
}
