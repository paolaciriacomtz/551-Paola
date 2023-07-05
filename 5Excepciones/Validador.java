
package validador;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Validador {
    public static void main(String[] args) {
        Validador validador = new Validador();
        try {
            int numero = validador.solicitarNumero();
            if (validador.esPositivo(numero)) {
                System.out.println("El número es positivo.");
            } else {
                System.out.println("El número no es positivo.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Debe ingresar un número válido.");
        }
    }

    public int solicitarNumero() throws InputMismatchException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número:");
        int numero = scanner.nextInt();
        scanner.close();
        return numero;
    }

    public boolean esPositivo(int numero) {
        return numero > 0;
    }
}
