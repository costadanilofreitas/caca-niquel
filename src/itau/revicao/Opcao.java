package itau.revicao;

public enum Opcao {
    BANANA(10),
    FRAMBOESA(50),
    MOEDA(100),
    SETE(300);

    public int ponto;

    Opcao(int i) {
        this.ponto = i;
    }
}
