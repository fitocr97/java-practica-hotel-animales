
package Servicio;

import Modelo.Animal;
import Persistencia.ArchivoHotel;
import java.util.ArrayList;


public class GestorHotel {
    
    private ArrayList<Animal> animales = new ArrayList<>();
    private ArchivoHotel documento = new ArchivoHotel();

    public GestorHotel() {
        documento.cargar(); //cargar si hay archivo
    }
    
    public void guardar(Animal animal){
        animales.add(animal);
        documento.guardar(animales);
    }
    
    public ArrayList<Animal> listar(){
        return animales;
    }
   
    
}

