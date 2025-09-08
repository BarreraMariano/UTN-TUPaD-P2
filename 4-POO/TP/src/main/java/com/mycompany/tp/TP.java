/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tp;

/**
 *
 * @author lucko
 */
public class TP {

    public static void main(String[] args) {
        
        Empleado empleadoUno = new Empleado(1, "JUAN", "PROGRAMADOR", 2000.50);
        Empleado empleadoDos = new Empleado(2, "LUCAS", "EMPRESARIO", 15000.50);
        Empleado empleadoTres = new Empleado("FERNADO", "PELUCQUERO");
        Empleado empleadoCuatro = new Empleado( "FACUNDO", "ABOGADO");
        
        System.out.println(empleadoUno);
        System.out.println(empleadoDos);
        System.out.println(empleadoTres);
        System.out.println(empleadoCuatro);
        
        System.out.println("");
        
        empleadoUno.actualizarSalario(10);        
        empleadoDos.actualizarSalario(65);  
        empleadoTres.actualizarSalario(); 
        empleadoCuatro.actualizarSalario();
        
        System.out.println(empleadoUno);
        System.out.println(empleadoDos);
        System.out.println(empleadoTres);
        System.out.println(empleadoCuatro);
        
        System.out.println("");
        
        int cantidadDeEmpleados = Empleado.mostrarTotalEmpleados();
        System.out.println("la cantidad de empleados es: " + cantidadDeEmpleados);
    }
}
