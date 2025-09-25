/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciocatorce;

/**
 *
 * @author lucko
 */
public class EjercicioCatorce {

    public static void main(String[] args) {
         Proyecto proyecto = new Proyecto("Documental Naturaleza", 120);
        EditorVideo editor = new EditorVideo();
        
        editor.exportar("MP4-1080p", proyecto);
    }
}
