package Herencia;

public class Perro extends Animal{
    private String raza;

    //Constructor por defecto
    public Perro() {
    }        
    //Constructor con parametros
    public Perro(String raza, String nombre, String tipo_alimientacion, int edad) {
        //Super obtiene los parametros de su SuperClase
        super(nombre, tipo_alimientacion, edad);
        this.raza = raza;
    }
    
    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    public void getPerro(){
        System.out.println("Nombre: " + getNombre() + ", Raza: " + getRaza() + ", Edad: " + getEdad() + ", Alimentación: " + getTipo_alimientacion());
    }
}
