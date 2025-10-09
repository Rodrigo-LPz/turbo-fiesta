/**
 *
 * @author Rodrigo
 */
package EjercicioLarian;


// Importa de la biblioteca/librería el paquete "Serializable".
import java.io.Serializable;

// Crea la clase "Vehiculo".
abstract class Vehiculo implements Serializable{
    // Declara los atributos mediante variables privadas.
    protected int cilindrada;
    protected String marca;
    protected int motor;
    
    // Crea el constructor.
    public Vehiculo(String marca, int cilindrada, int motor){
        this.marca = marca;
        this.cilindrada = cilindrada;
        this.motor = motor;
    }
    
    // Crea los métodos "get" para obtener los atributos.
    public int getCilindrada(){ return cilindrada; }
    public String getMarca(){ return marca; }
    public int getMotor(){ return motor; }
    
    // Crea los métodos "set" para poner los atributos.
    public void setCilindrada(int cilindrada){ this.cilindrada = cilindrada; }
    public void setMarca(String marca){ this.marca = marca; }
    public void setMotor(int motor){ this.motor = motor; }
    
    // Crea los métodos "toString" para rescribir los atributos.
    @Override
    public String toString(){
        return "Vehiculo{" +
                    "\n\tCilindrada: " + cilindrada + "CV (caballos de fuerza)." +
                    "\n\tMarca: " + marca + "." +
                    "\n\tMotor: V" + motor + "." +
               '}';
    }
}