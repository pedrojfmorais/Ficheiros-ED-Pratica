package Ficha4.ex3;

import Ficha4.ex1.DezReais;

import java.util.Iterator;
import java.util.NoSuchElementException;

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
        if(hasNext())
            return object.get(++counter);
        else
            throw new NoSuchElementException();
    }
}
