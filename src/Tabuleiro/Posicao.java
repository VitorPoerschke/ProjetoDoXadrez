package Tabuleiro;

public class Posicao {

    private int linhaDoTabuleiro;
    private int colunaDoTabuleiro;

    public Posicao(int linhaDoTabuleiro, int colunaDoTabuleiro) {
        this.linhaDoTabuleiro = linhaDoTabuleiro;
        this.colunaDoTabuleiro = colunaDoTabuleiro;
    }

    public int getLinhaDoTabuleiro() {
        return linhaDoTabuleiro;
    }

    public void setLinhaDoTabuleiro(int linhaDoTabuleiro) {
        this.linhaDoTabuleiro = linhaDoTabuleiro;
    }

    public int getColunaDoTabuleiro() {
        return colunaDoTabuleiro;
    }

    public void setColunaDoTabuleiro(int colunaDoTabuleiro) {
        this.colunaDoTabuleiro = colunaDoTabuleiro;
    }

    @Override
    public String toString(){
        return linhaDoTabuleiro +","+colunaDoTabuleiro;


    }


}
