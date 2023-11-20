import java.util.Scanner;
import java.util.Random;

class juegoPPT {
    public static void main(String[] args) {
        String[] opciones = {"piedra", "papel", "tijera"};
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        int victoriasUsuario = 0;
        int victoriasComputadora = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Elige una opción: piedra, papel, tijera");
            String eleccionUsuario = scanner.nextLine().toLowerCase();

            String eleccionComputadora = opciones[rand.nextInt(opciones.length)];

            System.out.println("La computadora eligió: " + eleccionComputadora);

            if (eleccionUsuario.equals(eleccionComputadora)) {
                System.out.println("Es un empate");
            } else if ((eleccionUsuario.equals("piedra") && eleccionComputadora.equals("tijera")) ||
                    (eleccionUsuario.equals("papel") && eleccionComputadora.equals("piedra")) ||
                    (eleccionUsuario.equals("tijera") && eleccionComputadora.equals("papel"))) {
                System.out.println("Ganaste la ronda");
                victoriasUsuario++;
            } else {
                System.out.println("Perdiste la ronda");
                victoriasComputadora++;
            }
        }

        System.out.println("Tus victorias: " + victoriasUsuario);
        System.out.println("Victorias de la computadora: " + victoriasComputadora);

        if (victoriasUsuario > victoriasComputadora) {
            System.out.println("Ganaste la partida");
        } else if (victoriasUsuario < victoriasComputadora) {
            System.out.println("Perdiste la partida");
        } else {
            System.out.println("La partida terminó en empate");
        }
    }
}