/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciodoce;

/**
 *
 * @author lucko
 */
public class Calculadora {
    public void calcular(Impuesto impuesto) {
        System.out.println("calculando impuesto: " + impuesto);
        double impuestoCalculado = impuesto.getMonto() * 1.21;
        System.out.println("impuesto total: " + impuestoCalculado);
    }
}
