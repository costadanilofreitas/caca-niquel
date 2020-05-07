package itau.revicao;

import java.util.Random;

public class Slot {

    private Opcao opcao;

    public Slot(){
        int tamanhoDoVetor = Opcao.values().length;
        int numerAletorio = new Random().nextInt(tamanhoDoVetor);
        this.opcao = Opcao.values()[numerAletorio];
    }

    public Opcao getOpcao() {
        return opcao;
    }

    @Override
    public String toString() {
        String modelo = "$$$ " + opcao + " --> " + opcao.ponto;
        return modelo;
    }
}
