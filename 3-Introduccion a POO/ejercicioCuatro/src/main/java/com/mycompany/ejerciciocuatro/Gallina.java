/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciocuatro;

/**
 *
 * @author lucko
 */
public class Gallina {
   private int idGallina;
   private int edad = 0;
   private int huevosPuestos = 0;
   
   public void setIdGallina(int id){
        if(id > 0){
            this.idGallina = id;
        }
    }
   
    public void ponerHuevo(){
        huevosPuestos++;
    }
    
    public void envenjecer(){
        edad++;
    }
    
    public void mostarEstado(){
        System.out.println("id: " + idGallina);
        System.out.println("edad: " + edad);
        System.out.println("huevos puestos: " + huevosPuestos);
    }
 }
