/**
 *
 * @author Rodrigo
 */
package EjercicioAlexander;


// Importa de la biblioteca/librer�a el paquete "Scanner".
import java.util.Scanner;

// Crea la clase principal del programa.
public class TiendaInform�tica{
    // Crea un objeto "Scanner", con el atributo "static" hacemos que �ste pueda ser compartido por los dem�s m�todos.
    static Scanner user = new Scanner(System.in);
    
    // Crea un objeto "array" "inventario" que viene de "Producto", �ste tendr� un m�ximo de 100 productos como capacidad.
    static Producto[] inventario = new Producto[100];
    
    // Crea un objeto variable "totalProductos" que tendr� la funci�n de contador.
    static int totalProductos = 0;
    
    // Crea el m�todo principal del programa.
    public static void main(String[] args){
        // Bienvenida al usuario.
        System.out.print("Bienvenido/a al programa 'Tienda Inform�tica', por favor, ingrese su nombre: ");
        String nombre = user.nextLine();
        
        System.out.println("\n\nBienvenido/a al programa " + nombre);
        
        // Bucle "while" con el que llamar a una de las acciones a ejecutar.
        while (true){
        System.out.println("\n<=============== Men� de la Tienda de Productos Inform�ticos ===============>");
        System.out.println("\n\t\t\t1. Agregar producto. [1]\n\t\t2. Ver inventario. [2]\n\t\t3. Realizar venta. [3]\n\t\t4. Salir. [4]");
            System.out.print("\n\nPor favor, introduzca que acci�n desea realizar: ");
            int opcion = user.nextInt();
            user.nextLine(); // Limpiar el buffer
            
            // Condicional "switch" con el que llamar al m�todo pedido.
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
                    System.out.println("�Gracias por usar el sistema!");
                    return;
                default:
                    System.out.println("\n\nError. Opci�n no v�lida o  no la reconoce el sistema. Recuerde que debe ser [1] para agregar producto. [2] para ver inventario. [3] para realizar venta. [4] para salir.`\n\tPor favor intente de nuevo: ");
            }
        }
    }
    
    // M�todo para agregar un producto al inventario.
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

    // M�todo para ver el inventario.
    public static void verInventario(){
        // Condicional "if-else" para comprobar que el inventario, stock, no est� vac�o.
        if (totalProductos == 0){
            System.out.println("\nEl inventario est� vac�o.");
        } else{
            System.out.println("\n\t<=== Inventario ===>");
            for (int i = 0; i < totalProductos; i++){
                inventario[i].mostrarDetalles();
                System.out.println("\n====================================");
            }
        }
    }

    // M�todo para realizar una venta.
    public static void realizarVenta(){
        // Condicional "if" para comprobar que el inventario, stock, no est� vac�o.
        if (totalProductos == 0){
            System.out.println("No hay productos disponibles para vender.");
            return;
        }

        System.out.println("\n\t<=== Realizar Venta ===>");
        System.out.print("Ingrese el n�mero del producto que desea vender (1 - " + totalProductos + "): ");
        int productoSeleccionado = user.nextInt() - 1;
        
        // Condicional "if" para validar la opci�n.
        if (productoSeleccionado < 0 || productoSeleccionado >= totalProductos){
            System.out.println("Opci�n no v�lida.");
            return;
        }

        Producto producto = inventario[productoSeleccionado];
        producto.mostrarDetalles();

        System.out.print("Ingrese la cantidad que desea vender: ");
        int cantidad = user.nextInt();
        
        // Condicional "if" para confirmar la venta.
        if (producto.vender(cantidad)){
            System.out.println("Venta realizada con �xito.");
        } else{
            System.out.println("No hay suficiente stock para realizar la venta.");
        }
        
    // Cierra/Finaliza el esc�ner.
    user.close();
    }
}