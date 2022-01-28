package Semana_2;

import static Semana_2.Animales.*;

import java.util.Scanner;

public class Lab2P2_LaraDavid_22141143 {
    // Clase Scanner
    public static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {

        // Declaración de variables
        int opcion;

        do {
            System.out.println("""
                    Bienvenido al programa  programa de registro de animales
                    1. Registrar animal
                    2. Editar animal
                    3. Imprimir lista de animales
                    4. Alimentar animal
                    5. Salir
                    Seleccione una opción:""");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el nombre científico del animal:");
                    String nombre = leer.next();
                    registerAnimal(nombre);
                    break;
                case 2:
                    System.out.println("Ingrese el nombre científico del animal:");
                    String nombre2 = leer.next();
                    editAnimal(nombre2);
                    break;
                case 3:
                    imprimirAnimales();
                    break;
                case 4:
                    cadenaAlimenticia();
                    break;
                case 5:
                    System.out.println("Gracias por utilizar el programa!");
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
        } while (opcion != 5);
    }

}
