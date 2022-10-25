package Ficha2;

import java.util.Arrays;

public class ex3 {
    public static int ex3(int [] tab, int chave){

        int start = 0;
        int end = tab.length - 1;

        int pos = tab.length/2;

        do{

            if(tab[pos] == chave)
                return pos;

            else if(tab[pos] < chave)
                start = pos + 1;

            else
                end = pos - 1;

            pos = (start + end) / 2;

        }while(start < end);

        if(tab[pos] == chave)
            return pos;

        return -1;
    }

    public static void main(String[] args) {

        int[] array = {3,7,12,15};

        System.out.println("Resultado '" +  ex3(array, 1) + "'.");
        System.out.println("Resultado '" +  ex3(array, 12) + "'.");
    }
}
