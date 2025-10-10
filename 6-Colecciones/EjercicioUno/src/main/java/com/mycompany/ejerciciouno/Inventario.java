/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciouno;

import java.util.ArrayList;

/**
 *
 * @author lucko
 */
public class Inventario {
    private ArrayList<Producto> productos;
    
    public Inventario() {
        this.productos = new ArrayList<>();
    }
    
    public void agregarProducto(Producto p){
        this.productos.add(p);
    }  
    
    public void listarProductos(){
        System.out.println("La lista de productos: ");
        for(int i = 0; i < this.productos.size(); i++){
            System.out.println(this.productos.get(i));
        }
    }
    
    public Producto buscarProductoPorId(String id){
        int i = 0;
        Producto pEncontrado = null;
        
        while (i < productos.size() && !this.productos.get(i).getId().equals(id)) {
            i++;
        }
        if (i < productos.size()) {
            pEncontrado = this.productos.get(i);
        }
        
        return pEncontrado;   
    }  
    
    public ArrayList<Producto> filtrarPorCategoria(CategoriaProducto categoria){
        ArrayList<Producto> pEncontrados = new ArrayList<>();
        
        for (Producto p : productos) {
            if (p.getCategoria() == categoria) {
                pEncontrados.add(p);
            }
        }
        
        return pEncontrados;
    }
    
    public void eliminarProducto(String id) {
        Producto pBorrar = buscarProductoPorId(id);
        
        System.out.println(pBorrar);
        this.productos.remove(pBorrar);
        
        listarProductos();
    }
    
    public void actualizarStock(String id, int nuevaCantidad){
       Producto pActualizar = buscarProductoPorId(id);
       
       System.out.print("Cambiar el stock de" + pActualizar);
       pActualizar.setCantidad(nuevaCantidad);
       
       listarProductos();
    }  
    
    
    
    public void obtenerTotalStock(){
       for(Producto producto: productos){
           System.out.println("nombre: " + producto.getNombre() + " | " +  " strock: " + producto.getCantidad());
       }
    }
    
    public ArrayList<Producto> obtenerProductoConMayorStock(){
        ArrayList<Producto> listaDeMayorStock = new ArrayList<>();
        int stockMin = 0;
        
         for (Producto producto: productos){
            if(producto.getCantidad() == stockMin){
                listaDeMayorStock.add(producto);
                
            }else if (producto.getCantidad() > stockMin){
                stockMin = producto.getCantidad();
                listaDeMayorStock.clear();
                listaDeMayorStock.add(producto);
            }
        }       
        return listaDeMayorStock;
    }  
    
    public ArrayList<Producto> filtrarProductosPorPrecio(double min, double max){
         ArrayList<Producto> listaDePrecios = new ArrayList<>();
         
         for (Producto producto: productos){
             if(producto.getPrecio() < max && producto.getPrecio() > min){
                 listaDePrecios.add(producto);
             }
         }
         
         return listaDePrecios;
    } 
    
    public void mostrarCategoriasDisponibles(){
        for(Producto producto: productos){
            System.out.println("Nombre de categoria: " + producto.getCategoria() + " | " + " Descripcion: " + producto.getCategoria().getDescripcion());
        }
    }
}
