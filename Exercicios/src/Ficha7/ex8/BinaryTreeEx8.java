package Ficha7.ex8;

import Ficha7.ex1.Node;
import Ficha7.ex7.BinaryTreeEx7;

public class BinaryTreeEx8<T extends Comparable<? super T>> extends BinaryTreeEx7<T> {

    public void removeUmDescendente() {
        raiz = removeUmDescendente(raiz);
    }

    private Node<T> removeUmDescendente(Node<T> no) {

        if(no == null)
            return null;

        no.setLeft(removeUmDescendente(no.getLeft()));
        no.setRight(removeUmDescendente(no.getRight()));

        if (no.getLeft() == null && no.getRight() != null)
            return no.getRight();

        if (no.getRight() == null && no.getLeft() != null)
            return no.getLeft();

        return no;
    }
}
