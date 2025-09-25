/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciotrece;

/**
 *
 * @author lucko
 */
public class GeneradorQR {
     public void generar(String valor, Usuario usuario) {
        CodigoQR codigo = new CodigoQR(valor, usuario);
        
        System.out.println("generando codigo QR");
        System.out.println(codigo.toString());
        System.out.println("codigo QR echo");
    }
}
