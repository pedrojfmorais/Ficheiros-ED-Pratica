package Ficha7.ex1;

import java.util.Collection;
import java.util.Comparator;

public class BinaryTree<T extends Comparable<? super T>> {

    private Node<T> raiz;
    private Comparator<T> comparator;

    public BinaryTree(Comparator<T> comparator) {
        this.raiz = null;
        this.comparator = comparator;
    }

    public BinaryTree() {
        this.raiz = null;
        comparator = new Comparator<T>() {
            @Override
            public int compare(T o1, T o2) {
                return o1.compareTo(o2);
            }
        };
    }

    public void insere(T newData){
        raiz = insere(raiz, new Node<T>(newData));
    }

    private Node<T> insere(Node<T> raiz, Node<T> novo){

        if(raiz == null)
            return novo;

        int resCompare = comparator.compare(raiz.getData(), novo.getData());

        if(resCompare > 0)
            raiz.setLeft(insere(raiz.getLeft(), novo));
        else if(resCompare < 0)
            raiz.setRight(insere(raiz.getRight(), novo));
        else
            throw new RuntimeException();

        return raiz;
    }
}
