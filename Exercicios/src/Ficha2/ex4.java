package Ficha2;

public class ex4 {
    public static int ex4(int [] tab, int chave){

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

        //quando fica para a direita da posição atual
        if(tab[pos] < chave)
            pos += 1;

        return -(pos + 1);
    }

    public static void main(String[] args) {

        int[] array = {3,7,12,15};

        System.out.println("Resultado '" + ex4(array, 1) + "'.");
        System.out.println("Resultado '" + ex4(array, 4) + "'.");
        System.out.println("Resultado '" + ex4(array, 10) + "'.");
        System.out.println("Resultado '" + ex4(array, 13) + "'.");
        System.out.println("Resultado '" + ex4(array, 16) + "'.");
    }
}
