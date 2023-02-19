public class Calculadora {
    private double x;
    private double y;

    public Calculadora(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double sumar() {
        return x + y;
    }

    public double restar() {
        return x - y;
    }

    public double multiplicar() {
        return x * y;
    }

    public double dividir() {
        return x / y;
    }

    public double modulo() {
        return x % y;
    }

    public void imprimirResultados() {
        System.out.println("X = " + x);
        System.out.println("Y = " + y);
        System.out.println("Suma: " + sumar());
        System.out.println("Resta: " + restar());
        System.out.println("Multiplicación: " + multiplicar());
        System.out.println("División: " + dividir());
        System.out.println("Módulo: " + modulo());
    }
}