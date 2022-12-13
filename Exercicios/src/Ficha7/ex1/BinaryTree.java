package Ficha7.ex1;

import java.util.*;

public class BinaryTree<T extends Comparable<? super T>> {

    protected Node<T> raiz;
    protected Comparator<T> comparator;

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

    public void insere(T newData) {
        raiz = insere(raiz, new Node<T>(newData));
    }

    private Node<T> insere(Node<T> raiz, Node<T> novo) {

        if (raiz == null)
            return novo;

        int resCompare = comparator.compare(raiz.getData(), novo.getData());

        if (resCompare > 0)
            raiz.setLeft(insere(raiz.getLeft(), novo));
        else if (resCompare < 0)
            raiz.setRight(insere(raiz.getRight(), novo));
        else
            throw new RuntimeException();

        return raiz;
    }

    public boolean contem(T valor) {
        return contem(raiz, valor);
    }

    private boolean contem(Node<T> no, T valor) {

        if (no == null)
            return false;

        int res = comparator.compare(valor, no.getData());

        if (res == 0)
            return true;
        if (res < 0)
            return contem(no.getLeft(), valor);

        return contem(no.getRight(), valor);
    }

    public int profundidadeDe(T valor) {
        return profundidadeDe(raiz, valor);
    }

    private int profundidadeDe(Node<T> no, T valor) {

        if (no == null)
            return 0;

        int res = comparator.compare(valor, no.getData());

        if (res == 0)
            return 1;

        if (res < 0) {
            int subArvore = profundidadeDe(no.getLeft(), valor);
            return subArvore == 0 ? 0 : subArvore + 1;
        }

        int subArvore = profundidadeDe(no.getRight(), valor);
        return subArvore == 0 ? 0 : subArvore + 1;
    }

    public void imprimeOrdem() {
        imprimeOrdem(raiz);
    }

    private void imprimeOrdem(Node<T> no) {

        if (no == null)
            return;

        imprimeOrdem(no.getLeft());

        System.out.println(no.getData());

        imprimeOrdem(no.getRight());
    }

    public int profundidade(){
        return profundidade(raiz);
    }

    private int profundidade(Node<T> no){
        if(no == null)
            return 0;

        int profundidadeEsquerda = profundidade(no.getLeft());
        int profundidadeDireita = profundidade(no.getRight());

        if(profundidadeEsquerda > profundidadeDireita)
            return profundidadeEsquerda + 1;

        return profundidadeDireita + 1;
    }

    public int tamanho(){
        return tamanho(raiz);
    }

    private int tamanho(Node<T> no){
        if(no == null)
            return 0;

        return 1 + tamanho(no.getLeft()) + tamanho(no.getRight());
    }

    public void imprimeNiveis(){
        imprimeNiveis(raiz);
    }
    private void imprimeNiveis(Node<T> raiz){

        List<Node<T>> fila = new LinkedList<>();
        fila.add(raiz);

        while(!fila.isEmpty()) {
            Node<T> atual = fila.remove(0);

            if(atual == null)
                continue;

            fila.add(atual.getLeft());
            fila.add(atual.getRight());

            System.out.println(atual.getData());
        }
    }
}
