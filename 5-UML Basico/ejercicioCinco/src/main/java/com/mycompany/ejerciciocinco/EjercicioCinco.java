/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciocinco;

/**
 *
 * @author lucko
 */
public class EjercicioCinco {

    public static void main(String[] args) {
       Propietaro propietario = new Propietaro("mariano", "42710740"); 
       Computadora compu = new Computadora("marca compu", "1234", "modelo placa", "5677");
       compu.mostrarCompu();
       
        System.out.println("el nombre de propietario " + propietario.getNombre());
        System.out.println("el dni de propietario " + propietario.getDni());

    }
}
