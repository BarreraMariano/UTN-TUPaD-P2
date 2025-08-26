/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciodos;

/**
 *
 * @author lucko
 */
public class EjercicioDos {

    public static void main(String[] args) {
        Mascota mascota = new Mascota();
        mascota.nombre = "peluca";
        mascota.especie = "caniche";
        mascota.edad = 7;
        
        mascota.mostrarInfo();
        
        mascota.cumplirAnios();
        mascota.mostrarInfo();
        
        mascota.cumplirAnios();
        mascota.mostrarInfo();
    }
}
