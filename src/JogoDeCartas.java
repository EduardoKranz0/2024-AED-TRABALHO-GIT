import java.util.Scanner;

public class JogoDeCartas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BaralhoService baralhoService = new BaralhoService();
        CartaService cartaService = new CartaService();

        baralhoService.iniciarJogo();

        while (true) {
            System.out.println("Digite '1' para distribuir uma carta, '2' para exibir o baralho, ou '0' para sair:");
            int escolha = scanner.nextInt();

            if (escolha == 1) {
                Carta carta = baralhoService.distribuirCarta();
                cartaService.exibirCarta(carta);
            } else if (escolha == 2) {
                baralhoService.exibirBaralho();
            } else if (escolha == 0) {
                System.out.println("Jogo encerrado.");
                break;
            } else {
                System.out.println("Escolha inválida. Tente novamente.");
            }
        }

        scanner.close();
    }
}