package BoardGame;

public class Posicao {

    private int posicaoLinha;
    private int posicaoColuna;

    public Posicao(int linhaDoTabuleiro, int colunaDoTabuleiro) {
        this.posicaoLinha = linhaDoTabuleiro;
        this.posicaoColuna= colunaDoTabuleiro;
    }

    public int getLinhaDoTabuleiro() {
        return posicaoLinha;
    }

    public void setLinhaDoTabuleiro(int linhaDoTabuleiro) {
        this.posicaoLinha = linhaDoTabuleiro;
    }

    public int getColunaDoTabuleiro() {
        return posicaoColuna;
    }

    public void setColunaDoTabuleiro(int colunaDoTabuleiro) {
        this.posicaoColuna = colunaDoTabuleiro;
    }

    @Override
    public String toString(){
        return posicaoLinha +","+posicaoColuna;


    }


}
