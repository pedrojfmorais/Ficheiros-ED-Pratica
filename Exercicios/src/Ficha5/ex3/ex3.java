package Ficha5.ex3;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

public class ex3 {

    private static long stopTime;
    private static long startTime;

    private static void showTime() {
        long interval=stopTime-startTime;
        long secs=interval/1000000000L;
        long decs=interval-secs*1000000000L;
        decs/=100000000L;
        System.out.println("secs="+secs+"."+decs);
    }

    private static void stopTimer() {
        stopTime=System.nanoTime();
    }

    private static void startTimer() {
        startTime=System.nanoTime();
    }

    public static void main(String[] args) {
/*
        Pilha<Integer> pilha = new Pilha<>(new ArrayList<>());

        pilha.push(1);
        pilha.push(2);
        pilha.push(3);
        pilha.push(4);
        pilha.push(5);

        System.out.println(pilha.empty());
        System.out.println(pilha.peek());
        System.out.println(pilha.pop());
        System.out.println(pilha.peek());
        pilha.push(10);
        System.out.println(pilha.peek());
*/

        List alist = new ArrayList();
        List llist = new LinkedList();
        long n, sz = 50000, nruns = 20;
        double tm;

        Pilha pal = new Pilha(alist);
        Pilha pll = new Pilha(llist);

        System.out.println("Tempo de execução médio " + nruns + "execuções(ms)");
        System.out.println("N , Arraylist , Linked list");

        for (int i = 0; i < 30; i++) {
            n = sz * i;
            tm = 0;

            for (int j = 0; j < nruns; j++)
                tm += test(pal, n);

            System.out.printf("%d , %9.2f ,", i, (float)(tm/nruns));
            tm = 0;

            for (int j = 0; j < nruns; j++)
                tm += test(pll, n);

            System.out.printf(" %.2f\n", (float)(tm/nruns));
        }
    }

    public static double test(Pilha p, long sz){
        long startTime = System.nanoTime();

        for (int i = 0; i < sz; i++)
            p.push(i);
        for (int i = 0; i < sz; i++)
            p.pop();

        return (System.nanoTime()-startTime) / 1000000.0;
    }
}
