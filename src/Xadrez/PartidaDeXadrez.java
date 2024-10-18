package Xadrez;

import BoardGame.Tabuleiro;

public class PartidaDeXadrez {

    private Tabuleiro tabuleiro;

    public PartidaDeXadrez(){
    tabuleiro = new Tabuleiro(8, 8);
    }

    public PesaDeXadrez [][] getPesas(){
        PesaDeXadrez [][] mat = new PesaDeXadrez[tabuleiro.getTabuleirolinha()][tabuleiro.getTabuleirocoluna()];
        for (int i= 0;i<tabuleiro.getTabuleirolinha();i++){
            for(int j=0; j< tabuleiro.getTabuleirocoluna(); j++) {
                mat[i][j] = (PesaDeXadrez) tabuleiro.pesa(i, j);
            }
        }
        return mat;
    }


}
