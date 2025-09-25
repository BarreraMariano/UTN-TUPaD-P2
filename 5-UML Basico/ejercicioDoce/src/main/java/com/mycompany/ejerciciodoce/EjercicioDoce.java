/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciodoce;

/**
 *
 * @author lucko
 */
public class EjercicioDoce {

    public static void main(String[] args) {
        Contribuyente contribuyente = new Contribuyente("Juan Pérez", "20123456789");
        Impuesto impuesto = new Impuesto(1000.0, contribuyente);
        Calculadora calculadora = new Calculadora();
        
        calculadora.calcular(impuesto);
    }
}
