/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciotres;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author lucko
 */
public class EjercicioTres {

    public static void main(String[] args) {
         List<Empleado> empleados = Arrays.asList(
            new EmpleadoPlanta("ana", 2500),
            new EmpleadoTemporal("luis", 20, 80)
        );

        for (Empleado emp : empleados) {
            System.out.println(emp.nombre + " suedo: " + emp.calcularSueldo());
            if (emp instanceof EmpleadoPlanta) {
                System.out.println("empleado de planta");
                System.out.println();
            } else if (emp instanceof EmpleadoTemporal) {
                System.out.println("empleado temporal");
            }
        }
    }
}
