import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int opcion = 0;
        String nombre = "Tony Stark";
        String tipoDeCuenta = "Coreiente";
        Double saldo = 1599.99;

        Scanner sr = new Scanner(System.in);

        System.out.println("****************************************");
        System.out.println("\nNombre del cliente: " + nombre);
        System.out.println("El tipo de cuenta es: " + tipoDeCuenta);
        System.out.println("El saldo disponible es: $" + saldo);
        System.out.println("\n****************************************");

        String menu = """
              *** Seleccione una opcion ***
              1. Consultar saldo
              2. Retirar
              3. Depositar 
              9. Salir
              """;

        while (opcion != 9) {
            System.out.println(menu);
            opcion = sr.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("El saldo es: " + saldo);
                    break;
                case 2:
                    System.out.println("Cuanto desea retirar");
                    double retiro = sr.nextDouble();
                    if (saldo < retiro){
                        System.out.println("No cuenta con saldo suficiente");
                    } else
                        saldo -= retiro;
                        System.out.println("El saldo actua es: $" + saldo);
                    break;
                case 3:
                    System.out.println("Cuanto desea despositar");
                    double deposito = sr.nextDouble();
                    saldo += deposito;
                    System.out.println("El saldo actua es: $" + saldo);
                    break;
                case 9:
                    System.out.println("Gracias por utilizar nuestro servicio");
                    break;
                default:
                    System.out.println("ERROR!...Opcion no disponible");
                    break;
            }
        }
    }
}