/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejeciciouno;

/**
 *
 * @author lucko
 */
public class EjecicioUno {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("Juan Perez", "juan@email.com");
        
        Producto producto1 = new Producto("Laptop", 1500.0);
        Producto producto2 = new Producto("Mouse", 25.0);
        Producto producto3 = new Producto("Teclado", 75.0);
       
        
        Pedido pedido = new Pedido(cliente);
        pedido.agregarProducto(producto1);
        pedido.agregarProducto(producto2);
        pedido.agregarProducto(producto3);
        
        System.out.println("=== INFORMACION DEL PEDIDO ===");
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Total del pedido: $" + pedido.calcularTotal());
        System.out.println("Productos en el pedido:");
        for (Producto producto : pedido.getProductos()) {
            System.out.println("  - " + producto);
        }
        
    
        System.out.println("=== PROCESAMIENTO DE PAGOS ===");
        TarjetaCredito tarjeta = new TarjetaCredito("1234-5678-9012-3456", "Juan Perez");
        double totalConDescuento = tarjeta.aplicarDescuento(pedido.calcularTotal());
        tarjeta.procesarPago(totalConDescuento);
        
        PayPal paypal = new PayPal("juan@email.com");
        paypal.procesarPago(pedido.calcularTotal());
        
        System.out.println("=== CAMBIO DE ESTADO ===");
        pedido.cambiarEstado("EN PROCESO");
        pedido.cambiarEstado("ENVIADO");
        pedido.cambiarEstado("ENTREGADO");
    }
}
