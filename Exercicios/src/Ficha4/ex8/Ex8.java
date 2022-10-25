package Ficha4.ex8;

import Ficha4.ex1.DezReais;
import Ficha4.ex5.DezReaisMutavel;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex8 {

    public static <T extends Comparable<? super T>> T maiorValor(Iterable<T> iterable){

        Iterator<T> it = iterable.iterator();

        T maiorValor = it.next();
        T temp;

        while(it.hasNext()){
            temp = it.next();
            if(temp.compareTo(maiorValor) > 0)
                maiorValor = temp;
        }

        return maiorValor;
    }

    public static void main(String[] args) {

        DezReais dr = new DezReais();
        DezReaisMutavel drm = new DezReaisMutavel();
        ArrayList<Double> al = new ArrayList<>();

        //adicionar elementos

        System.out.println("Maior valor: " + maiorValor(dr));
        System.out.println("Maior valor: " + maiorValor(drm));
        System.out.println("Maior valor: " + maiorValor(al));
    }
}
