public class ex9 {
    public static int ex9(int [] tab, int chave){

        int start = 0;
        int end = tab.length - 1;

        int pos = tab.length/2;

        do{

            if(tab[pos] == chave)
                return pos;

            if((tab[pos] < 0 && chave < 0) || (tab[pos] > 0 && chave > 0)){

                if(tab[pos] < chave)
                    start = pos + 1;
                else
                    end = pos - 1;

            }else{

                if(tab[pos] < chave)
                    end = pos - 1;
                else
                    start = pos + 1;
            }

            pos = (start + end) / 2;

        }while(start < end);

        if(tab[pos] == chave)
            return pos;

        return -1;
    }

    public static void main(String[] args) {

        int[] array =  {3,6,8, -10,-3,-2,-1};

        System.out.println("Resultado '" + ex9(array, 8) + "'.");
        System.out.println("Resultado '" + ex9(array, -2) + "'.");
        System.out.println("Resultado '" + ex9(array, 3) + "'.");
        System.out.println("Resultado '" + ex9(array, 1) + "'.");
        System.out.println("Resultado '" + ex9(array, -10) + "'.");
    }
}
