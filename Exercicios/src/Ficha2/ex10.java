package Ficha2;

public class ex10 {
    public static int ex10(int [] tab){

        int start = 0;
        int end = tab.length - 1;

        int pos = tab.length/2;

        int posReturn = -1;

        do{

            if(tab[pos] > pos)
                posReturn = pos;

            if(tab[pos] < pos)
                start = pos + 1;

            else
                end = pos - 1;

            pos = (start + end) / 2;

        }while(start < end);

        return posReturn;
    }

    public static void main(String[] args) {

        int[] array1 = {3,7,12,15};
        int[] array2 = {-3,1,7,12,15};
        int[] array3 = {-15,-14,1,2,3,4} ;

        System.out.println("Resultado '" + ex10(array1) + "'.");
        System.out.println("Resultado '" + ex10(array2) + "'.");
        System.out.println("Resultado '" + ex10(array3) + "'.");
    }
}
