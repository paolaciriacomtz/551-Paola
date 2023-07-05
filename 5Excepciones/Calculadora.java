
package calculadora;

public class Calculadora {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        try {
            double resultado = calc.dividir(10,5);
            System.out.println("El resultado es: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir por cero.");
        }
    }

    public double dividir(double dividendo, double divisor) {
        return dividendo / divisor;
    }
}
    