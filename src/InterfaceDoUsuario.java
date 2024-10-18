import Xadrez.PesaDeXadrez;

public class InterfaceDoUsuario {

    public static void printTabuleiro(PesaDeXadrez[][] pesas) {
     for (int i = 0;  i< pesas.length; i++){
        System.out.print((8 - i) +" ");
        for(int j=0; j<pesas.length; j++){
        printPesa(pesas[i][j]);

        }
        System.out.println();
     }
     System.out.print("  a b c d e f g h");
    }

    public static void printPesa(PesaDeXadrez pesa){
    if(pesa == null){
        System.out.print("-");
    }else{
        System.out.print(pesa);

    }
        System.out.print(" ");
    }

}
