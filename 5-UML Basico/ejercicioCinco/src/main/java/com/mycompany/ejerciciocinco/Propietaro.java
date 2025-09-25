/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciocinco;

/**
 *
 * @author lucko
 */
public class Propietaro {
    private String nombre;
    private String dni;
    private Computadora compu;

    public Propietaro(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public void setCompu(Computadora compu) {
        this.compu = compu;
        if(compu != null && compu.getPropietaro() != this){
            compu.setPropietaro(this);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public Computadora getCompu() {
        return compu;
    }
    
    
}
