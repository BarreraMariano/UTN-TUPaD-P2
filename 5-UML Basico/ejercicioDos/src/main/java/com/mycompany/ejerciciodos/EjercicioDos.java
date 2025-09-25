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
        Bateria bateria = new Bateria("100", "Li-ion");
        Celular celular = new Celular("151234567890123", "samsung", "A1", bateria);
        Usuario usuario = new Usuario("mariano", "42710740");
        
        celular.mostrarCelular();
        System.out.println("el nombre del usuario es: " + usuario.getNombre());
        System.out.println("el dni es: " + usuario.getDni());
    }
}
