package Ficha4.ex6;

import Ficha4.ex4.ItDezReaisMutavel;

import java.util.Iterator;

public class DezReaisMutavel  implements Iterable<Double> {
    private final Double[] numbers;
    private final int CAPACITY = 10;
    private int last = 0;
    private int counterModifications = 0;

    public DezReaisMutavel() {
        numbers = new Double[CAPACITY];
    }

    public void add(Double num) {

        if (size() >= CAPACITY)
            throw new RuntimeException();

        numbers[last++] = num;
        counterModifications++;
    }

    public void remove(int indice){

        if(indice < 0 || indice >= size())
            throw new ArrayIndexOutOfBoundsException();

        for (int i = indice; i < size()-1; i++)
            numbers[i] = numbers[i+1];

        if(last>-1)
            last--;
        counterModifications++;
    }

    public Double get(int indice) {
        if(indice < 0 || indice >= size())
            throw new IndexOutOfBoundsException();

        return numbers[indice];
    }

    public int getCounterModifications() {
        return counterModifications;
    }

    public int size() {
        return last;
    }

    @Override
    public Iterator<Double> iterator() {
        return new ItDezReaisPositivos(this);
    }
}