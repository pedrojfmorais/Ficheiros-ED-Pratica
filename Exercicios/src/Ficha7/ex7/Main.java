package Ficha7.ex7;

public class Main {
    public static void main(String[] args) {
        BinaryTreeEx7<String> bt = new BinaryTreeEx7<>();

        bt.insere("D");

        bt.insere("E");// podem ser trocados
        bt.insere("B");// podem ser trocados

        bt.insere("C");// podem ser trocados
        bt.insere("F");// podem ser trocados
        bt.insere("A");// podem ser trocados

        bt.insere("H");
        bt.insere("G");

        bt.imprimeNiveis();
        System.out.println();
        bt.remove("B");
        bt.imprimeNiveis();
    }
}
