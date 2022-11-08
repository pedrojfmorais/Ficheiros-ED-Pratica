package Ficha5.ex1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ex1 {

    public static <T> void preeche(List<? super T> lista, T valor){

        ListIterator<? super T> it = lista.listIterator();

        while(it.hasNext()){

            it.next();
            it.set(valor);
        }
    }

    public static void main(String[] args) {

        List<Integer> lista = new ArrayList<>();

        lista.add(123);
        lista.add(456);
        lista.add(456);
        lista.add(456);
        lista.add(456);

        preeche(lista, 987);

        System.out.println(lista);
    }
}
