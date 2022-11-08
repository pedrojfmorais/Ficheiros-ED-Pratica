package Ficha5.ex2;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ex2 {

    public static void mostraInverso(List<?> lista){

        ListIterator<?> it = lista.listIterator(lista.size());

        while(it.hasPrevious()){
            System.out.println(it.previous());
        }
    }

    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();

        lista.add(123);
        lista.add(456);
        lista.add(789);
        lista.add(1000);
        lista.add(2000);

        mostraInverso(lista);
    }
}
