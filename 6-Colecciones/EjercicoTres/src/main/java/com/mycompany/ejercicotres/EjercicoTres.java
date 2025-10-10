/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicotres;

/**
 *
 * @author lucko
 */
public class EjercicoTres {

    public static void main(String[] args) {
        Universidad universidad = new Universidad("uni uno");

        Profesor prof1 = new Profesor("P1", "Carlos Mendez", "Matematicas");
        Profesor prof2 = new Profesor("P2", "Ana Lopez", "Fisica");
        Profesor prof3 = new Profesor("P3", "edro Rodriguez", "Programacion");

        Curso curso1 = new Curso("C1", "Calculo I");
        Curso curso2 = new Curso("C2", "Calculo II");
        Curso curso3 = new Curso("C3", "Fisica General");
        Curso curso4 = new Curso("C4", "Programacion I");
        Curso curso5 = new Curso("C5", "Programacion II");

        universidad.agregarProfesor(prof1);
        universidad.agregarProfesor(prof2);
        universidad.agregarProfesor(prof3);

        universidad.agregarCurso(curso1);
        universidad.agregarCurso(curso2);
        universidad.agregarCurso(curso3);
        universidad.agregarCurso(curso4);
        universidad.agregarCurso(curso5);

  
        universidad.asignarProfesorACurso("C1", "P1");
        universidad.asignarProfesorACurso("C2", "P1");
        universidad.asignarProfesorACurso("C3", "P2");
        universidad.asignarProfesorACurso("C4", "P3");
        universidad.asignarProfesorACurso("C5", "P3");

        System.out.println("----------------------------------");
        universidad.listarCursos();
        universidad.listarProfesores();

        System.out.println("---------------------------------------");
        curso1.mostrarInfo();
        prof1.listarCursos();
        
        universidad.asignarProfesorACurso("C1", "P2");
        
        System.out.println("---------------------------------");
        curso1.mostrarInfo();
        prof1.listarCursos();
        prof2.listarCursos();

       
        System.out.println("---------------------------------");
        universidad.eliminarCurso("C4");
        prof3.listarCursos();

        System.out.println("---------------------------------");
        curso5.mostrarInfo();
        
        universidad.eliminarProfesor("P3");
        curso5.mostrarInfo();

       
        System.out.println("---------------------------------");
        universidad.generarReporteCursosPorProfesor();

        
        System.out.println("---------------------------------");
        universidad.listarProfesores();
        universidad.listarCursos();
    }
}
