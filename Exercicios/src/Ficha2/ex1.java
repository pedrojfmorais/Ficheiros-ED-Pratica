package Ficha2;

import java.util.Arrays;

public class ex1 {
    public static boolean ex1(int [] tab, int chave){

        int mid = tab[tab.length/2];
        int [] newt = new int[0];

        if(mid == chave)
            return true;

        else if(tab.length == 1)
            return false;

        else if(mid < chave)
            newt = Arrays.copyOfRange(tab, tab.length/2, tab.length);

        else if(mid > chave)
            newt = Arrays.copyOfRange(tab, 0, tab.length/2);

        return ex1(newt, chave);
    }

    public static void main(String[] args) {
        int[] array = {3,7,12,15};
        boolean res = ex1(array, 3);

        if(res) {
            System.out.println("Existe");
        }
        else {
            System.out.println("Não existe");
        }
    }
}
