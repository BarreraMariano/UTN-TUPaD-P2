/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciodiez;

/**
 *
 * @author lucko
 */
public class CuentaBancaria {
    private String CBU;
    private String saldo;
    private ClaveSeguridad clave;
    private Titular titular;
            
    public CuentaBancaria(String CBU, String saldo, String codigo, String ultimaM) {
        this.CBU = CBU;
        this.saldo = saldo;
        this.clave = new ClaveSeguridad(codigo, ultimaM);
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
        if(titular != null && titular.getCb() != this){
            titular.setCb(this);
        }
    }

    public String getCBU() {
        return CBU;
    }

    public String getSaldo() {
        return saldo;
    }

    public ClaveSeguridad getClave() {
        return clave;
    }

    public Titular getTitular() {
        return titular;
    }
    
    
    public void mostrarCuenta(){
        System.out.println("CBU: " + CBU + " saldo: " + saldo );
        System.out.println("codigo: " + clave.getCodigo() + " ultima modifcacion: " + clave.getUltimaModificacion() );
    }
}
