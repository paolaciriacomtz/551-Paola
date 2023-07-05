
package excepciones6;

public class Excepciones6 {

    public static void main(String[] args) {
        try {
			System.out.println("Siguiente mensaje en 1 segundo");
			Thread.sleep(1000);
			System.out.println("Siguiente mensaje en 2 segundos");
			Thread.sleep(2000);
			System.out.println("Siguiente mensaje en 3 segundos");
			Thread.sleep(3000);
			System.out.println("Mensaje Final");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
    }
    
}
