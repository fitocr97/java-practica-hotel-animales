
package Modelo;

import java.time.LocalDateTime;

/**
 *
 * @author Rodolfo
 */
public class Pajaro extends Animal{
    boolean vuela;

    public Pajaro() {
    }

    public Pajaro(String id, String nombre, int edad, String tipo, LocalDateTime horaEntrada, LocalDateTime horaSalida, int tiempoPermanecia, double total) {
        super(id, nombre, edad, tipo, horaEntrada, horaSalida, tiempoPermanecia, total);
    }

    

    public boolean isVuela() {
        return vuela;
    }

    public void setVuela(boolean vuela) {
        this.vuela = vuela;
    }

    
}
