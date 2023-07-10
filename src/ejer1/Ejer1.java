/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer1;

/**
 *
 * @author jgare
 */
public class Ejer1 {
    public static void main(String[] args) {
        Producto producto = new Producto(1, "Leche", 2.5, 10);
        System.out.println("Código: " + producto.getCodigo());
        System.out.println("Descripción: " + producto.getDescripcion());
        System.out.println("Precio: " + producto.getPrecio());
        System.out.println("Stock: " + producto.getStock());
    }
}
