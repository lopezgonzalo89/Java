package ejercicioDepositos;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        //HardCode de los usuarios y condicionales
        entities.Usuario Usser1 = new entities.Usuario(1, "Gonzalo", 1000);
        entities.Usuario Usser2 = new entities.Usuario(2, "Juan", 500);
        entities.Usuario Usser3 = new entities.Usuario(3, "Laura", 1500);
        
        entities.Banco banco = new entities.Banco("Santander Rio", Usser1, Usser2, Usser3);

        Scanner sc = new Scanner(System.in);

        System.out.println("................");
        System.out.println("Bienvenidos a " + banco.getNombre());
        System.out.println("El banco cuenta con ");
        System.out.println(Usser1.getSaldo() + Usser2.getSaldo() + Usser3.getSaldo());
        System.out.println("................");
        System.out.println("Por favor ingrese su número de cuenta");
        int cuenta = sc.nextInt();

        String operacion = "";
        switch (cuenta) {
            case 1:
                System.out.println("Buenvenido " + banco.getUsser1().getNombre());
                System.out.println("................");
                System.out.println("Su saldo actual es de " + banco.getUsser1().getSaldo());
                System.out.println("Ingrese la operación a realizar");
                System.out.println("A - Depositar");
                System.out.println("B - Retirar");
                operacion = sc.next();
                switch (operacion) {
                    case "A":
                        System.out.println("................");
                        System.out.println("Ingrese el monto a depositar");
                        double deposito = sc.nextDouble();
                        banco.getUsser1().setSaldo(banco.getUsser1().getSaldo() + deposito);
                        System.out.println("Su monto actual es " + banco.getUsser1().getSaldo());
                        break;
                    case "B":
                        System.out.println("................");
                        System.out.println("Ingrese el monto a retirar");
                        double retiro = sc.nextDouble();
                        banco.getUsser1().setSaldo(banco.getUsser1().getSaldo() - retiro);
                        System.out.println("Su monto actual es " + banco.getUsser1().getSaldo());
                        break;
                }
                break;
            case 2:
                System.out.println("Buenvenido " + banco.getUsser2().getNombre());
                System.out.println("................");
                System.out.println("Su saldo actual es de " + banco.getUsser2().getSaldo());
                System.out.println("Ingrese la operación a realizar");
                System.out.println("A - Depositar");
                System.out.println("B - Retirar");
                operacion = sc.next();
                switch (operacion) {
                    case "A":
                        System.out.println("................");
                        System.out.println("Ingrese el monto a depositar");
                        double deposito = sc.nextDouble();
                        banco.getUsser2().setSaldo(banco.getUsser2().getSaldo() + deposito);
                        System.out.println("Su monto actual es " + banco.getUsser2().getSaldo());
                        break;
                    case "B":
                        System.out.println("................");
                        System.out.println("Ingrese el monto a retirar");
                        double retiro = sc.nextDouble();
                        banco.getUsser2().setSaldo(banco.getUsser2().getSaldo() - retiro);
                        System.out.println("Su monto actual es " + banco.getUsser2().getSaldo());
                        break;
                }
                break;
            case 3:
                System.out.println("Buenvenido " + banco.getUsser3().getNombre());
                System.out.println("................");
                System.out.println("Su saldo actual es de " + banco.getUsser3().getSaldo());
                System.out.println("Ingrese la operación a realizar");
                System.out.println("A - Depositar");
                System.out.println("B - Retirar");
                operacion = sc.next();
                switch (operacion) {
                    case "A":
                        System.out.println("................");
                        System.out.println("Ingrese el monto a depositar");
                        double deposito = sc.nextDouble();
                        banco.getUsser3().setSaldo(banco.getUsser3().getSaldo() + deposito);
                        System.out.println("Su monto actual es " + banco.getUsser3().getSaldo());
                        break;
                    case "B":
                        System.out.println("................");
                        System.out.println("Ingrese el monto a retirar");
                        double retiro = sc.nextDouble();
                        banco.getUsser3().setSaldo(banco.getUsser3().getSaldo() - retiro);
                        System.out.println("Su monto actual es " + banco.getUsser3().getSaldo());
                        break;
                }
                break;
            default:
                System.out.println("Cuenta no registrada");
                System.exit(0);
        }
        System.out.println("El banco cuenta con ");
        System.out.println(banco.getUsser1().getSaldo() + banco.getUsser2().getSaldo() + banco.getUsser3().getSaldo());
    }
}
