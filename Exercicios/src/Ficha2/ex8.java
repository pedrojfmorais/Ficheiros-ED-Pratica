package Ficha2;

public class ex8 {
    public static int ex8(int [] tab, int chave){

        int pos = ex4.ex4(tab, chave);

        if(pos < 0)
            pos = -pos -1;

        if(pos >= 1)
            return tab[pos-1];

        return chave;
    }

    public static void main(String[] args) {

        int[] array = {3,7,12,15};

        System.out.println("Resultado '" + ex8(array, 15) + "'.");
        System.out.println("Resultado '" + ex8(array, 14) + "'.");
        System.out.println("Resultado '" + ex8(array, 3) + "'.");
        System.out.println("Resultado '" + ex8(array, 1) + "'.");
        System.out.println("Resultado '" + ex8(array, 100) + "'.");
    }
}
