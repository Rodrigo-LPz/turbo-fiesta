/**
 *
 * @author Rodrigo
 */
package EjercicioAlexander;


// Importa de la biblioteca/librería el paquete "Scanner".
import java.util.Scanner;

// Crea la clase principal del programa.
public class TiendaInformática{
    // Crea un objeto "Scanner", con el atributo "static" hacemos que éste pueda ser compartido por los demás métodos.
    static Scanner user = new Scanner(System.in);
    
    // Crea un objeto "array" "inventario" que viene de "Producto", éste tendrá un máximo de 100 productos como capacidad.
    static Producto[] inventario = new Producto[100];
    
    // Crea un objeto variable "totalProductos" que tendrá la función de contador.
    static int totalProductos = 0;
    
    // Crea el método principal del programa.
    public static void main(String[] args){
        // Bienvenida al usuario.
        System.out.print("Bienvenido/a al programa 'Tienda Informática', por favor, ingrese su nombre: ");
        String nombre = user.nextLine();
        
        System.out.println("\n\nBienvenido/a al programa " + nombre);
        
        // Bucle "while" con el que llamar a una de las acciones a ejecutar.
        while (true){
        System.out.println("\n<=============== Menú de la Tienda de Productos Informáticos ===============>");
        System.out.println("\n\t\t\t1. Agregar producto. [1]\n\t\t2. Ver inventario. [2]\n\t\t3. Realizar venta. [3]\n\t\t4. Salir. [4]");
            System.out.print("\n\nPor favor, introduzca que acción desea realizar: ");
            int opcion = user.nextInt();
            user.nextLine(); // Limpiar el buffer
            
            // Condicional "switch" con el que llamar al método pedido.
            switch (opcion){
                case 1:
                    agregarProducto();
                    break;
                case 2:
                    verInventario();
                    break;
                case 3:
                    realizarVenta();
                    break;
                case 4:
                    System.out.println("¡Gracias por usar el sistema!");
                    return;
                default:
                    System.out.println("\n\nError. Opción no válida o  no la reconoce el sistema. Recuerde que debe ser [1] para agregar producto. [2] para ver inventario. [3] para realizar venta. [4] para salir.`\n\tPor favor intente de nuevo: ");
            }
        }
    }
    
    // Método para agregar un producto al inventario.
    public static void agregarProducto(){
        System.out.print("\nIngrese el nombre del producto: ");
        String nombre = user.nextLine();
        System.out.print("\nIngrese el precio del producto: ");
        double precio = user.nextDouble();
        System.out.print("\nIngrese la cantidad en stock disponible: ");
        int stock = user.nextInt();
        user.nextLine(); // Limpiar el buffer

        inventario[totalProductos] = new Producto(nombre, precio, stock);
        totalProductos++;

        System.out.println("\n\nProducto agregado exitosamente.");
    }

    // Método para ver el inventario.
    public static void verInventario(){
        // Condicional "if-else" para comprobar que el inventario, stock, no esté vacío.
        if (totalProductos == 0){
            System.out.println("\nEl inventario está vacío.");
        } else{
            System.out.println("\n\t<=== Inventario ===>");
            for (int i = 0; i < totalProductos; i++){
                inventario[i].mostrarDetalles();
                System.out.println("\n====================================");
            }
        }
    }

    // Método para realizar una venta.
    public static void realizarVenta(){
        // Condicional "if" para comprobar que el inventario, stock, no esté vacío.
        if (totalProductos == 0){
            System.out.println("No hay productos disponibles para vender.");
            return;
        }

        System.out.println("\n\t<=== Realizar Venta ===>");
        System.out.print("Ingrese el número del producto que desea vender (1 - " + totalProductos + "): ");
        int productoSeleccionado = user.nextInt() - 1;
        
        // Condicional "if" para validar la opción.
        if (productoSeleccionado < 0 || productoSeleccionado >= totalProductos){
            System.out.println("Opción no válida.");
            return;
        }

        Producto producto = inventario[productoSeleccionado];
        producto.mostrarDetalles();

        System.out.print("Ingrese la cantidad que desea vender: ");
        int cantidad = user.nextInt();
        
        // Condicional "if" para confirmar la venta.
        if (producto.vender(cantidad)){
            System.out.println("Venta realizada con éxito.");
        } else{
            System.out.println("No hay suficiente stock para realizar la venta.");
        }
        
    // Cierra/Finaliza el escáner.
    user.close();
    }
}