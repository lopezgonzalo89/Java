package Herencia;

public class main {
    public static void main(String[] args) {
        //Instancia con constructor por defecto
        Perro dogo = new Perro();
                
        dogo.setNombre("Rocky");
        dogo.setRaza("Dogo");
        dogo.setEdad(3);
        dogo.setTipo_alimientacion("Carinivoro");
        
        dogo.getPerro();
        
        //Instancia con constructor con parametros
        Perro pastor = new Perro("Pastor Aleman", "Ivan Drago", "Carnivoro", 2);
        pastor.getPerro();        
    }
}
