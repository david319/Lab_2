package Semana_2;

import java.util.ArrayList;

public class Animales {

    // Atributos
    private static boolean verify = false;
    private static ArrayList<Animal> listaAnimales = new ArrayList<>();

    // Funciones
    public static void verify(String nombreCientifico) {
        for (int i = 0; i < listaAnimales.size(); i++) {
            if (listaAnimales.get(i).getNombreCientifico().equals(nombreCientifico)) {
                verify = true;
            }
        }
    }

    public static void registerAnimal(Animal animal) {
        if (!verify) {
            listaAnimales.add(animal);
        } else {
            System.out.println("El animal ya existe");
        }
    }



}
