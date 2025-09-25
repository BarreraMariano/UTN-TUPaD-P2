/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciodiez;

/**
 *
 * @author lucko
 */
public class EjercicioDiez {

    public static void main(String[] args) {
        Titular titular = new Titular("Mariano", "42710740");
        CuentaBancaria cb = new CuentaBancaria("1213224032i3204", "$1232330", "mce4mnih933", "12/05/2012");
        
        cb.mostrarCuenta();
        System.out.println("el nombre de propietario " + titular.getNombre());
        System.out.println("el dni de propietario " + titular.getDni());
    }            
}
