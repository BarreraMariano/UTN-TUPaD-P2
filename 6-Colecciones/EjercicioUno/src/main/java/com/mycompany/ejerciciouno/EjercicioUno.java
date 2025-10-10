/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciouno;

/**
 *
 * @author lucko
 */
public class EjercicioUno {

    public static void main(String[] args) {
        Inventario inv = new Inventario();
        Producto p1 = new Producto("1", "PC", 123.33, 222, CategoriaProducto.ELECTRONICA);
        Producto p2 = new Producto("2", "asado", 456.67, 21, CategoriaProducto.ALIMENTOS);
        Producto p3 = new Producto("3", "celular", 333.2, 67, CategoriaProducto.ELECTRONICA);
        Producto p4 = new Producto("4", "mueble", 1234.76, 222, CategoriaProducto.HOGAR);
        Producto p5 = new Producto("5", "remera", 98.765, 12, CategoriaProducto.ROPA);
        
        
        inv.agregarProducto(p1);
        inv.agregarProducto(p2);
        inv.agregarProducto(p3);
        inv.agregarProducto(p4);
        inv.agregarProducto(p5);
        
        inv.listarProductos();
        
        System.out.println("------------------------------------------");
        System.out.println("Producto encontrado por id");
        System.out.println(inv.buscarProductoPorId("2"));
        
        System.out.println("------------------------------------------");
        System.out.println("Producto encontrado por categoria");
        System.out.println(inv.filtrarPorCategoria(CategoriaProducto.ELECTRONICA));
        
        System.out.println("------------------------------------------");
        System.out.println("Producto eliminado por id");
        inv.eliminarProducto("5");
        
        System.out.println("------------------------------------------");
        System.out.println("Total de stock");
        inv.obtenerTotalStock();
        
        System.out.println("------------------------------------------");
        System.out.println("Productos con mayor stock");
        System.out.println(inv.obtenerProductoConMayorStock());
        
        System.out.println("------------------------------------------");
        System.out.println("Productos por precios");
        System.out.println(inv.filtrarProductosPorPrecio(1000, 3000));
        
        System.out.println("------------------------------------------");
        System.out.println(" Categorias ");
        inv.mostrarCategoriasDisponibles();
        
        
        System.out.println("------------------------------------------");
        inv.actualizarStock("2", 12);
    }    
}
