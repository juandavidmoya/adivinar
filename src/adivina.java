import java.util.Scanner;
import java.util.Random;

public class adivina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numeroAleatorio = random.nextInt(100); // Genera un número aleatorio entre 0 y 100
        int intentos = 0;

        System.out.println("¡Bienvenido al juego de adivinar el número!");
        System.out.println("Estoy pensando en un número entre 0 y 100. ¡Intenta adivinarlo!");

        while (true) {
            System.out.print("Introduce tu numero: ");
            int suposicion = scanner.nextInt();
            intentos++;

            if (suposicion == numeroAleatorio) {
                System.out.println("¡Felicidades! ¡Has adivinado el número en " + intentos + " intentos!");
                break;
            } else if (suposicion < numeroAleatorio) {
                System.out.println("El número que estoy pensando es mayor.");
            } else {
                System.out.println("El número que estoy pensando es menor.");
            }
        }

        scanner.close();
    }
}
