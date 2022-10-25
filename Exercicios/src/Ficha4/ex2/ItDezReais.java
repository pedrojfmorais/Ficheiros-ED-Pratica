package Ficha4.ex2;

import Ficha4.ex1.DezReais;

import java.util.Iterator;

public class ItDezReais implements Iterator<Double> {

    private final DezReais object;
    private int counter = -1;

    public ItDezReais(DezReais object) {
        this.object = object;
    }

    @Override
    public boolean hasNext() {
        return counter+1 < object.size();
    }

    @Override
    public Double next() {
            return object.get(++counter);
    }
}
