
package Servicio;

import Modelo.Animal;
import Persistencia.ArchivoHotel;
import java.util.ArrayList;


public class GestorHotel {
    
    private ArrayList<Animal> animales = new ArrayList<>();
    private ArchivoHotel documento = new ArchivoHotel();

    public GestorHotel() {
        animales = documento.cargar(); //carga si hay archivo
    }
    
    
    //guardar
    public void guardar(Animal animal){
        animales.add(animal);
        documento.guardar(animales);
    }
    
    
    //mostrar
    public ArrayList<Animal> listar(){
        return animales;
    }
    
    
    //Buscar animal
    public Animal buscar(String id) {

        for (Animal g : animales) {
            if (g.getId().equalsIgnoreCase(id)) {
                return g;
            }
        }

        return null;
    }
    
    public void eliminar(String ID) {

        Animal a = buscar(ID);

        if (a != null) {
            animales.remove(a);
            documento.guardar(animales);
        }
    }
   
    
}

