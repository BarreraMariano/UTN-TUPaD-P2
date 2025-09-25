/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicioseis;

/**
 *
 * @author lucko
 */
public class Reserva {
    private String fecha;
    private String hora;
    private Cliente cliente;
    private Mesa mesa;

    public Reserva(String fecha, String hora, Mesa mesa) {
        this.fecha = fecha;
        this.hora = hora;
        this.mesa = mesa;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public void mostrarReserva() {
        if (cliente != null) {
            System.out.println("nombre del cliente: " + cliente.getNombre() + " telefono: " + cliente.getTelefono());            
            System.out.println("reserva dia: " + fecha + " hora: " + cliente.getTelefono());
            System.out.println("numero de mesa: " + mesa.getNumero() + " la capacidad " + mesa.getCapacidad());
        } else {
            System.out.println( " no tiene reserva.");
        }
    }
    
}
