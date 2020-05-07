package itau.revicao;

import java.util.Arrays;

public class Maquina {

    private Slot[] slots;

    public Maquina(){
        this.slots = new Slot[3];
        for(int x=0; x < this.slots.length; x++){
            this.slots[x] = new Slot();
        }
    }

    public Slot[] getSlots() {
        return slots;
    }

    @Override
    public String toString() {
        String modelo = Arrays.toString(slots);
        return modelo;
    }
}
