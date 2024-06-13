public class Carta {
    private String naipe;
    private String valor;

    // Construtor
    public Carta(String naipe, String valor) {
        this.naipe = naipe;
        this.valor = valor;
    }

    // Getters e Setters
    public String getNaipe() {
        return naipe;
    }

    public void setNaipe(String naipe) {
        this.naipe = naipe;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    // Método toString
    @Override
    public String toString() {
        return valor + " de " + naipe;
    }
}