package Ficha5.ex5;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ex5 {

    public static <T> void reverse(List<T> lista){
        ListIterator<T> inicio = lista.listIterator();
        ListIterator<T> fim = lista.listIterator(lista.size());

        T primeiro, ultimo;

        while (inicio.nextIndex() < fim.previousIndex()){
            primeiro = inicio.next();
            ultimo = fim.previous();

            inicio.set(ultimo);
            fim.set(primeiro);
        }
    }

    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();

        lista.add(123);
        lista.add(456);
        lista.add(789);
        lista.add(1000);
        lista.add(2000);

        System.out.println(lista);

        reverse(lista);

        System.out.println(lista);
    }
}
