package Ficha5.ex6;

import Ficha5.ex3.Pilha;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class ex6 {

    public static <T> void printReverse(Collection<T> col){

        Pilha<T> p = new Pilha<>(new ArrayList());

        for(T valor : col)
            p.push(valor);

        while(!p.empty())
            System.out.println(p.pop());
    }

    public static void main(String[] args) {

        List<Integer> lista = new ArrayList<>();

        lista.add(123);
        lista.add(456);
        lista.add(789);
        lista.add(1000);
        lista.add(2000);

        System.out.println(lista);

        printReverse(lista);

        System.out.println(lista);

    }
}
