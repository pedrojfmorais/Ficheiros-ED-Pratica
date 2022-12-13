package Ficha7.ex7;

import Ficha7.ex1.BinaryTree;
import Ficha7.ex1.Node;

public class BinaryTreeEx7<T extends Comparable<? super T>> extends BinaryTree<T> {

    public void remove(T valor) {
        raiz = remove(valor, raiz);
    }

    private Node<T> remove(T valor, Node<T> no) {

        if (no == null)
            return null;

        int resCompare = comparator.compare(no.getData(), valor);

        if (resCompare > 0)
            no.setLeft(remove(valor, no.getLeft()));
        else if (resCompare < 0)
            no.setRight(remove(valor, no.getRight()));

        if (no.getLeft() == null && no.getRight() == null)
            return null;

        if (no.getRight() == null)
            return no.getLeft();

        if (no.getLeft() == null)
            return no.getRight();

        Node<T> node = no.getRight();

        while (node.getLeft() != null)
            node = node.getLeft();

        no.setData(node.getData());
        no.setRight(remove(node.getData(), no.getRight()));

        return no;
    }
}
