/**
 *
 * @author Rodrigo
 */
package EjercicioLarian;

// Crea la clase "GT", que se hereda de la clase padre "Vehiculo".
public class GT extends Vehiculo{
    // Declara los atributos mediante variables privadas.
    private int puertas;
    private String modelo;
    
    // Crea el constructor.
    public GT(int puertas, String modelo, boolean par1, String marca, int cilindrada, int motor) {
        super(marca, cilindrada, motor);
        this.puertas = puertas;
        this.modelo = modelo;
    }
    
    // Crea los métodos "get" para obtener los atributos.
    public int getPuertas() { return puertas; }
    public String getModelo() { return modelo; }
    
    // Crea los métodos "set" para poner los atributos.
    public void setPuertas(int puertas) { this.puertas = puertas; }
    public void setModelo(String modelo) { this.modelo = modelo; }
    
    // Crea los métodos "set" para poner los atributos.
    @Override
    public String toString(){
        return "GT (Gran Turismo){" +
                    "\n\tModelo: " + modelo + "." +
                    "\n\tPuertas: " + puertas + "." +
                    "\n\tMarca: " + getMarca() + "." +
                    "\n\tCilindrada: " + getCilindrada() + "CV (caballos de fuerza)." +
                    "\n\tMotor: V" + getMotor() + "." +
               "}";
    }
}
