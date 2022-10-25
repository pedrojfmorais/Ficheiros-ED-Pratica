package Ficha4.ex5;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class ItDezReaisMutavel implements Iterator<Double> {
    private final DezReaisMutavel object;
    private int counter = -1;
    private boolean canRemove = false;
    private int counterModifications;


    public ItDezReaisMutavel(DezReaisMutavel object) {
        this.object = object;
        this.counterModifications = object.getCounterModifications();
    }

    public void verifyModifications(){
        if(counterModifications != object.getCounterModifications())
            throw new ConcurrentModificationException();
    }

    @Override
    public boolean hasNext() {

        verifyModifications();

        return counter+1 < object.size();
    }

    @Override
    public Double next() {

        verifyModifications();

        if(hasNext()) {
            canRemove = true;
            return object.get(++counter);
        }
        else
            throw new NoSuchElementException();
    }

    @Override
    public void remove() {

        verifyModifications();

        if(canRemove) {
            object.remove(counter);
            counter--;
            canRemove = false;
            counterModifications++;
        }
        else
            throw new IllegalStateException();
    }
}
