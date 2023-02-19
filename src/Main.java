import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Calculadora calculadora;
        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;
        while (continuar) {
            System.out.println("Ingrese el primer número:");
            double x = scanner.nextDouble();

            System.out.println("Ingrese el segundo número:");
            double y = scanner.nextDouble();

            calculadora = new Calculadora(x, y);
            calculadora.imprimirResultados();

            System.out.println("Presione 's' para salir o cualquier otra tecla para continuar");
            String opcion = scanner.next();
            if (opcion.equals("s") || (opcion.equals(("S")))) {
                continuar = false;
            }
        }
    }

}
