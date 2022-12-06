package Ficha7.ex3;

import Ficha7.ex1.BinaryTree;

public class ex3 {
    public static void main(String[] args) {
        BinaryTree<String> bt = new BinaryTree<>();

        bt.insere("D");

        bt.insere("E");// podem ser trocados
        bt.insere("B");// podem ser trocados

        bt.insere("C");// podem ser trocados
        bt.insere("F");// podem ser trocados
        bt.insere("A");// podem ser trocados

        bt.insere("H");
        bt.insere("G");

        bt.imprimeNiveis();
    }
}
