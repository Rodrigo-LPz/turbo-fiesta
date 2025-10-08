/**
 *
 * @author Rodrigo
 */
package EjercicioAlexander;


// Importa de la biblioteca/librería el paquete "Scanner".
import java.util.Scanner;
// Importa de la biblioteca/librería el paquete "Random".
import java.util.Random;

// Crea la clase principal del programa.
public class AdivinaElNumero{
    // Crea un objeto "Scanner", con el atributo "static" hacemos que éste pueda ser compartido por los demás métodos.
    public static void main(String[] args){
        // Crea el escáner.
        Scanner user = new Scanner(System.in);
        
        // Crea un objeto "random".
        Random random = new Random();

        // Declara las variables con las que generar un número aleatorio entre el 1 y el 100, ambos incluidos.
        int numeroSecreto = random.nextInt(100) + 1;
        int intentos = 0;
        int intentoUsuario = 0;
        
        System.out.println("\n¡Bienvenido al juego de Adivina el Número!");
        System.out.println("\n\tHe elegido un número entre 1 y 100 (ambos incluidos). No te dejaré salir hasta que lo aciertes. ¡Intenta adivinarlo!");

        // Bucle "while" para pedir al usuario que ingrese un número hasta que acierte.
        while (intentoUsuario != numeroSecreto){
            System.out.print("\n\n\t\tIntroduce tu número: ");
            intentoUsuario = user.nextInt();
            intentos++;
            
            // Condicional "if" para hacer que el usuario se vaya acercando al número 'secreto' hasta acertarlo.
            if (intentoUsuario < numeroSecreto){
                System.out.println("\t\t\tEl número es mayor. ¡Sigue intentándolo!");
            } else if (intentoUsuario > numeroSecreto){
                System.out.println("\t\t\tEl número es menor. ¡Sigue intentándolo!");
            } else{
                System.out.println("\n\t\t¡Felicidades! Adivinaste el número en " + intentos + " intentos.");
            }
        }
        
    // Cierra/Finaliza el escáner.
    user.close();
    }
}