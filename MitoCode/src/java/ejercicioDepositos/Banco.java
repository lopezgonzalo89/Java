package ejercicioDepositos;

public class Banco {
    private String nombre;
    private Usuario usser1, usser2, usser3;

    public Banco(String nombre, Usuario usser1, Usuario usser2, Usuario usser3) {
        this.nombre = nombre;
        this.usser1 = usser1;
        this.usser2 = usser2;
        this.usser3 = usser3;
    }    

    public String getNombre() {
        return nombre;
    }

    public Usuario getUsser1() {
        return usser1;
    }

    public Usuario getUsser2() {
        return usser2;
    }

    public Usuario getUsser3() {
        return usser3;
    }
    
}