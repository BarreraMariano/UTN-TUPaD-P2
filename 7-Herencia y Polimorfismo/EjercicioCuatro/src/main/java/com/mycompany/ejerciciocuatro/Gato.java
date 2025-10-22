/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciocuatro;

/**
 *
 * @author lucko
 */
class Gato extends Animal {
    public Gato() {
        super("gato ");
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + ": miau");
    }
}

