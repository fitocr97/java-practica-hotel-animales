
package Modelo;

import java.io.Serializable;
import java.time.LocalDateTime;

public abstract class Animal implements Serializable{
    
    String id;
    String nombre;
    int edad;
    String tipo;
    LocalDateTime horaEntrada;
    LocalDateTime horaSalida;
    int tiempoPermanecia;
    double total;

    public Animal(String id, String nombre, int edad, String tipo, LocalDateTime horaEntrada, LocalDateTime horaSalida, int tiempoPermanecia, double total) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.tipo = tipo;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
        this.tiempoPermanecia = tiempoPermanecia;
        this.total = total;
    }

    public Animal() {
    }
    
    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public LocalDateTime getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(LocalDateTime horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public LocalDateTime getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(LocalDateTime horaSalida) {
        this.horaSalida = horaSalida;
    }

    public int getTiempoPermanecia() {
        return tiempoPermanecia;
    }

    public void setTiempoPermanecia(int tiempoPermanecia) {
        this.tiempoPermanecia = tiempoPermanecia;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

 

    
    
    
    
}
