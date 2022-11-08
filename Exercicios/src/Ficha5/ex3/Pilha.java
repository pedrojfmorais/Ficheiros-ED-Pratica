package Ficha5.ex3;

import java.util.List;
import java.util.ListIterator;

public class Pilha<T> {
    List<? super T> pilha;

    public Pilha(List<? super T> pilha) {
        this.pilha = pilha;
    }

    public boolean empty(){
        return pilha.isEmpty();
    }

    public T peek(){
        if (empty())
            return null;
        return (T) pilha.get(pilha.size()-1);
    }

    public T pop(){

        if (empty())
            return null;

        return (T) pilha.remove(pilha.size()-1);
    }

    public void push(T valor){
        pilha.add(valor);
    }
}
