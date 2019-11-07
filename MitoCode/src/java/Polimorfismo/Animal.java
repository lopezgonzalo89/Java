package Polimorfismo;

//Abstrac no permite instancia de ésta clase (osea el new)
public abstract class Animal {
    private String nombre;
    private String tipo_alimientacion;
    private int edad;

    public Animal() {        
    }
    
    public Animal(String nombre, String tipo_alimientacion, int edad) {
        this.nombre = nombre;
        this.tipo_alimientacion = tipo_alimientacion;
        this.edad = edad;
    }    
    //Se va a comportar de distintas maneras según el objeto que lo instancie
    //Por éste motivo no puede implementarse en la clase Super
    public abstract void alimentarse();

    public void moverse(){        
        System.out.println(getNombre() + " se está moviendo");
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
