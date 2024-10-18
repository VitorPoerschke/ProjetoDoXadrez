package Xadrez;

import BoardGame.Pesa;
import BoardGame.Posicao;

public class PesaDeXadrez extends Pesa {

    private Color cor;

    public PesaDeXadrez(Posicao posicao, Color cor) {
        super(posicao);
        this.cor = cor;
    }

    public Color getCor() {
        return cor;
    }

}
