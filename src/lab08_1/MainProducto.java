/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab08_1;

/**
 *
 * @author Alexander Vilca Tapia
 */
import java.util.Scanner;

public class MainProducto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductoElectronico electronicos = new ProductoElectronico();
        ProductoAlimento alimentos = new ProductoAlimento();

        // Registro de productos electrónicos
        System.out.println("Ingrese productos electrónicos:");
        for (int i = 0; i < 3; i++) {
            System.out.print("Nombre del producto: ");
            String nombre = scanner.nextLine();
            System.out.print("Precio del producto: ");
            double precio = scanner.nextDouble();
            scanner.nextLine(); // Limpiar buffer
            electronicos.agregarProducto(nombre, precio);
        }

        // Registro de alimentos
        System.out.println("Ingrese productos de alimentos:");
        for (int i = 0; i < 2; i++) {
            System.out.print("Nombre del producto: ");
            String nombre = scanner.nextLine();
            System.out.print("Precio del producto: ");
            double precio = scanner.nextDouble();
            scanner.nextLine(); // Limpiar buffer
            alimentos.agregarProducto(nombre, precio);
        }

        // Mostrar resultados
        System.out.println("\nPrecios de electrónicos:");
        electronicos.mostrarPrecios();

        System.out.println("\nNombres y precios de alimentos:");
        alimentos.mostrarNombreYPrecios();
    }
}
