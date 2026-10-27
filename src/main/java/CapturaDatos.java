import java.util.Scanner;

public class CapturaDatos {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);

        System.out.print("Ingrese su edad: ");
        final var edad = scanner.nextInt();
        System.out.print("Ingrese su estatura en centimetros: ");
        final var estatura = scanner.nextDouble();

        scanner.close();

        imprimirResultado(edad, estatura);
    }

    static void imprimirResultado(int edad, double estatura) {
        System.out.printf("Edad: %d años, Estatura: %.2f centimetros\n", edad, estatura);
    }
}
