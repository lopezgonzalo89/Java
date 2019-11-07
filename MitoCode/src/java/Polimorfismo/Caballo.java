package Polimorfismo;

public class Caballo extends Animal{
    //Override indica que se va a sobreescribir la lógica del método
    //En éste caso es distinta a la lógica de Perro
    @Override
    public void alimentarse() {
        System.out.println("Yo me alimento de hierbas");
    }            
}
