/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciodiez;

/**
 *
 * @author lucko
 */
public class Titular {
    private String nombre;
    private String dni;
    private CuentaBancaria cb;

    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public void setCb(CuentaBancaria cb) {
        this.cb = cb;
        if(cb != null && cb.getTitular() != this){
            cb.setTitular(this);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public CuentaBancaria getCb() {
        return cb;
    }  
}
