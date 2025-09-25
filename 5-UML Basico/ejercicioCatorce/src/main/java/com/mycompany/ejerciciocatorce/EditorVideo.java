/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciocatorce;

/**
 *
 * @author lucko
 */
public class EditorVideo {
      public void exportar(String formato, Proyecto proyecto) {
        Render render = new Render(formato, proyecto);
        
        System.out.println("exportando proyecto");
        System.out.println(render.toString());
        System.out.println("exportación echa");
        
        procesarRender(render);  
    }
      
     private void procesarRender(Render render) {
        System.out.println("procesando render en formato: " + render.getFormato());
        System.out.println("tiempo estimado: " + (render.getProyecto().getDuracionMin() / 2) + " minutos");
    }  
}
