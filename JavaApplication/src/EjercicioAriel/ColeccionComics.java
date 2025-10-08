/**
 *
 * @author Rodrigo
 */
package EjercicioAriel;


// Importa de la biblioteca/librería el paquete "Random".
import java.util.ArrayList;
// Importa de la biblioteca/librería el paquete "InputMismatchException".
import java.util.InputMismatchException;
// Importa de la biblioteca/librería el paquete "Scanner".
import java.util.Scanner;

// Crea la clase principal del programa.
public class ColeccionComics{
    // Crea un escáner "user" de carácter privado.
    private static Scanner user = new Scanner(System.in);
    
    // Crea un 'ArrayList' llamado "coleccion" que viene de la clase "Comic" de carácter privado. 
    private static ArrayList<Comic_Mnaga> coleccion = new ArrayList<>();
    
    // Crea el método principal del programa.
    public static void main(String[] args){
        // Declara una variable numérica.
        int opcion;
        
        // Crea un bucle de tipo "do-while" para asegurarse que éste se ejecute al menos una vez desde la ejecución del programa.
        do{
            mostrarMenu();
            opcion = leerEntero("\nElige una opción: ");
            
            // Crea un condicional de tipo "switch" donde en función del valor dado a la variable "opcion" por parte del usuario, se ejecute uno u otro método.
            switch (opcion){
                case 1 -> agregarElemento();
                case 2 -> mostrarElementos();
                case 3 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Error. La opción seleccionada no es válida o no la reconoce el sistema. Intenta de nuevo.");
            }
        } while (opcion != 3);
    }
    
    // Crea el método "mostrarMenu".
    private static void mostrarMenu(){
        // Muestreo de las opciones posibles a escoger.
        System.out.println("\n\t\t\t<======= GESTIÓN DE COLECCIÓN DE COMICS Y MANGAS =======>");
        System.out.println("\t\t1. Agregar nuevo elemento");
        System.out.println("\t\t2. Consultar/mostrar elementos");
        System.out.println("\t\t3. Salir");
    }
    
    // Crea el método "mostrarMenu".
    private static void agregarElemento(){
        System.out.println("\n\t\t\t<=======  Agregar nuevo Comic/Manga =======>");

        System.out.print("\t\tNombre: ");
        String nombre = user.nextLine();

        System.out.print("\t\tAutor: ");
        String autor = user.nextLine();

        System.out.print("\t\tEditorial: ");
        String editorial = user.nextLine();

        double precio = leerDouble("\t\tPrecio (€): ");

        String tipo;
        
        // Crea un bucle de tipo "do-while" para asegurarse que éste se ejecute al menos una vez desde la ejecución del programa.
        do{
            System.out.print("Tipo (Comic/Manga): ");
            tipo = user.nextLine().trim();
        } while (!(tipo.equalsIgnoreCase("Comic") || tipo.equalsIgnoreCase("Manga")));
        
        // Se añade una nueva iteración, objeto, al array "coleccion".
        coleccion.add(new Comic_Mnaga(nombre, autor, editorial, precio, tipo));
        System.out.println("Elemento agregado con éxito.");
    }
    
    // Crea el método "mostrarElementos".
    private static void mostrarElementos(){
        // Crea un bucle de tipo "if" para comprobar si "coleccion" está vacía.
        if (coleccion.isEmpty()) {
            System.out.println("La colección está vacía.");
            return;
        }
        
        // Muestreo de las opciones posibles a escoger.
        System.out.println("\n\t\t\t<======= Consultar colección =======>");
        System.out.println("1. Mostrar todos");
        System.out.println("2. Filtrar por tipo (Comic/Manga)");

        int opcion = leerEntero("Elige una opción: ");
        switch (opcion){
            case 1 ->{
                System.out.println("\nColección completa:");
                coleccion.forEach(System.out::println);
            }
            case 2 ->{
                System.out.print("Introduce el tipo a filtrar (Comic/Manga): ");
                String filtro = user.nextLine().trim();
                System.out.println("\nResultados:");
                coleccion.stream()
                         .filter(c -> c.getTipo().equalsIgnoreCase(filtro))
                         .forEach(System.out::println);
            }
            default -> System.out.println("Error. La opción escogida no es válida o no la reconoce el sistema.");
        }
    }

    // Métodos auxiliares para validar entrada
    private static int leerEntero(String mensaje){
        // Declara una variable numérica.
        int num;
        // Crea un condicional de tipo "while".
        while (true){
            // Crea un bloque de tipo "try-catch".
            try{
                System.out.print(mensaje);
                num = Integer.parseInt(user.nextLine());
                return num;
            // Se captura la excepcion.
            } catch (NumberFormatException nfe){
                System.out.println("Error. Ingresa un número entero válido." + nfe);
            }
        }
    }

    // Métodos auxiliares para validar entrada
    private static double leerDouble(String mensaje){
        // Declara una variable numérica.
        double num;
        // Crea un condicional de tipo "while".
        while (true){
            // Crea un bloque de tipo "try-catch".
            try{
                System.out.print(mensaje);
                num = Double.parseDouble(user.nextLine());
                return num;
            } catch (NumberFormatException e){
                System.out.println("Error. Ingresa un número válido (ej: 12.5).");
            }
        }
    }
}