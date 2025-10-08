/**
 *
 * @author Rodrigo
 */
package EjercicioAlexander;


// Importa de la biblioteca/librer�a el paquete "Scanner".
import java.util.Scanner;
// Importa de la biblioteca/librer�a el paquete "Random".
import java.util.Random;

// Crea la clase principal del programa.
public class AdivinaElNumero{
    // Crea un objeto "Scanner", con el atributo "static" hacemos que �ste pueda ser compartido por los dem�s m�todos.
    public static void main(String[] args){
        // Crea el esc�ner.
        Scanner user = new Scanner(System.in);
        
        // Crea un objeto "random".
        Random random = new Random();

        // Declara las variables con las que generar un n�mero aleatorio entre el 1 y el 100, ambos incluidos.
        int numeroSecreto = random.nextInt(100) + 1;
        int intentos = 0;
        int intentoUsuario = 0;
        
        System.out.println("\n�Bienvenido al juego de Adivina el N�mero!");
        System.out.println("\n\tHe elegido un n�mero entre 1 y 100 (ambos incluidos). No te dejar� salir hasta que lo aciertes. �Intenta adivinarlo!");

        // Bucle "while" para pedir al usuario que ingrese un n�mero hasta que acierte.
        while (intentoUsuario != numeroSecreto){
            System.out.print("\n\n\t\tIntroduce tu n�mero: ");
            intentoUsuario = user.nextInt();
            intentos++;
            
            // Condicional "if" para hacer que el usuario se vaya acercando al n�mero 'secreto' hasta acertarlo.
            if (intentoUsuario < numeroSecreto){
                System.out.println("\t\t\tEl n�mero es mayor. �Sigue intent�ndolo!");
            } else if (intentoUsuario > numeroSecreto){
                System.out.println("\t\t\tEl n�mero es menor. �Sigue intent�ndolo!");
            } else{
                System.out.println("\n\t\t�Felicidades! Adivinaste el n�mero en " + intentos + " intentos.");
            }
        }
        
    // Cierra/Finaliza el esc�ner.
    user.close();
    }
}