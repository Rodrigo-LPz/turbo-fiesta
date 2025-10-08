/**
 *
 * @author Rodrigo
 */
package EjercicioLarian;


// Crea la clase "Formula", que se hereda de la clase padre "Vehiculo".
public class Formula extends Vehiculo{
    // Declara los atributos mediante variables privadas.
    private int velocidadPunta;
    private String piloto;
    private int campeonatosGanados;
    
    // Crea el constructor.
    public Formula(int velocidadPunta, String piloto, int campeonatosGanados, String marca, int cilindrada, int motor){
        super(marca, cilindrada, motor);
        this.velocidadPunta = velocidadPunta;
        this.piloto = piloto;
        this.campeonatosGanados = campeonatosGanados;
    }
    
    // Crea los métodos "get" para obtener los atributos.
    public int getVelocidadPunta(){ return velocidadPunta; }
    public String getPiloto(){ return piloto; }
    public int getCampeonatosGanados(){ return campeonatosGanados; }
    
    // Crea los métodos "set" para poner los atributos.
    public void setVelocidadPunta(int velocidadPunta){ this.velocidadPunta = velocidadPunta; }
    public void setPiloto(String piloto){ this.piloto = piloto; }
    public void setCampeonatosGanados(int campeonatosGanados){ this.campeonatosGanados = campeonatosGanados; }
    
    // Crea los métodos "toString" para rescribir los atributos.
    @Override
    public String toString(){
        return "Formula{" +
                    "\n\tVelocidad Punta: " + velocidadPunta + "Km/h." +
                    "\n\tPiloto: " + piloto + "." + 
                    "\n\tCampeonatosGanados: " + campeonatosGanados + " veces." +
               '}';
    }
    
}