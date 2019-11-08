package Interface;

public class main {
    public static void main(String[] args) {
        Perro dogo = new Perro();
        
        dogo.mostrarTipoDeAnimal();
        String nombre = dogo.mostrarNombre();
        
        System.out.println("El nombre del animal es " + nombre);   
        dogo.esMamifero();
    }
}
