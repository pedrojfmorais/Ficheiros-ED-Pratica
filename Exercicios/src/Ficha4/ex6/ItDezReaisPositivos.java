package Ficha4.ex6;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class ItDezReaisPositivos implements Iterator<Double> {
    private final DezReaisMutavel object;
    private int counter = -1;
    private boolean canRemove = false;
    private int counterModifications;


    public ItDezReaisPositivos(DezReaisMutavel object) {
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

        return nextPositiveIndex(counter+1) >= 0;
    }

    @Override
    public Double next() {

        verifyModifications();

        if(hasNext()) {
            canRemove = true;
            counter = nextPositiveIndex(++counter);
            return object.get(counter);
        }
        else
            throw new NoSuchElementException();
    }

    public int nextPositiveIndex(int indiceAtual){

        if(indiceAtual >= object.size())
            return -1;

        while (object.get(indiceAtual) < 0)
            if(++indiceAtual >= object.size())
                return -1;

        return indiceAtual;
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
