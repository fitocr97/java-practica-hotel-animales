
package Persistencia;

import Modelo.Animal;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class ArchivoHotel {
    
    private String archivo = "animales.dat";
    
    
    public void guardar(ArrayList<Animal> animales){
        
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivo));
            oos.writeObject(animales); //guarda todo el array
            oos.close();
        } catch (Exception e) {
            System.out.println("Error guardando archivo");
        }
        
    }
    
    public ArrayList<Animal> cargar() {

        try {
            System.out.println("cargo segudna vez");
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo));
            ArrayList<Animal> animales = (ArrayList<Animal>) ois.readObject();
            ois.close();
            return animales;
        } catch (Exception e) {
            System.out.println("cargo primear ves");
            return new ArrayList<>(); //crea un nuevo array si no hay
        }
    }
    
}
