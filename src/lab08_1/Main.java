/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab08_1;

/**
 *
 * @author HP
 */
public class Main {
    public static void main(String[] args) {
        ProductoElectronico electronicos = new ProductoElectronico();
        electronicos.agregarProducto("Laptop", 1500);
        electronicos.agregarProducto("Smartphone", 800);

        ProductoAlimento alimentos = new ProductoAlimento();
        alimentos.agregarProducto("Manzana", 1.5);
        alimentos.agregarProducto("Pan", 0.5);

        System.out.println("Precios de electrónicos:");
        electronicos.mostrarPrecios();

        System.out.println("\nNombres y precios de alimentos:");
        alimentos.mostrarNombreYPrecios();
    }
}
