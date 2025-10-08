/**
 *
 * @author Rodrigo
 */
package EjercicioJoel;


import java.util.Scanner;

public class Juego_PPT{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido a Piedra, Papel o Tijera!");
        System.out.println("Elige tu opción: piedra[0], papel[1], tijera[2]: ");
        int jugador = sc.nextInt();

        // Validar opción del jugador
        if (jugador < 0 || jugador > 2){
            System.out.println("Opción no válida.");
            return;
        }

        // Opción de la computadora
        int computadora = (int) (Math.random() * 3); // 0, 1 o 2

        // Mostrar elecciones
        String[] opciones = {"Piedra", "Papel", "Tijera"};
        System.out.println("Tú elegiste: " + opciones[jugador]);
        System.out.println("La computadora eligió: " + opciones[computadora]);

        // Determinar resultado
        if (jugador == computadora){
            System.out.println("¡Empate!");
        } else if ((jugador == 0 && computadora == 2) ||
                   (jugador == 1 && computadora == 0) ||
                   (jugador == 2 && computadora == 1)){
            System.out.println("¡Ganaste!");
        } else {
            System.out.println("¡Perdiste!");
        }
    }
}