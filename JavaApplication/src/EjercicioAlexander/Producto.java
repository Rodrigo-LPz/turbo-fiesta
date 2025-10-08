/**
 *
 * @author Rodrigo
 */
package EjercicioAlexander;

// Crea la clase "Producto".
class Producto{
    // Declara las variables.
    String nombre;
    double precio;
    int stock;

    // Crea el constructor.
    public Producto(String nombre, double precio, int stock){
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    // Crea el método para mostrar los detalles del producto.
    public void mostrarDetalles(){
        System.out.println("\tEl producto en cuestión es : " + nombre + "\n\tCon un precio de: $" + precio + "€\n\t. Actualmente tenemos en stock disponible: " + stock + " unidades del producto.");
    }

    // Crea el método para vender un producto.
    public boolean vender(int cantidad){
        // Condicional "if" para reducir/disminuir el stock del producto.
        if (cantidad <= stock){
            stock -= cantidad;
            return true;
        }
        
        // Devuelve "false" si no queda stock del producto.
        return false;
    }
}