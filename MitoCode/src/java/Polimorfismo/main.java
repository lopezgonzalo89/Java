package Polimorfismo;

public class main {
    public static void main(String[] args) {
        Perro dogo = new Perro();
        
        dogo.setNombre("Rocky");
        dogo.setTipo_alimientacion("carne");
        
        dogo.getNombre();
        dogo.alimentarse();
        
        //Instancio directo de animal porque Caballo no tiene un metodo unico
        //Instancio otro objeto con el metodo abstracto diferente
        Animal spirit = new Caballo();
        
        spirit.setNombre("Spirit");
        
        System.out.println(spirit.getNombre());
        spirit.alimentarse();
        spirit.moverse();        
        
        /*
        El mismo metodo .alimentarse() de Animal
        devuelve dos resultados diferentes
        porque fueron sobreescritos
        por dos instancias diferentes.
        Una instancia puede no usar el metodo abstracto        
        */
    }
}
