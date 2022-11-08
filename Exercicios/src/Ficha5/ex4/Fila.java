package Ficha5.ex4;

import java.util.List;

public class Fila <T>{

    private final List<? super T> fila;

    public Fila(List<? super T> fila) {
        this.fila = fila;
    }

    public void add(T novo){
        fila.add(novo);
    }

    public T remove(){
        if(fila.isEmpty())
            return null;
        return (T) fila.remove(0);
    }

    public T element(){

        if(fila.isEmpty())
            return null;

        return (T) fila.get(0);
    }
}
