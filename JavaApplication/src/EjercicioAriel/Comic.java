/**
 *
 * @author Rodrigo
 */
package EjercicioAriel;

// Crea la clase "comic."
class Comic_Mnaga{
    // Declara los atributos de las variables privadas.
    private String nombre;
    private String autor;
    private String editorial;
    private double precio;
    private String tipo;
    
    // Crea el constructor.
    public Comic_Mnaga(String nombre, String autor, String editorial, double precio, String tipo){
        this.nombre = nombre;
        this.autor = autor;
        this.editorial = editorial;
        this.precio = precio;
        this.tipo = tipo;
    }
    
    // Crea el método "get" para obtener la variable "tipo".
    public String getTipo(){
        return tipo;
    }
    
    // Crea el método "toString" para rescribir las variables.
    @Override
    public String toString(){
        return "Comic/Manga{" + 
                    "\n\tNombre: " + nombre + "." +
                    "\n\tAutor: " + autor + "" +
                    "\n\tEditorial: " + editorial + "." +
                    "\n\tPrecio: " + precio + "." +
                    "\n\tTipo: " + tipo + "." +
               '}';
    }
}
