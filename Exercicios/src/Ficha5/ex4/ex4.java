package Ficha5.ex4;

import Ficha5.ex3.Pilha;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ex4 {

    public static void main(String[] args) {
        List alist = new ArrayList();
        List llist = new LinkedList();
        long n, sz = 2500, nruns = 20;
        double tm;

        Fila fal = new Fila(alist);
        Fila fll = new Fila(llist);

        System.out.println("Tempo de execução médio " + nruns + "execuções(ms)");
        System.out.println("N , Arraylist , Linked list");

        for (int i = 0; i < 30; i++) {
            n = sz * i;
            tm = 0;

            for (int j = 0; j < nruns; j++)
                tm += test(fal, n);

            System.out.printf("%d , %9.2f ,", i, (float)(tm/nruns));
            tm = 0;

            for (int j = 0; j < nruns; j++)
                tm += test(fll, n);

            System.out.printf(" %.2f\n", (float)(tm/nruns));
        }
    }

    public static double test(Fila p, long sz){
        long startTime = System.nanoTime();

        for (int i = 0; i < sz; i++)
            p.add(i);
        for (int i = 0; i < sz; i++)
            p.remove();

        return (System.nanoTime()-startTime) / 1000000.0;
    }
}
