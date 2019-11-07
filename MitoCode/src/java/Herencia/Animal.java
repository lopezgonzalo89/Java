package Herencia;

public class Animal {
    // Las clases que ereden de animal pueden NO usar algunos atributos
    private String nombre;
    private String tipo_alimientacion;
    private int edad;

    public Animal() {
        // Constructor por defecto para usar uno o varios atributos
    }
    //Constructor con parametros
    public Animal(String nombre, String tipo_alimientacion, int edad) {
        this.nombre = nombre;
        this.tipo_alimientacion = tipo_alimientacion;
        this.edad = edad;
    }              

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo_alimientacion() {
        return tipo_alimientacion;
    }

    public void setTipo_alimientacion(String tipo_alimientacion) {
        this.tipo_alimientacion = tipo_alimientacion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }       
}
