import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Voador[] voadores = new Voador[10];
        Random gerador = new Random();

        for (int i = 0; i < voadores.length; i++) {
            int escolha = gerador.nextInt(3);

            if (escolha == 0) {
                voadores[i] = new GalinhaVoadora();
            } else if (escolha == 1) {
                voadores[i] = new Drone(80);
            } else {
                voadores[i] = new Aviao("Boeing 747");
            }
        }

        System.out.println("INICIANDO SIMULAÇÃO DE VOO");

        for (Voador v : voadores) {

            v.voar();
            v.planar();
            v.pousar();

            System.out.println("-------------------------");
        }
    }
}