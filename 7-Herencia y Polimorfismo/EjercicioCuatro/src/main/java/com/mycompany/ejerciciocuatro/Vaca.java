/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciocuatro;

/**
 *
 * @author lucko
 */
class Vaca extends Animal {
    public Vaca() {
        super("vaca");
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + ": muuu");
    }
}
