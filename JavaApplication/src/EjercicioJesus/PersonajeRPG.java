/**
 *
 * @author Rodrigo
 */
package EjercicioJesus;


// Importa de la biblioteca/librería el paquete "Random".
import java.util.Random;
// Importa de la biblioteca/librería el paquete "Scanner".
import java.util.Scanner;

// Crea la clase principal del programa.
public class PersonajeRPG{
    // Crea el método principal del programa.
    public static void main(String[] args){
        // Crea el escáner 'user'
        Scanner user = new Scanner(System.in);
        Random rand = new Random();
        
        // Datos básicos del personaje a pedir al usuario.
        System.out.print("Introduce el nombre del personaje: ");
        String nombre = user.nextLine();
        
        System.out.print("Introduce el peso del personaje (kg): ");
        double peso = user.nextDouble();
        
        System.out.print("Introduce la altura del personaje (m): ");
        double altura = user.nextDouble();
        
        // Estadísticas iniciales (tirada del 1 a 20) de forma aleatoria, 'random'.
        int fuerza = rand.nextInt(20) + 1;
        int carisma = rand.nextInt(20) + 1;
        int inteligencia = rand.nextInt(20) + 1;
        int destreza = rand.nextInt(20) + 1;
        
        // Muestreo de los datos del personaje.
        System.out.println("\n\t\t\t<======= PERSONAJE CREADO =======>\n\n");
        mostrarEstadisticas(nombre, peso, altura, fuerza, carisma, inteligencia, destreza);
        
        // Declara una variable numérica para contabilizar las modificaciones permitidas.
        int cambiosRestantes = 4;
        
        // Crea un bucle de tipo "do-while" para realizar por consola las modificaciones al menos una vez tras la ejecución del programa.
        do{
            System.out.println("\n¿Quieres modificar alguna estadística? (Sí/no)");
            String opcion = user.next();
            
            // Crea un condicional de tipo "IF" para las distintas opciones.
            if (!opcion.equalsIgnoreCase("no")){
                // Muestreo de las opciones.
                System.out.println("Elige qué estadística modificar:");
                System.out.println("\t1. Fuerza");
                System.out.println("\t2. Carisma");
                System.out.println("\t3. Inteligencia");
                System.out.println("\t4. Destreza");
                int eleccion = user.nextInt();
                
                int nuevaTirada = rand.nextInt(20) + 1; // Nueva tirada de dado.
                
                // Crea un condicional de tipo "switch" para las distintas opciones.
                switch (eleccion){
                    case 1 ->{
                        fuerza = nuevaTirada;
                        System.out.println("\tNueva Fuerza: " + fuerza);
                    }
                    case 2 ->{
                        carisma = nuevaTirada;
                        System.out.println("\tNuevo Carisma: " + carisma);
                    }
                    case 3 ->{
                        inteligencia = nuevaTirada;
                        System.out.println("\tNueva Inteligencia: " + inteligencia);
                    }
                    case 4 ->{
                        destreza = nuevaTirada;
                        System.out.println("\tNueva Destreza: " + destreza);
                    }
                    default -> System.out.println("\n\nError. La opción seleccionada no existe o no la reconoce el sistema.");
                }
                
                cambiosRestantes--;
                System.out.println("\nCambios restantes: " + cambiosRestantes);
                mostrarEstadisticas(nombre, peso, altura, fuerza, carisma, inteligencia, destreza);
            } if ("no".equals(opcion)){
                break;
            } 
            else {
                System.err.println("Error. Opción no válida o no la reconoce el sistema");
                break;
            }
        } while (cambiosRestantes > 0);
        
        System.out.println("\n<======= Estadísticas finales del personaje =======>\n\n");
        mostrarEstadisticas(nombre, peso, altura, fuerza, carisma, inteligencia, destreza);
        
        // Cierra/Finaliza el escáner.
        user.close();
    }
    
    // Muestreo del resultado final, de la ficha del personaje creado, al usuario.
    private static void mostrarEstadisticas(String nombre, double peso, double altura, int fuerza, int carisma, int inteligencia, int destreza) {
        System.out.println("Nombre: " + nombre);
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Altura: " + altura + " m");
        System.out.println("Fuerza: " + fuerza);
        System.out.println("Carisma: " + carisma);
        System.out.println("Inteligencia: " + inteligencia);
        System.out.println("Destreza: " + destreza);
    }
}