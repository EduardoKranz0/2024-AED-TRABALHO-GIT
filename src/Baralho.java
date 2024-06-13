import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baralho {
    private List<Carta> cartas;

    // Construtor
    public Baralho() {
        cartas = new ArrayList<>();
        String[] naipes = {"Copas", "Espadas", "Ouros", "Paus"};
        String[] valores = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        for (String naipe : naipes) {
            for (String valor : valores) {
                cartas.add(new Carta(naipe, valor));
            }
        }
    }

    // Método para embaralhar o baralho
    public void embaralhar() {
        Collections.shuffle(cartas);
    }

    // Método para distribuir uma carta
    public Carta distribuirCarta() {
        if (!cartas.isEmpty()) {
            return cartas.remove(0);
        } else {
            return null;
        }
    }

    // Método toString
    @Override
    public String toString() {
        return cartas.toString();
    }
}