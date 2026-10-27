import java.util.Random;

public class EjercicioRandom {

    public static void main(String[] args) {
        final var random = new Random();

        final var numeroAleatorio = RandomUtilities.generarNumeroAleatorio(20, 100, random);
        final var numeroAleatorioDouble = RandomUtilities.generarRandomDouble(100.0, 500.0, random);

        System.out.printf("Número aleatorio entre 20 y 100: %d%n", numeroAleatorio);
        System.out.printf("Número aleatorio double entre 100.0 y 500.0: %.2f%n", numeroAleatorioDouble);
    }
}
