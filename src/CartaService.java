public class CartaService {
    // Método para exibir uma carta
    public void exibirCarta(Carta carta) {
        if (carta != null) {
            System.out.println("Carta distribuída: " + carta);
        } else {
            System.out.println("Não há mais cartas no baralho.");
        }
    }
}