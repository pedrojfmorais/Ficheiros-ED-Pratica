package Ficha5.ex7;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ex7 {

    public static <T> void eliminaPares_A(List<T> lista){

        ArrayList<T> copia = new ArrayList<>();
        ListIterator<T> it = lista.listIterator();

        while(it.hasNext())
            if(it.nextIndex() % 2 == 1)
                copia.add(it.next());
            else
                it.next();

        lista.clear();
        lista.addAll(copia);
    }

    public static <T> void eliminaPares_B(List<T> lista) {
        ListIterator<T> it = lista.listIterator();

        while (it.hasNext()) {
            it.next();
            it.remove();
            if(it.hasNext())
                it.next();
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

        eliminaPares_B(lista);

        System.out.println(lista);
    }
}
