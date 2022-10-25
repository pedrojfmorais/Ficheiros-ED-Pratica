package Ficha4.ex7;

import Ficha4.ex1.DezReais;
import Ficha4.ex5.DezReaisMutavel;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex7 {

    public static Double maiorValor(Iterable<Double> iterable){

        Iterator<Double> it = iterable.iterator();

        Double maiorValor = it.next();
        Double temp;

        while(it.hasNext()){
            temp = it.next();
            if(temp > maiorValor)
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
