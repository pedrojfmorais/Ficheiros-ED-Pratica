package Ficha5.ex8;

import java.util.ArrayList;
import java.util.List;

public class ex8 {

    public static void main(String[] args) {
        PilhaEx8<Integer> pilha = new PilhaEx8<>();

        pilha.push(3);
        pilha.push(5);
        pilha.push(2);
        pilha.push(4);
        pilha.push(1);

        pilha.show();
    }
}
