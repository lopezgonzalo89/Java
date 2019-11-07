package Encapsulamiento;

public class main {

    //Lo importante es como se usa un metodo y no como está hecho
    public static void main(String[] args) {
        /*
        split y length por ejemplo son metodos encapsulados
        no sabemos como funcionan, ni podemos modificarlos.
        Podemos usarlos
         */
        String nombres = "Gonzalo,Juan,Laura";
        String[] listaNombres = nombres.split(",");
        int cantNombres = listaNombres.length;
        
        for (int i = 0; i < cantNombres; i++){            
            String nombre = listaNombres[i];
            System.out.println(nombre);
        }
    }
}
