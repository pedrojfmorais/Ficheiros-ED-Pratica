package Ficha6.ex2;

import Ficha6.ex1.Impressora;

import java.util.Comparator;
import java.util.PriorityQueue;

public class ImpressoraEx2 extends Impressora {

    PriorityQueue<Trabalho> pq;

    public ImpressoraEx2(String nome, int porto, String marca, String modelo, String driver, double versao) {
        super(nome, porto, marca, modelo, driver, versao);

        pq = new PriorityQueue<>(
                new Comparator<Trabalho>() {
                    @Override
                    public int compare(Trabalho o1, Trabalho o2) {
                        return o1.getPaginas() - o2.getPaginas();
                    }
                }
        );
    }

    public boolean enviaTrabalho(Trabalho t){
        return pq.add(t);
    }

    public boolean temProximoTrabalho(){
        return !pq.isEmpty();
    }

    public Trabalho proximoTrabalho(){
        return pq.poll();
    }

    public int getNumeroTrabalhos() {return pq.size();}

    @Override
    public String toString() {
        return super.toString() + ", número trabalhos='" + getNumeroTrabalhos() + '\'';
    }
}
