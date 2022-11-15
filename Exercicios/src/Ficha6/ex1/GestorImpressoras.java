package Ficha6.ex1;

import java.util.HashMap;
import java.util.Set;

public class GestorImpressoras {

    private final HashMap<String, Impressora> hmImpressoras;

    public GestorImpressoras() {
        hmImpressoras = new HashMap<>();
    }

    public GestorImpressoras(HashMap<String, Impressora> hmImpressoras) {
        this.hmImpressoras = hmImpressoras;
    }

    public Impressora getImpressora(String nome){
        return hmImpressoras.get(nome);
    }

    public Set<String> getNomesImpressoras(){
        return hmImpressoras.keySet();
    }

    public void acrescentaImpressora(Impressora i){
        hmImpressoras.put(i.getNome(), i);
    }

    public void removeImpressora(String nome){
        hmImpressoras.remove(nome);
    }

    public boolean existeImpressora(String nome){
        return hmImpressoras.containsKey(nome);
    }
}
