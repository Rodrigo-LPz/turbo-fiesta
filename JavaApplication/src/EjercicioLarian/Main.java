/**
 *
 * @author Rodrigo
 */
package EjercicioLarian;

// Importa de la biblioteca/librería todos los paquetes "io".
import java.io.*;
// Importa de la biblioteca/librería el paquete "ArrayList".
import java.util.ArrayList;

// Crea la clase principal del programa.
public class Main{
    // Crea el método principal del programa.
    public static void main(String[] args){
        // Crea un "ArrayList" que viene de "Vehiculo" con el nombre "coleccion".
        ArrayList<Vehiculo> coleccion = new ArrayList<>();

        // Añade 5 iteracions, objetos, a "Formula".
        coleccion.add(new Formula(350, "Fernando Alonso", 2, "Ferrari", 1600, 6));
        coleccion.add(new Formula(340, "Lewis Hamilton", 7, "Mercedes", 1500, 6));
        coleccion.add(new Formula(360, "Max Verstappen", 3, "Red Bull", 1600, 6));
        coleccion.add(new Formula(330, "Ayrton Senna", 3, "McLaren", 1500, 6));
        coleccion.add(new Formula(320, "Michael Schumacher", 7, "Ferrari", 1600, 6));

        // Añade 5 iteracions, objetos, a "GT".
        coleccion.add(new GT(2, "DB11", true, "Aston Martin", 5200, 12));
        coleccion.add(new GT(4, "Panamera", true, "Porsche", 4800, 8));
        coleccion.add(new GT(2, "Mustang", false, "Ford", 5000, 8));
        coleccion.add(new GT(4, "M5", true, "BMW", 4400, 8));
        coleccion.add(new GT(4, "Giulia", false, "Alfa Romeo", 2900, 6));

        // Crea un bloque de tipo "try-catch" para guardarlo en archivo.
        try (PrintWriter pw = new PrintWriter(new FileWriter("coleccion.txt"))){
            for (Vehiculo v : coleccion) {
                pw.println(v.toString());
                pw.println("------------------------------------------------");
            }
            System.out.println("Colección guardada en coleccion.txt");
            
        // Captura la excepción.
        } catch (IOException e) {
            System.err.println("Error al guardar archivo: " + e.getMessage());
        }
    }
}