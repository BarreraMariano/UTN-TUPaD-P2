/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicotres;

import java.util.ArrayList;

/**
 *
 * @author lucko
 */
public class Profesor {
    private String id;
    private String nombre;
    private String especialidad;
    private ArrayList<Curso> cursos;

    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cursos = new ArrayList<>();
    }

    public void agregarCurso(Curso curso) {
        if (curso != null && !cursos.contains(curso)) {
            this.cursos.add(curso);
            
            if (curso.getProfesor() != this) {
                curso.setProfesor(this);
            }
        }
    }

    public void eliminarCurso(Curso curso) {
        if (curso != null && cursos.contains(curso)) {
            this.cursos.remove(curso);
            if (curso.getProfesor() == this) {
                curso.setProfesor(null);
            }
        }
    }

    public void listarCursos() {
        if (cursos.isEmpty()) {
            System.out.println("El profesor " + nombre + " no esta en ningun curso.");
        }
        
        System.out.println("Los cursos esta por " + nombre + ":");
        for (Curso curso : cursos) {
            System.out.println("  - " + curso.getCodigo() + ": " + curso.getNombre());
        }
    }

    public void mostrarInfo() {
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Especialidad: " + especialidad);
        System.out.println("Cantidad de cursos: " + cursos.size());
        listarCursos();
        System.out.println();
    }

    
    public String getId() { 
        return id; 
    }
    
    public String getNombre() { 
        return nombre; 
    }
    
    public String getEspecialidad() { 
        return especialidad; 
    }
    
    public ArrayList<Curso> getCursos() { 
        return new ArrayList<>(cursos); 
    } 

    public void setNombre(String nombre) { 
        this.nombre = nombre; 
    }
    
    public void setEspecialidad(String especialidad) { 
        this.especialidad = especialidad; 
    }
}
