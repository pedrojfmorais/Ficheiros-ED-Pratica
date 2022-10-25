package Ficha3;

import java.sql.SQLOutput;

public class ex1 {
    public static void main(String[] args) {

        Integer[] array1 = new Integer[]{1, 2, 3, 4, 5, 3};
        Double[] array2 = new Double[]{1.1, 2.2, 3.3, 4.4, 5.5, 2.2};

        System.out.println("Resultado: " + ex1(array1, 3));
        System.out.println("Resultado: " + ex1(array1, 2));
        System.out.println("Resultado: " + ex1(array2, 2.2));
        System.out.println("Resultado: " + ex1(array2, 3));

    }

    public static <T> boolean ex1(T[] tab, T valor){

        int count = 0;

        for(T element : tab){
            if(element == valor)
                count++;

            if(count == 2)
                return true;
        }
        return false;
    }
}
