/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejeciciouno;

/**
 *
 * @author lucko
 */
public class TarjetaCredito implements PagoConDescuento {
    private String numeroTarjeta;
    private String titular;

    public TarjetaCredito(String numeroTarjeta, String titular) {
        this.numeroTarjeta = numeroTarjeta;
        this.titular = titular;
    }

    @Override
    public boolean procesarPago(double monto) {
        System.out.println("procesando pago con tarjeta de credito: " + monto);
        // Lógica real de procesamiento de pago
        return true;
    }

    @Override
    public double aplicarDescuento(double monto) {
        double descuento = monto * 0.05; 
        System.out.println("descuento aplicado: " + descuento);
        return monto - descuento;
    }

    // Getters
    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public String getTitular() {
        return titular;
    }
}