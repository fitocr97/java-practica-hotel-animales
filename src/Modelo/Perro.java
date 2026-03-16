
package Modelo;

import java.time.LocalDateTime;

/**
 *
 * @author Rodolfo
 */
public class Perro extends Animal{
    String raza;

    public Perro() {
    }

    public Perro(String id, String nombre, int edad, String tipo, LocalDateTime horaEntrada, LocalDateTime horaSalida, int tiempoPermanecia, double total) {
        super(id, nombre, edad, tipo, horaEntrada, horaSalida, tiempoPermanecia, total);
    }

    

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

  
    
    
    
}
