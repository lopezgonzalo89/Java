package Polimorfismo;

public class main {
    public static void main(String[] args) {
        Perro dogo = new Perro();
        
        dogo.setNombre("Rocky");
        dogo.setTipo_alimientacion("carne");
        
        dogo.getNombre();
        dogo.alimentarse();
        
        //Se puede instanciar directo de Animal porque Caballo no tiene un método único
        //Instancia otro objeto con el método abstracto sobreescrito
        Animal spirit = new Caballo();
        
        spirit.setNombre("Spirit");
        
        System.out.println(spirit.getNombre());
        spirit.alimentarse();
        spirit.moverse();        
        
        /*
        El mismo método .alimentarse() de Animal
        devuelve dos resultados diferentes
        porque fueron sobreescritos
        por dos instancias diferentes.
        Una instancia puede no usar el método abstracto        
        */
    }
}
