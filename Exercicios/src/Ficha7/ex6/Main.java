package Ficha7.ex6;


import Ficha7.ex1.BinaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        final int MAX_VALUE = 10000000;
        final int nTrocas = MAX_VALUE * 3;

        Random rand = new Random();
        BinaryTree<Integer> bt1 = new BinaryTree<>();

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < MAX_VALUE; i++)
            list.add(i);

        int a, b, temp;
        for (int i = 0; i < nTrocas; i++) {
            a = rand.nextInt(MAX_VALUE);
            b = rand.nextInt(MAX_VALUE);

            temp = list.get(a);

            list.set(a, list.get(b));
            list.set(b, temp);
        }

        for (int i = 0; i < MAX_VALUE; i++)
            bt1.insere(list.get(i));

        System.out.println("Binary tree 1: " + bt1.profundidade());
        System.out.println("Profundidade Teórica: " + Math.log(MAX_VALUE)/Math.log(2));
    }
}
