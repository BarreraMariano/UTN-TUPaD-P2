/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciocuatro;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author lucko
 */
public class EjercicioCuatro {

    public static void main(String[] args) {
        List<Animal> animales = Arrays.asList(
            new Perro(),
            new Gato(),
            new Vaca()
        );

        for (Animal animal : animales) {
            animal.describirAnimal();
            animal.hacerSonido();
            System.out.println();
        }
    }
}
