package Ficha4.ex4;

import java.util.Iterator;

public class DezReaisMutavel  implements Iterable<Double> {
    private final Double[] numbers;
    private final int CAPACITY = 10;
    protected int last = 0;

    public DezReaisMutavel() {
        numbers = new Double[CAPACITY];
    }

    public void add(Double num) {

        if (size() >= CAPACITY)
            throw new RuntimeException();
        else
            numbers[last++] = num;
    }

    public void remove(int indice){

        if(indice < 0 || indice >= size())
            throw new ArrayIndexOutOfBoundsException();

        for (int i = indice; i < size()-1; i++)
            numbers[i] = numbers[i+1];

        if(last>-1)
            last--;
    }

    public Double get(int indice) {
        if(indice < 0 || indice >= size())
            throw new IndexOutOfBoundsException();

        return numbers[indice];
    }

    public int size() {
        return last;
    }

    @Override
    public Iterator<Double> iterator() {
        return new ItDezReaisMutavel(this);
    }
}