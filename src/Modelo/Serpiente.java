
package Modelo;

import java.time.LocalDateTime;


public class Serpiente extends Animal{
    double longitud;

    public Serpiente() {
    }

    public Serpiente(String id, String nombre, int edad, String tipo, LocalDateTime horaEntrada, LocalDateTime horaSalida, int tiempoPermanecia, double total) {
        super(id, nombre, edad, tipo, horaEntrada, horaSalida, tiempoPermanecia, total);
    }

    

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

   
    
}
