import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // 1. Criando o array de 10 posições do tipo da Interface
        Voador[] voadores = new Voador[10];
        Random gerador = new Random();

        // Instanciando de forma aleatória
        for (int i = 0; i < voadores.length; i++) {
            int escolha = gerador.nextInt(3); // Gera 0, 1 ou 2

            if (escolha == 0) {
                voadores[i] = new GalinhaVoadora();
            } else if (escolha == 1) {
                voadores[i] = new Drone(80); // Exemplo de bateria
            } else {
                voadores[i] = new Aviao("Boeing 747");
            }
        }

        System.out.println("--- INICIANDO SIMULAÇÃO DE VOO ---");

        // 2. Percorrendo o array e executando as ações
        for (Voador v : voadores) {
            // Chamadas polimórficas abaixo: o Java decide qual método usar
            // baseando-se no objeto real (Galinha, Drone ou Aviao) em tempo de execução.

            v.voar();   // <--- CHAMADA POLIMÓRFICA
            v.planar(); // <--- CHAMADA POLIMÓRFICA
            v.pousar(); // <--- CHAMADA POLIMÓRFICA

            System.out.println("-------------------------");
        }
    }
}