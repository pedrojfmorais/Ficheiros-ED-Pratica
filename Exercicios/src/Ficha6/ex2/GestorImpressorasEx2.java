package Ficha6.ex2;

import Ficha6.ex1.Impressora;

import java.util.*;

public class GestorImpressorasEx2 {

    private final HashMap<String, ImpressoraEx2> hmImpressoras;
    private PriorityQueue<ImpressoraEx2> pqImpressoras;

    public GestorImpressorasEx2() {
        hmImpressoras = new HashMap<>();
        pqImpressoras = new PriorityQueue<>(new Comparator<ImpressoraEx2>() {
            @Override
            public int compare(ImpressoraEx2 o1, ImpressoraEx2 o2) {

                int res = o1.getNumeroTrabalhos() - o2.getNumeroTrabalhos();

                if(res != 0)
                    return res;

                //caso ambas impresoras não tenham trabalhos
                if(o1.getNumeroTrabalhos() == 0 && o2.getNumeroTrabalhos() == 0)
                    return 1;

                Trabalho o1T = o1.proximoTrabalho();
                Trabalho o2T = o2.proximoTrabalho();

                res = o1T.getPaginas() - o2T.getPaginas();

                o1.enviaTrabalho(o1T);
                o2.enviaTrabalho(o2T);

                if(res == 0)
                    res++;

                return res;
            }
        });
    }

    public GestorImpressorasEx2(HashMap<String, ImpressoraEx2> hmImpressoras) {
        this.hmImpressoras = hmImpressoras;
    }

    public Impressora getImpressora(String nome){
        return hmImpressoras.get(nome);
    }

    public Set<String> getNomesImpressoras(){
        return hmImpressoras.keySet();
    }

    public void acrescentaImpressora(ImpressoraEx2 i){
        hmImpressoras.put(i.getNome(), i);
        pqImpressoras.add(i);
    }

    public void removeImpressora(String nome){
        ImpressoraEx2 imp = hmImpressoras.remove(nome);
        if(imp != null)
            pqImpressoras.remove(imp);
    }

    public boolean existeImpressora(String nome){
        return hmImpressoras.containsKey(nome);
    }

    public void imprime(Trabalho t){
        ImpressoraEx2 impressora = pqImpressoras.poll();

        if (impressora == null)
            return;

        impressora.enviaTrabalho(t);

        pqImpressoras.add(impressora);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        Iterator<ImpressoraEx2> it = pqImpressoras.iterator();
        ImpressoraEx2 imp;

        while (it.hasNext()) {
            imp = it.next();
            sb.append(imp).append(System.lineSeparator());
        }

        return sb.toString();
    }
}
