package Semana_2;

public class Animal {
    // Atributos
    String nombreCientifico;
    String nombreComun;
    String habitat;
    String alimentacion;
    String rasgos;
    int vida;

    // Constructor
    public void Animal(String nombreCientifico, String nombreComun, String habitat, String alimentacion, String rasgos, int vida) {
        this.nombreCientifico = nombreCientifico;
        this.nombreComun = nombreComun;
        this.habitat = habitat;
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

    public String getNombreComun() {
        return nombreComun;
    }

    public void setNombreComun(String nombreComun) {
        this.nombreComun = nombreComun;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getAlimentacion() {
        return alimentacion;
    }

    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }

    public String getRasgos() {
        return rasgos;
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
        return "Nombre científico: " + nombreCientifico + "\nNombre común: " + nombreComun + "\nHabitat: " + habitat +
                "\nAlimentación: " + alimentacion + "\nRasgos: " + rasgos + "\nVida: " + vida;
    }
}
