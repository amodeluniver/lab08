/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab08_1;

/**
 *
 * @author HP
 */
import java.util.HashMap;
import java.util.Map;

public abstract class Producto implements Operaciones {
    protected Map<String, Double> productos = new HashMap<>();

    public void agregarProducto(String nombre, double precio) {
        productos.put(nombre, precio);
    }
}
