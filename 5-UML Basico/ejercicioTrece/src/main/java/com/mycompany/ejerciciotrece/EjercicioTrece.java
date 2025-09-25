/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciotrece;

/**
 *
 * @author lucko
 */
public class EjercicioTrece {

    public static void main(String[] args) {
          Usuario usuario = new Usuario("Juan Perez", "juan@email.com");
          GeneradorQR generador = new GeneradorQR();
        
          generador.generar("https://ejemplo.com/qr123", usuario);
    }
}
