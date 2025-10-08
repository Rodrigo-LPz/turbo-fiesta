/**
 *
 * @author Alumno
 */
package EjercicioAday;


import java.util.Scanner;
import javax.swing.JOptionPane;

class Cuenta{
    // Variable privada.
    private double saldo;

    // Constructor.
    public Cuenta(double saldo){ this.saldo = saldo; }


    // Método "ingresar".
    public void ingresar(double cantidad){
        // Bucle para comprobar que el saldo es mayor a cero
        if (cantidad > 0){
        saldo += cantidad;
        javax.swing.JOptionPane.showMessageDialog(null, "Operación realizada. Has ingresado " + cantidad + "€.\n\tTu saldo actual es de " + saldo + "€.", "Operación realizada", JOptionPane.INFORMATION_MESSAGE);
        } else{
            javax.swing.JOptionPane.showMessageDialog(null, "Error. No se pude ingresar una cantidad negativa.", "Error de saldo", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Método "ingresar".
    public void retirar(double cantidad){
        // Bucle para comprobar que el dinero a retirar es inferior o igual a cero e inferiror al saldo actual.
        if (cantidad > saldo){
        saldo += cantidad;
            javax.swing.JOptionPane.showMessageDialog(null, "Error. No tienes saldo suficiente a retirar.", "Error de saldo", JOptionPane.ERROR_MESSAGE);
        } else if(cantidad <= 0){
            javax.swing.JOptionPane.showMessageDialog(null, "Error. La cantidad a retirar debe ser mayor a cero.", "Error de saldo", JOptionPane.ERROR_MESSAGE);
        } else{
            saldo -= cantidad;
            javax.swing.JOptionPane.showMessageDialog(null, "Operación realizada. Has retirado " + cantidad + "€. Tu saldo actual es de " + saldo + "€.", "Operación realizada", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    // Método para ver el saldo actual.
    public double getSaldo(){
        return saldo;
    }
}

public class Banco{
    public static void main(String[] args){
        Cuenta saldoActual = new Cuenta(1000);
        
        Scanner user = new Scanner(System.in);
        System.out.println("Saldo de la cuenta actual: " + saldoActual + "€.\n");
        System.out.print("Qué operación desea realziar?: ingresar[1] o retirar[2]: ");
        int opción = user.nextInt();
        user.nextLine();
        
        switch (opción){
            // Caso para ingresar.
            case 1:
                System.out.print("\n¿Cuánto dinero desea ingresar? ");
                double cantidadIngresar = user.nextDouble();
                saldoActual.ingresar(cantidadIngresar);
                break;
                
            // Caso para retirar.
            case 2:
                System.out.print("\n¿Cuánto dinero desea retirar? ");
                double cantidadRetirar = user.nextDouble();
                saldoActual.retirar(cantidadRetirar);
                break;
            default:
                throw new AssertionError();
        }
    }
}