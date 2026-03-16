
package Modelo;

import java.io.Serializable;

public abstract class Animal implements Serializable{
    
    String id;
    String nombre;
    int edad;

    public Animal() {
    }

    public Animal(String id, String nombre, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
    }

    
    
    
    
}
