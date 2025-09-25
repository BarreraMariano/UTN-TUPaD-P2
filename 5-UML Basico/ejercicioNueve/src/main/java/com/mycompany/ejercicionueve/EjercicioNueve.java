/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicionueve;

/**
 *
 * @author lucko
 */
public class EjercicioNueve {

    public static void main(String[] args) {
        CitaMedica cita = new CitaMedica("12/04/2000", "12:45");
        Profesional pro = new Profesional("Juan", "Otorrino");
        Paciente pac = new Paciente("mariano", "OSDE");
        
        cita.setPaciente(pac);
        cita.setProfesional(pro);
        
        cita.mostrarCita();
    }
}
