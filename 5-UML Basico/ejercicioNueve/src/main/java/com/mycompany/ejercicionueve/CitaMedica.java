/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicionueve;

/**
 *
 * @author lucko
 */
public class CitaMedica {
    private String fecha;
    private String hora;
    private Paciente paciente;
    private Profesional profesional;

    public CitaMedica(String fecha, String hora) {
        this.fecha = fecha;
        this.hora = hora;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public void setProfesional(Profesional profesional) {
        this.profesional = profesional;
    }
    
    public void mostrarCita() {
        if (profesional != null && paciente != null) {
            System.out.println("pacienten  nombre " + paciente.getNombre() + " obra social " + paciente.getObrarSocial());
            System.out.println("cita medica hora " + hora + " fecha " + fecha);
            System.out.println("nombre profecional " + profesional.getNombre() + " especialidad " + profesional.getEspecialidad());
        } else {
            System.out.println( " no tiene");
        }
    }
}
