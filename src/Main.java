import BoardGame.Posicao;
import Xadrez.PartidaDeXadrez;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        PartidaDeXadrez partidaDeXadrez = new PartidaDeXadrez();

        InterfaceDoUsuario.printTabuleiro(partidaDeXadrez.getPesas());
    }
}