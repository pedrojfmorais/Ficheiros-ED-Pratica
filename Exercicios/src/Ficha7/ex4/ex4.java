package Ficha7.ex4;

import Ficha7.ex1.BinaryTree;

import java.util.Comparator;

public class ex4 {
    public static void main(String[] args) {

        BinaryTree<String> bt = new BinaryTree<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });

        bt.insere("333"); // 1

        bt.insere("4444"); // 2
        bt.insere("55555");// 3
        bt.insere("1"); // 2
        bt.insere("22"); // 3
        bt.insere("7777777"); // 4
        bt.insere("666666"); // 5

        bt.imprimeNiveis();
    }
}
