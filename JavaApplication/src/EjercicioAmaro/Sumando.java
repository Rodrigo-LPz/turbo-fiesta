/**
 *
 * @author Rodrigo
 */
package EjercicioAmaro;


// Importa de la biblioteca/librer�a el paquete "Scanner".
import java.util.Scanner;

// Crea la clase principal del programa.
public class Sumando{
    // Crea el m�todo principal del programa.
    public static void main(String[] args){
        // Crae el esc�ner 'user'.
        Scanner user = new Scanner(System.in);
        
        int[] numeros = new int[5];   // Array para guardar los 5 n�meros.
        int suma = 0;
        int maximo;
        
        // Introducir n�meros.
        System.out.println("Introduce 5 n�meros enteros:\n");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("\tN�mero " + (i+1) + ": ");
            numeros[i] = user.nextInt();
            suma += numeros[i];
        }
        
        // Calcular el n�mero m�s grande, el mayor.
        maximo = numeros[0];
        for (int i = 1; i < numeros.length; i++){
            if (numeros[i] > maximo){
                maximo = numeros[i];
            }
        }
        
        // Calcular la media/promedio de los 5 n�meros.
        double promedio = (double) suma / numeros.length;
        
        // Muestreo de los resultados finales al usuario.
        System.out.println("\n\nResultados:");
        System.out.println("\tSuma total = " + suma);
        System.out.println("\tN�mero mayor = " + maximo);
        System.out.println("\tPromedio = " + promedio);
        
        // Cierra/Finaliza el esc�ner.
        user.close();
    }
}
