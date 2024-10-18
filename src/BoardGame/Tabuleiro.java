package BoardGame;

public class Tabuleiro {

    private int tabuleirolinha;
    private int tabuleirocoluna;
    private Pesa [][] pesas;

    public Tabuleiro(int tabuleirolinha, int tabuleirocoluna) {
        this.tabuleirolinha = tabuleirolinha;
        this.tabuleirocoluna = tabuleirocoluna;
        this.pesas = new Pesa[tabuleirolinha][tabuleirocoluna];
    }

    public int getTabuleirolinha() {
        return tabuleirolinha;
    }

    public void setTabuleirolinha(int tabuleirolinha) {
        this.tabuleirolinha = tabuleirolinha;
    }

    public int getTabuleirocoluna() {
        return tabuleirocoluna;
    }

    public void setTabuleirocoluna(int tabuleirocoluna) {
        this.tabuleirocoluna = tabuleirocoluna;
    }

    public Pesa pesa(int linha, int coluna){
        return pesas[linha][coluna];
    }
    public Pesa pesa(Posicao posicao){
        return pesas[posicao.getLinhaDoTabuleiro()][posicao.getColunaDoTabuleiro()];
    }


}
