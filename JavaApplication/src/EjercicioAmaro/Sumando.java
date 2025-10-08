/**
 *
 * @author Rodrigo
 */
package EjercicioAmaro;


// Importa de la biblioteca/librería el paquete "Scanner".
import java.util.Scanner;

// Crea la clase principal del programa.
public class Sumando{
    // Crea el método principal del programa.
    public static void main(String[] args){
        // Crae el escáner 'user'.
        Scanner user = new Scanner(System.in);
        
        int[] numeros = new int[5];   // Array para guardar los 5 números.
        int suma = 0;
        int maximo;
        
        // Introducir números.
        System.out.println("Introduce 5 números enteros:\n");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("\tNúmero " + (i+1) + ": ");
            numeros[i] = user.nextInt();
            suma += numeros[i];
        }
        
        // Calcular el número más grande, el mayor.
        maximo = numeros[0];
        for (int i = 1; i < numeros.length; i++){
            if (numeros[i] > maximo){
                maximo = numeros[i];
            }
        }
        
        // Calcular la media/promedio de los 5 números.
        double promedio = (double) suma / numeros.length;
        
        // Muestreo de los resultados finales al usuario.
        System.out.println("\n\nResultados:");
        System.out.println("\tSuma total = " + suma);
        System.out.println("\tNúmero mayor = " + maximo);
        System.out.println("\tPromedio = " + promedio);
        
        // Cierra/Finaliza el escáner.
        user.close();
    }
}
