package Semana_2;

public class Animal {
    // Atributos
    private static String nombreCientifico;
    private static String nombreComun;
    private static String habitad;
    private static String alimentacion;
    private static String rasgos;
    private static int vida;

    // Constructor
    public Animal(String nombreCientifico, String nombreComun, String habitad, String alimentacion, String rasgos, int vida) {
        Animal.nombreCientifico = nombreCientifico;
        Animal.nombreComun = nombreComun;
        Animal.habitad = habitad;
        Animal.alimentacion = alimentacion;
        Animal.rasgos = rasgos;
        Animal.vida = vida;
    }

    // Métodos
    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public static void setNombreCientifico(String nombreCientifico) {
        Animal.nombreCientifico = nombreCientifico;
    }

    public String getNombreComun() {
        return nombreComun;
    }

    public static void setNombreComun(String nombreComun) {
        Animal.nombreComun = nombreComun;
    }

    public String getHabitad() {
        return habitad;
    }

    public static void setHabitad(String habitad) {
        Animal.habitad = habitad;
    }

    public String getAlimentacion() {
        return alimentacion;
    }

    public static void setAlimentacion(String alimentacion) {
        Animal.alimentacion = alimentacion;
    }

    public String getRasgos() {
        return rasgos;
    }

    public static void setRasgos(String rasgos) {
        Animal.rasgos = rasgos;
    }

    public int getVida() {
        return vida;
    }

    public static void setVida(int vida) {
        Animal.vida = vida;
    }

    public String toString() {
        return "Nombre científico: " + nombreCientifico + "\nNombre común: " + nombreComun + "\nHabitad: " + habitad +
                "\nAlimentación: " + alimentacion + "\nRasgos: " + rasgos + "\nVida: " + vida;
    }
}
