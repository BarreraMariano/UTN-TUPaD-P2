/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicioocho;

/**
 *
 * @author lucko
 */
public class Documento {
    private String titulo;
    private String contenido;
    private FirmaDigital firma;

    public Documento(String titulo, String contenido, String codigoHash, String fecha) {
        this.titulo = titulo;
        this.contenido = contenido;
        
        Usuario usuario = new Usuario("mariano", "mari@gmail.com");
        this.firma = new FirmaDigital(codigoHash, fecha, usuario);
    }
    
    
    public void mostrarDocumento() {
        System.out.println("Titulo document: " + titulo + " contenido: " + contenido);
        System.out.println("Codigo firma: " + firma.getCodigoHash() + " fecha cordoba: " + firma.getFecha());
        firma.mostrarUsuario();
    }
}
