package itau.revicao;

public class Contator {

    public static int calcularPontuacao(Maquina maquina){
        return calcularPontuacao(maquina.getSlots());
    }

    public static int calcularPontuacao(Slot[] slots){
        int pontuacao = 0;
        for (Slot slot: slots){
            pontuacao += slot.getOpcao().ponto;
        }

        if (verificarBonus(slots)){
            pontuacao = pontuacao * 100;
        }
        return pontuacao;
    }

    private static boolean verificarBonus(Slot[] slots){
        int controle = 0;
        for (Slot slot: slots){
            if(slot.getOpcao() == slots[0].getOpcao()){
                controle++;
            }
        }

        if(controle == slots.length){
            return true;
        }
        return false;
    }
}
