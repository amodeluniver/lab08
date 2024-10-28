
package lab08_1;

/**
 *
 * @author Alexander Vilca Tapia
 */
public class ProductoAlimento extends Producto {
    @Override
    public void mostrarPrecios() {
        for (Double precio : productos.values()) {
            System.out.println("Precio: " + precio);
        }
    }

    @Override
    public void mostrarNombreYPrecios() {
        for (Map.Entry<String, Double> entry : productos.entrySet()) {
            System.out.println("Producto: " + entry.getKey() + " - Precio: " + entry.getValue());
        }
    }
}