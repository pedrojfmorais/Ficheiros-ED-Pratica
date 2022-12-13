package Ficha7.ex8;

import Ficha7.ex8.BinaryTreeEx8;

public class Main {
    public static void main(String[] args) {
        BinaryTreeEx8<String> bt = new BinaryTreeEx8<>();

        bt.insere("1");

        bt.insere("15");

        bt.insere("10");
        bt.insere("25");

        bt.insere("12");
        bt.insere("20");
        bt.insere("50");

        bt.insere("11");
        bt.insere("13");

        bt.imprimeNiveis();
        System.out.println();
        bt.removeUmDescendente();
        bt.imprimeNiveis();
    }
}
