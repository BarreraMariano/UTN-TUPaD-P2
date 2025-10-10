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
public class Universidad {
    private String nombre;
    private ArrayList<Profesor> profesores;
    private ArrayList<Curso> cursos;

    public Universidad(String nombre) {
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }

    public void agregarProfesor(Profesor profesor) {
        if (profesor != null && !profesores.contains(profesor)) {
            profesores.add(profesor);
            System.out.println("Profesor " + profesor.getNombre() + " agregado a la universidad.");
        }
    }

    public void agregarCurso(Curso curso) {
        if (curso != null && !cursos.contains(curso)) {
            cursos.add(curso);
            System.out.println("Curso " + curso.getNombre() + " agregado a la universidad.");
        }
    }

    public void asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Curso curso = buscarCursoPorCodigo(codigoCurso);
        Profesor profesor = buscarProfesorPorId(idProfesor);

        if (curso != null && profesor != null) {
            curso.setProfesor(profesor);
            System.out.println("Profesor " + profesor.getNombre() + 
                             " asignado al curso " + curso.getNombre());
        } else {
            System.out.println("No se pudo realizar la asignación. Verifique los datos.");
        }
    }

    public void listarProfesores() {
        System.out.println("=== LISTA DE PROFESORES ===");
        if (profesores.isEmpty()) {
            System.out.println("No hay profesores registrados.");
        } else {
            for (Profesor profesor : profesores) {
                profesor.mostrarInfo();
            }
        }
    }

    public void listarCursos() {
        System.out.println("=== LISTA DE CURSOS ===");
        if (cursos.isEmpty()) {
            System.out.println("No hay cursos registrados.");
        } else {
            for (Curso curso : cursos) {
                curso.mostrarInfo();
            }
        }
    }

    public Profesor buscarProfesorPorId(String id) {
        for (Profesor profesor : profesores) {
            if (profesor.getId().equals(id)) {
                return profesor;
            }
        }
        System.out.println("Profesor con ID " + id + " no encontrado.");
        return null;
    }

   
    public Curso buscarCursoPorCodigo(String codigo) {
        for (Curso curso : cursos) {
            if (curso.getCodigo().equals(codigo)) {
                return curso;
            }
        }
        System.out.println("Curso con código " + codigo + " no encontrado.");
        return null;
    }

    public void eliminarCurso(String codigo) {
        Curso curso = buscarCursoPorCodigo(codigo);
        if (curso != null) {
            if (curso.getProfesor() != null) {
                curso.getProfesor().eliminarCurso(curso);
            }
            cursos.remove(curso);
            System.out.println("Curso " + curso.getNombre() + " eliminado.");
        }
    }

    public void eliminarProfesor(String id) {
        Profesor profesor = buscarProfesorPorId(id);
        if (profesor != null) {
            ArrayList<Curso> cursosDelProfesor = new ArrayList<>(profesor.getCursos());
            for (Curso curso : cursosDelProfesor) {
                curso.setProfesor(null);
            }
            profesores.remove(profesor);
            System.out.println("Profesor " + profesor.getNombre() + " eliminado.");
        }
    }

    
    public void generarReporteCursosPorProfesor() {
        System.out.println("=== REPORTE: CURSOS POR PROFESOR ===");
        for (Profesor profesor : profesores) {
            System.out.println(profesor.getNombre() + ": " + 
                             profesor.getCursos().size() + " cursos");
        }
        System.out.println();
    }

    
    public String getNombre() { 
        return nombre; 
    }
    
    public ArrayList<Profesor> getProfesores() { 
        return new ArrayList<>(profesores); 
    }
    
    public ArrayList<Curso> getCursos() { 
        return new ArrayList<>(cursos); 
    }
}
