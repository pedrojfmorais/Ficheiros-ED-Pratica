public class ex7 {
    public static boolean ex7(int [] tab, int chave){

        int pos = ex4.ex4(tab, chave);

        if(pos < 0)
            return false;

        if(pos >= 1)
            if(tab[pos] == tab[pos-1])
                return true;

        if(pos <= tab.length-2)
            return tab[pos] == tab[pos + 1];

        return false;
    }

    public static void main(String[] args) {

        int[] array = {3,3,7,12,12,15};

        System.out.println("Resultado '" + ex7(array, 15) + "'.");
        System.out.println("Resultado '" + ex7(array, 14) + "'.");
        System.out.println("Resultado '" + ex7(array, 12) + "'.");
        System.out.println("Resultado '" + ex7(array, 3) + "'.");
    }
}
