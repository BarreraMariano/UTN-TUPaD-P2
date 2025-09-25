/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicioseis;

/**
 *
 * @author lucko
 */
public class EjercicioSeis {

    public static void main(String[] args) {
          Mesa mesa = new Mesa("2", "8");  
          Cliente cliente = new Cliente ("mariano", "3834567890");
          Reserva reserva = new Reserva("12/04/2000", "16:30", mesa);
          
          reserva.setCliente(cliente);
          reserva.mostrarReserva();
    }
}
