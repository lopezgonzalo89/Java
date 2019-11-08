package Interface;

/*
    A diferencia de polimorfismo la clase no herede (extends)
    se implementa (implements)
    Se deben usar TODOS los métodos abstarctos de la interface
    Se pueden implementar diferentes interfaces
*/
public class Perro implements Animal, Mamifero{

    @Override
    public void mostrarTipoDeAnimal() {        
        System.out.println("Es un animal juguetón");
    }

    @Override
    public String mostrarNombre() {
        return "Rocky";
    }

    @Override
    public void esMamifero() {
        System.out.println("Es un mamifero");
    }

    
}
