package Semana_2;

import java.util.Scanner;
import java.util.ArrayList;

public class Animales {
    public static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    // Atributos
    public static int vidaA; // Vida del animal a Alimentar
    public static int vidaD; // Vida del animal a Devorar
    public static int posicionA; // Posición del animal a Alimentar
    public static int posicionD; // Posición del animal a Devorar
    private static boolean verify = false;
    private static ArrayList<Animal> listaAnimales = new ArrayList<>(10);

    // Funciones

    public static void animalsDefect() {
        Animal animal1 = new Animal("Elephantidae", "Elefante", "Sabana",
                "Herbívoro", "Además del gran tamaño es su larga trompa y sus enormes orejas.", 200);
        listaAnimales.add(animal1);
        Animal animal2 = new Animal("Panthera leo", "Leon", "Sabana", "Carnívoro",
                "Cuerpo largo, piernas cortas, garras afiladas y cabeza grande.", 150);
        listaAnimales.add(animal2);
        Animal animal3 = new Animal("Equus zebra", "nombreComun", "Sabana", "Herbívoro",
                "Las cebras se parecen a los caballos.", 80);
        listaAnimales.add(animal3);
    }

    public static void verify(String nombreCientifico) {
        for (Animal listaAnimale : listaAnimales) {
            if (listaAnimale.getNombreCientifico().equals(nombreCientifico)) {
                verify = true;
                break;
            }
        }
    }

    public static void registerAnimal(String nombreCientifico) {
        if (!verify) {
            System.out.println("Ingrese el nombre común del animal:");
            String nombreComun = leer.next().toLowerCase();

            System.out.println("Ingrese el habitad del animal:");
            String habitad = leer.next().toLowerCase();
            System.out.println("Ingrese la alimentación del animal:");
            String alimentacion = leer.next().toLowerCase();
            System.out.println("Ingrese los rasgos del animal:");
            String rasgos = leer.next().toLowerCase();
            System.out.println("Ingrese la vida del animal:");
            int vida = leer.nextInt();
            Animal animal = new Animal(nombreCientifico, nombreComun, habitad, alimentacion, rasgos, vida);
            listaAnimales.add(animal);
        } else {
            System.out.println("El animal ya existe");
        }
    }

    public static void editAnimal(String nombreCientifico) {
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
                    listaAnimales.get(i).setNombreCientifico(leer.next().toLowerCase());
                    System.out.println("Ingrese el nuevo nombre común:");
                    listaAnimales.get(i).setNombreComun(leer.next().toLowerCase());
                    System.out.println("Ingrese la nueva habitad:");
                    listaAnimales.get(i).setHabitad(leer.next().toLowerCase());
                    System.out.println("Ingrese el nuevo tipo de alimentación:");
                    listaAnimales.get(i).setAlimentacion(leer.next().toLowerCase());
                    System.out.println("Ingrese los nuevos tipos de rasgos:");
                    listaAnimales.get(i).setRasgos(leer.next().toLowerCase());
                    System.out.println("Ingrese la nueva cantidad de vida:");
                    listaAnimales.get(i).setVida(leer.nextInt());
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
                        listaAnimales.get(i).setNombreCientifico(leer.next().toLowerCase());
                    } else if (opcion2 == 2) {
                        System.out.println("Ingrese el nuevo nombre común:");
                        listaAnimales.get(i).setNombreComun(leer.next().toLowerCase());
                    } else if (opcion2 == 3) {
                        System.out.println("Ingrese la nueva habitad:");
                        listaAnimales.get(i).setHabitad(leer.next().toLowerCase());
                    } else if (opcion2 == 4) {
                        System.out.println("Ingrese el nuevo tipo de alimentación:");
                        listaAnimales.get(i).setAlimentacion(leer.next().toLowerCase());
                    } else if (opcion2 == 5) {
                        System.out.println("Ingrese los nuevos tipos de rasgos:");
                        listaAnimales.get(i).setRasgos(leer.next().toLowerCase());
                    } else if (opcion2 == 6) {
                        System.out.println("Ingrese la nueva cantidad de vida:");
                        listaAnimales.get(i).setVida(leer.nextInt());
                    } else {
                        System.out.println("Opción inválida");
                    }
                } else {
                    System.out.println("Opción inválida");
                }
            } else if (i == listaAnimales.size() - 1) {
                System.out.println("El animal no existe");
            }
        }
    }

    public static void imprimirAnimales() {
        System.out.println("""
                Listar animales
                1. Imprimir por posición de la lista
                2. Imprimir lista completa
                3. Imprimir por nombre científico
                Seleccione una opción:""");
        int opcion = leer.nextInt();
        if (opcion == 1) {
            System.out.println("Ingrese la posición del animal que desea imprimir");
            System.out.println("Ingrese un numero del 0 al " + (listaAnimales.size() - 1) + ":");
            int posicion = leer.nextInt();
            for (int i = 0; i < listaAnimales.size(); i++) {
                if (i == posicion) {
                    System.out.println(listaAnimales.get(i).toString());
                } else if (i == listaAnimales.size() - 1) {
                    System.out.println("El animal no existe");
                }
            }
        } else if (opcion == 2) {
            System.out.println("Lista completa de animales:");
            for (Animal listaAnimale : listaAnimales) {
                System.out.println(listaAnimale.toString());
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

    public static void eliminarAnimal() {
        for (int i = 0; i < listaAnimales.size(); i++) {
            if (listaAnimales.get(i).getVida() <= 0) {
                listaAnimales.remove(i);
            }
        }
    }

    public static void cadenaAlimenticia() {
        System.out.println("Seleccione el animal que desea alimentar");
        for (int i = 0; i < listaAnimales.size(); i++) {
            System.out.println(i + ". " + listaAnimales.get(i).getNombreCientifico());
        }
        System.out.println("Ingrese un numero del 0 al " + (listaAnimales.size() - 1) + ":");
        int opcion = leer.nextInt();
        for (int i = 0; i < listaAnimales.size(); i++) {
            if (i == opcion) {
                vidaA = listaAnimales.get(i).getVida();
                posicionA = i;
            }
        }

        System.out.println("Seleccione el animal a devorar");
        for (int i = 0; i < listaAnimales.size(); i++) {
            System.out.println(i + ". " + listaAnimales.get(i).getNombreCientifico());
        }
        System.out.println("Ingrese un numero del 0 al " + (listaAnimales.size() - 1) + ":");
        int opcion2 = leer.nextInt();
        for (int i = 0; i < listaAnimales.size(); i++) {
            if (i == opcion2) {
                vidaD = listaAnimales.get(i).getVida();
                posicionD = i;
            }
        }

        for (int i = 0; i < listaAnimales.size(); i++) {
            if (vidaA > vidaD) {
                if (i == posicionA) {
                    listaAnimales.get(i).setVida(vidaA + vidaD);
                    listaAnimales.get(posicionD).setVida(0);
                    System.out.println("\nEl animal " + listaAnimales.get(i).getNombreCientifico() + " ha sido alimentado" +
                            " ahora tiene " + listaAnimales.get(i).getVida() + " de vida\n");
                    eliminarAnimal();
                } else if (i == listaAnimales.size() - 1) {
                    System.out.println("El animal a devorar es mas fuerte que el animal a alimentar");
                }
            }
        }
    }
}
