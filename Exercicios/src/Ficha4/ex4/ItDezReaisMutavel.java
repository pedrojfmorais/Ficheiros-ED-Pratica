package Ficha4.ex4;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ItDezReaisMutavel implements Iterator<Double> {
    private final DezReaisMutavel object;
    private int counter = -1;
    private boolean canRemove = false;

    public ItDezReaisMutavel(DezReaisMutavel object) {
        this.object = object;
    }

    @Override
    public boolean hasNext() {
        return counter+1 < object.size();
    }

    @Override
    public Double next() {
        if(hasNext()) {
            canRemove = true;
            return object.get(++counter);
        }
        else
            throw new NoSuchElementException();
    }

    @Override
    public void remove() {
        if(canRemove) {
            object.remove(counter - 1);
            canRemove = false;
        }
        else
            throw new IllegalStateException();
    }
}
