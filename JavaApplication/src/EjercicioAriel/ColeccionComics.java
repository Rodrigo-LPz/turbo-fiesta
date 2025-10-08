/**
 *
 * @author Rodrigo
 */
package EjercicioAriel;


// Importa de la biblioteca/librer�a el paquete "Random".
import java.util.ArrayList;
// Importa de la biblioteca/librer�a el paquete "InputMismatchException".
import java.util.InputMismatchException;
// Importa de la biblioteca/librer�a el paquete "Scanner".
import java.util.Scanner;

// Crea la clase principal del programa.
public class ColeccionComics{
    // Crea un esc�ner "user" de car�cter privado.
    private static Scanner user = new Scanner(System.in);
    
    // Crea un 'ArrayList' llamado "coleccion" que viene de la clase "Comic" de car�cter privado. 
    private static ArrayList<Comic_Mnaga> coleccion = new ArrayList<>();
    
    // Crea el m�todo principal del programa.
    public static void main(String[] args){
        // Declara una variable num�rica.
        int opcion;
        
        // Crea un bucle de tipo "do-while" para asegurarse que �ste se ejecute al menos una vez desde la ejecuci�n del programa.
        do{
            mostrarMenu();
            opcion = leerEntero("\nElige una opci�n: ");
            
            // Crea un condicional de tipo "switch" donde en funci�n del valor dado a la variable "opcion" por parte del usuario, se ejecute uno u otro m�todo.
            switch (opcion){
                case 1 -> agregarElemento();
                case 2 -> mostrarElementos();
                case 3 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Error. La opci�n seleccionada no es v�lida o no la reconoce el sistema. Intenta de nuevo.");
            }
        } while (opcion != 3);
    }
    
    // Crea el m�todo "mostrarMenu".
    private static void mostrarMenu(){
        // Muestreo de las opciones posibles a escoger.
        System.out.println("\n\t\t\t<======= GESTI�N DE COLECCI�N DE COMICS Y MANGAS =======>");
        System.out.println("\t\t1. Agregar nuevo elemento");
        System.out.println("\t\t2. Consultar/mostrar elementos");
        System.out.println("\t\t3. Salir");
    }
    
    // Crea el m�todo "mostrarMenu".
    private static void agregarElemento(){
        System.out.println("\n\t\t\t<=======  Agregar nuevo Comic/Manga =======>");

        System.out.print("\t\tNombre: ");
        String nombre = user.nextLine();

        System.out.print("\t\tAutor: ");
        String autor = user.nextLine();

        System.out.print("\t\tEditorial: ");
        String editorial = user.nextLine();

        double precio = leerDouble("\t\tPrecio (�): ");

        String tipo;
        
        // Crea un bucle de tipo "do-while" para asegurarse que �ste se ejecute al menos una vez desde la ejecuci�n del programa.
        do{
            System.out.print("Tipo (Comic/Manga): ");
            tipo = user.nextLine().trim();
        } while (!(tipo.equalsIgnoreCase("Comic") || tipo.equalsIgnoreCase("Manga")));
        
        // Se a�ade una nueva iteraci�n, objeto, al array "coleccion".
        coleccion.add(new Comic_Mnaga(nombre, autor, editorial, precio, tipo));
        System.out.println("Elemento agregado con �xito.");
    }
    
    // Crea el m�todo "mostrarElementos".
    private static void mostrarElementos(){
        // Crea un bucle de tipo "if" para comprobar si "coleccion" est� vac�a.
        if (coleccion.isEmpty()) {
            System.out.println("La colecci�n est� vac�a.");
            return;
        }
        
        // Muestreo de las opciones posibles a escoger.
        System.out.println("\n\t\t\t<======= Consultar colecci�n =======>");
        System.out.println("1. Mostrar todos");
        System.out.println("2. Filtrar por tipo (Comic/Manga)");

        int opcion = leerEntero("Elige una opci�n: ");
        switch (opcion){
            case 1 ->{
                System.out.println("\nColecci�n completa:");
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
            default -> System.out.println("Error. La opci�n escogida no es v�lida o no la reconoce el sistema.");
        }
    }

    // M�todos auxiliares para validar entrada
    private static int leerEntero(String mensaje){
        // Declara una variable num�rica.
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
                System.out.println("Error. Ingresa un n�mero entero v�lido." + nfe);
            }
        }
    }

    // M�todos auxiliares para validar entrada
    private static double leerDouble(String mensaje){
        // Declara una variable num�rica.
        double num;
        // Crea un condicional de tipo "while".
        while (true){
            // Crea un bloque de tipo "try-catch".
            try{
                System.out.print(mensaje);
                num = Double.parseDouble(user.nextLine());
                return num;
            } catch (NumberFormatException e){
                System.out.println("Error. Ingresa un n�mero v�lido (ej: 12.5).");
            }
        }
    }
}