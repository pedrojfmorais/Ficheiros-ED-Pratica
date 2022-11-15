package Ficha5.ex8;

import Ficha5.ex3.Pilha;

import java.util.ArrayList;

public class PilhaEx8<T extends Comparable<? super T>>{

    Pilha<T> pilha;
    Pilha<T> minimos;

    public PilhaEx8() {
        pilha = new Pilha<>(new ArrayList<>());
        minimos = new Pilha<>(new ArrayList<>());
    }

    public void push(T value){
        pilha.push(value);

        if(minimos.empty() || minimos.peek().compareTo(value) > 0)
            minimos.push(value);
    }

    public T pop(){
        T value = pilha.pop();

        if(minimos.peek().compareTo(value) == 0)
            minimos.pop();

        return value;
    }

    public T findMin(){
        return minimos.peek();
    }

    public void show(){
        System.out.println("Valores: " + pilha);
        System.out.println("Minimos: " + minimos);
    }
}
