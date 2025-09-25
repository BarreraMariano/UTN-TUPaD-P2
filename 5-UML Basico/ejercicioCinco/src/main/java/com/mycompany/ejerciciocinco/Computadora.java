/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciocinco;

/**
 *
 * @author lucko
 */
public class Computadora {
    private String marca;
    private String numeroSiere;
    private PlacaMadre placa;
    private Propietaro propietaro;

    public Computadora(String marca, String numeroSiere, String modelo, String chipset) {
        this.marca = marca;
        this.numeroSiere = numeroSiere;
        this.placa = new PlacaMadre(modelo, chipset);
    }
    
    public void mostrarCompu(){
        System.out.println("La marca es " + marca + " el numero de serie es " + numeroSiere + " el modelo de la palca " + placa.getModelo() 
        + " y el chipset es " + placa.getChipset());
    }

    public void setPropietaro(Propietaro propietaro) {
        this.propietaro = propietaro;
        if(propietaro != null && propietaro.getCompu() != this){
            propietaro.setCompu(this);
        }
    }

    public String getMarca() {
        return marca;
    }

    public String getNumeroSiere() {
        return numeroSiere;
    }

    public PlacaMadre getPlaca() {
        return placa;
    }

    public Propietaro getPropietaro() {
        return propietaro;
    }
    
    
}
