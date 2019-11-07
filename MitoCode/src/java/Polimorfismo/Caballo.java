package Polimorfismo;

public class Caballo extends Animal{
    //Override indica que voy a sobreescribir la logica del metodo
    //En éste caso es distinta a la logica de Perro
    @Override
    public void alimentarse() {
        System.out.println("Yo me alimento de hierbas");
    }            
}
