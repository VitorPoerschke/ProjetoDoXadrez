package BoardGame;

public class Pesa {

    protected Posicao posicao;
    private Tabuleiro tabuleiro;

    public Pesa(Posicao posicao) {
        this.posicao = posicao;
        this.tabuleiro = null;
    }

    protected Tabuleiro getTabuleiro() {
        return tabuleiro;
    }

}

