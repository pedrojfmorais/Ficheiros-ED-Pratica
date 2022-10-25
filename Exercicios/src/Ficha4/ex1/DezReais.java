package Ficha4.ex1;

import Ficha4.ex2.ItDezReais;

import java.util.Iterator;

public class DezReais implements Iterable<Double> {
    private final Double[] numbers;
    private final int CAPACITY = 10;
    protected int last = 0;

    public DezReais() {
        numbers = new Double[CAPACITY];
    }

    public void add(Double num){

        if (size() >= CAPACITY)
            throw new RuntimeException();
        else
            numbers[last++] = num;
    }

    public Double get(int pos){
            return numbers[pos];
    }

    public int size(){
        return last;
    }

    @Override
    public Iterator<Double> iterator() {
        return new ItDezReais(this);
    }
}
