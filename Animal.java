package Semana_2;

public class Animal {
    // Atributos
    private String nombreCientifico;
    private String nombreComun;
    private String habitad;
    private String alimentacion;
    private String rasgos;
    private int vida;

    // Constructor
    public Animal(String nombreCientifico, String nombreComun, String habitad, String alimentacion, String rasgos, int vida) {
        this.nombreCientifico = nombreCientifico;
        this.nombreComun = nombreComun;
        this.habitad = habitad;
        this.alimentacion = alimentacion;
        this.rasgos = rasgos;
        this.vida = vida;
    }

    // Métodos
    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public void setNombreComun(String nombreComun) {
        this.nombreComun = nombreComun;
    }

    public void setHabitad(String habitad) {
        this.habitad = habitad;
    }

    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }

    public void setRasgos(String rasgos) {
        this.rasgos = rasgos;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public String toString() {
        return "Nombre científico: " + nombreCientifico + "\nNombre común: " + nombreComun + "\nHabitad: " + habitad +
                "\nAlimentación: " + alimentacion + "\nRasgos: " + rasgos + "\nVida: " + vida + "\n";
    }
}
