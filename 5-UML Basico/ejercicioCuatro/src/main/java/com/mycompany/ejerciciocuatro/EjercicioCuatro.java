/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciocuatro;

/**
 *
 * @author lucko
 */
public class EjercicioCuatro {

    public static void main(String[] args) {
        Banco banco = new Banco("Galica", "223455");
        Cliente cliente = new Cliente("mariano", "42710740");
        TarjetaDeCredito tarjeta = new TarjetaDeCredito("12344555", "12/09/1999", banco);
        
        tarjeta.setCliente(cliente);
        
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("DNI: " + cliente.getDni());
        System.out.println("Numero de tarjeta: " + tarjeta.getNumero());
        System.out.println("Fecha de vencimiento: " + tarjeta.getFechaVencimiento());
        
        tarjeta.mostrarBanco();

    }
}
