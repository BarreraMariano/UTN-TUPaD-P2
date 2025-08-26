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
        Gallina gallinaUno = new Gallina();
        Gallina gallinaDos = new Gallina();
        
        gallinaUno.setIdGallina(1);
        gallinaDos.setIdGallina(2);

        gallinaUno.envenjecer();
        gallinaUno.ponerHuevo();        
        gallinaUno.ponerHuevo(); 
        gallinaUno.ponerHuevo(); 
        gallinaUno.ponerHuevo(); 
        
        gallinaDos.envenjecer();
        gallinaDos.envenjecer();
        gallinaDos.envenjecer();
        gallinaDos.ponerHuevo(); 
        gallinaDos.ponerHuevo();
        
       
        gallinaUno.mostarEstado();
        gallinaDos.mostarEstado();
    }
}
