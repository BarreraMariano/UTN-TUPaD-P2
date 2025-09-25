/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciosiete;

/**
 *
 * @author lucko
 */
public class Conductor {
    private String nombre;
    private Boolean licencia;
    private Vehiculo auto;
    
    public Conductor(String nombre, Boolean licencia) {
        this.nombre = nombre;
        this.licencia = licencia;
    }

    public void setVehiculo(Vehiculo auto) {
        this.auto = auto;
        if(auto != null && auto.getConductor() != this){
            auto.setConductor(this);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public Boolean getLicencia() {
        return licencia;
    }

    public Vehiculo getVehiculo() {
        return auto;
    }
    
    
}
