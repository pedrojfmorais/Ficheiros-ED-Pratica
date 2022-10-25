package Ficha4;

import Ficha4.ex5.DezReaisMutavel;
import Ficha4.ex5.ItDezReaisMutavel;

public class Main {
    public static void main(String[] args) {
        //ex4
        DezReaisMutavel dr = new DezReaisMutavel();
        //ex5
        ItDezReaisMutavel it = new ItDezReaisMutavel(dr);

        for (int i = 0; i < 10; i++)
            dr.add(i*1.1);

        while (it.hasNext())
            System.out.println(it.next());
    }
}
