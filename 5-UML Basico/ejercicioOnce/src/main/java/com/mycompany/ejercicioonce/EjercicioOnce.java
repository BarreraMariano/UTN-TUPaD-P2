/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicioonce;

/**
 *
 * @author lucko
 */
public class EjercicioOnce {
        public static void main(String[] args) {
        Artista artista = new Artista("The Beatles", "Rock");
        Cancion cancion = new Cancion("Yesterday", artista);
        Reproductor reproductor = new Reproductor();
        
        reproductor.reproducir(cancion);
    } 
}
