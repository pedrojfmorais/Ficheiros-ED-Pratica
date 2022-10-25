package Ficha4;

import Ficha4.ex1.DezReais;
import Ficha4.ex3.ItDezReais;

public class Main {
    public static void main(String[] args) {
        //ex1
        DezReais dr = new DezReais();
        //ex3
        ItDezReais it = new ItDezReais(dr);

        for (int i = 0; i < 10; i++)
            dr.add(i*1.1);

        while (it.hasNext())
            System.out.println(it.next());
    }
}
