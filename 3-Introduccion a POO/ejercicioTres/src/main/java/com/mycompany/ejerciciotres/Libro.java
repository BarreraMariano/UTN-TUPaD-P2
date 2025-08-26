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
    private String autor;
    private int añoPublicacion;
    
    public String getTitulo(){
        return titulo;
    }
    
    public String getAutor(){
        return autor;
    }
    
    public int getAñoPublicacion(){
        return añoPublicacion;
    }
    
    public void setAñoPublicacion(int año){
        if (año > 0) {
            this.añoPublicacion = año;
        }
    }
}
