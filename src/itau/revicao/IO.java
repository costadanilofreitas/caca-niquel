package itau.revicao;

public class IO {

    public static void start(){
        System.out.println("$$$$$$$$ Jogo do milhão $$$$$$$$");
        Maquina maquina = new Maquina();
        System.out.println(maquina);

        int pontuacao = Contator.calcularPontuacao(maquina);

        System.out.println("****** Você fez " + pontuacao +" Pontos *******");
    }
}
