public class BaralhoService {
    private Baralho baralho;

    // Construtor
    public BaralhoService() {
        this.baralho = new Baralho();
    }

    // Método para iniciar o jogo (embaralhar o baralho)
    public void iniciarJogo() {
        baralho.embaralhar();
        System.out.println("O baralho foi embaralhado.");
    }

    // Método para distribuir uma carta
    public Carta distribuirCarta() {
        return baralho.distribuirCarta();
    }

    // Método para exibir o baralho
    public void exibirBaralho() {
        System.out.println(baralho);
    }
}