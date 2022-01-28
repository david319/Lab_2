package Semana_2;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.ArrayList;

public class Animales {
    public static Scanner leer = new Scanner(System.in);

    // Atributos
    private static int vidaA; // Vida del animal a Alimentar
    public static int vidaD; // Vida del animal a Devorar
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

    public static void registerAnimal(String nombreCientifico) {
        if (!verify) {
            System.out.println("Ingrese el nombre común del animal:");
            String nombreComun = leer.nextLine();
            System.out.println("Ingrese el habitad del animal:");
            String habitad = leer.nextLine();
            System.out.println("Ingrese la alimentación del animal:");
            String alimentacion = leer.nextLine();
            System.out.println("Ingrese los rasgos del animal:");
            String rasgos = leer.nextLine();
            System.out.println("Ingrese la vida del animal:");
            int vida = leer.nextInt();
            Animal animal = new Animal(nombreCientifico,nombreComun, habitad, alimentacion, rasgos, vida);
        } else {
            System.out.println("El animal ya existe");
        }
    }

    public static void editAnimal(String nombreCientifico){
        for (int i = 0; i < listaAnimales.size(); i++) {
            if (listaAnimales.get(i).getNombreCientifico().equals(nombreCientifico)) {
                System.out.println("""
                        Desea editar todos los datos o solo uno?
                        1. Editar todos los datos
                        2. Editar solo un dato
                        Seleccione una opción:""");
                int opcion = leer.nextInt();
                if (opcion == 1) {
                    System.out.println("Ingrese el nuevo nombre científico:");
                    Animal.setNombreCientifico(leer.next());
                    System.out.println("Ingrese el nuevo nombre común:");
                    Animal.setNombreComun(leer.next());
                    System.out.println("Ingrese la nueva habitad:");
                    Animal.setHabitad(leer.next());
                    System.out.println("Ingrese el nuevo tipo de alimentación:");
                    Animal.setAlimentacion(leer.next());
                    System.out.println("Ingrese los nuevos tipos de rasgos:");
                    Animal.setRasgos(leer.next());
                    System.out.println("Ingrese la nueva cantidad de vida:");
                    Animal.setVida(leer.nextInt());
                    System.out.println("Se han editado todos los datos del animal!");
                } else if (opcion == 2) {
                    System.out.println("""
                            Seleccione el dato que desea editar:
                            1. Nombre científico
                            2. Nombre común
                            3. Habitad
                            4. Alimentación
                            5. Rasgos
                            6. Vida
                            Seleccione una opción:""");
                    int opcion2 = leer.nextInt();
                    if (opcion2 == 1) {
                        System.out.println("Ingrese el nuevo nombre científico:");
                        Animal.setNombreCientifico(leer.next());
                    } else if (opcion2 == 2) {
                        System.out.println("Ingrese el nuevo nombre común:");
                        Animal.setNombreComun(leer.next());
                    } else if (opcion2 == 3) {
                        System.out.println("Ingrese la nueva habitad:");
                        Animal.setHabitad(leer.next());
                    } else if (opcion2 == 4) {
                        System.out.println("Ingrese el nuevo tipo de alimentación:");
                        Animal.setAlimentacion(leer.next());
                    } else if (opcion2 == 5) {
                        System.out.println("Ingrese los nuevos tipos de rasgos:");
                        Animal.setRasgos(leer.next());
                    } else if (opcion2 == 6) {
                        System.out.println("Ingrese la nueva cantidad de vida:");
                        Animal.setVida(leer.nextInt());
                    } else {
                        System.out.println("Opción inválida");
                    }
                } else {
                    System.out.println("Opción inválida");
                }
            } else {
                System.out.println("El animal no existe");
            }
        }
    }

    public static void imprimirAnimales(){
        System.out.println("""
                Listar animales
                1. Imprimir por posición de la lista
                2. Imprimir lista completa
                3. Imprimir por nombre científico
                Seleccione una opción:""");
        int opcion = leer.nextInt();
        if (opcion == 1) {
            System.out.println("Ingrese la posición del animal que desea imprimir");
            System.out.println("Ingrese un numero del 0 al " + listaAnimales.size() + ":");
            int posicion = leer.nextInt();
            for (int i = 0; i < listaAnimales.size(); i++) {
                if (i == posicion) {
                    System.out.println(listaAnimales.get(i));
                } else {
                    System.out.println("El animal no existe");
                }
            }
        } else if (opcion == 2) {
            System.out.println("Lista completa de animales:");
            for (Animal listaAnimale : listaAnimales) {
                System.out.println(listaAnimale);
            }
        } else if (opcion == 3) {
            System.out.println("Ingrese el nombre científico del animal que desea imprimir:");
            String nombreCientifico = leer.next();
            for (Animal listaAnimale : listaAnimales) {
                if (listaAnimale.getNombreCientifico().equals(nombreCientifico)) {
                    System.out.println(listaAnimale);
                }
            }
        } else {
            System.out.println("Nombre inválido");
        }
    }

    public static void cadenaAlimenticia(){
        System.out.println("Seleccione el animal que desea alimentar");
        for (int i = 0; i < listaAnimales.size(); i++) {
            System.out.println(i + ". " + listaAnimales.get(i).getNombreCientifico());
        }
        System.out.println("Ingrese un numero del 0 al " + listaAnimales.size() + ":");
        int opcion = leer.nextInt();
        for (int i = 0; i < listaAnimales.size(); i++) {
            if (i == opcion) {
                vidaA = listaAnimales.get(i).getVida();
            } else {
                System.out.println("El animal no existe");
            }
        }

        System.out.println("Seleccione el animal a devorar");
        for (int i = 0; i < listaAnimales.size(); i++) {
            System.out.println(i + ". " + listaAnimales.get(i).getNombreCientifico());
        }
        System.out.println("Ingrese un numero del 0 al " + listaAnimales.size() + ":");
        int opcion2 = leer.nextInt();
        for (int i = 0; i < listaAnimales.size(); i++) {
            if (i == opcion2) {
                vidaD = listaAnimales.get(i).getVida();
            }
        }

        if (vidaA > vidaD) {
            System.out.println("El animal a alimentar es más fuerte");

        }







    }

}
