/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciosiete;

/**
 *
 * @author lucko
 */
public class EjercicioSiete {

    public static void main(String[] args) {
        Conductor conductor = new Conductor("mariano", true);
        Motor motor = new Motor("V9", "motorT");
        Vehiculo auto = new Vehiculo("1234", "Audi", motor);
        
        auto.mostraVehiculo();
        System.out.println("nombre del conductor " + conductor.getNombre());
        System.out.println("tiene licencia " + conductor.getLicencia());
    }
}
