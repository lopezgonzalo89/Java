package Polimorfismo;

public class Perro extends Animal {

    private String raza;

    public Perro() {
    }

    public Perro(String raza, String nombre, String tipo_alimientacion, int edad) {
        super(nombre, tipo_alimientacion, edad);
        this.raza = raza;
    }
    
    //Override indica que voy a sobreescribir la logica del metodo
    @Override
    public void alimentarse() {
        System.out.println(getNombre() + " se alimenta de " + getTipo_alimientacion());        
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void getPerro() {
        System.out.println("Nombre: " + getNombre() + ", Raza: " + getRaza() + ", Edad: " + getEdad() + ", Alimentación: " + getTipo_alimientacion());
    }
}
