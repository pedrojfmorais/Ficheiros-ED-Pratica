public class ex2 {
    public static void main(String[] args) {

        Integer[] array1 = new Integer[]{1, 2, 3, 4, 5, 3};
        Double[] array2 = new Double[]{1.1, 2.2, 3.3, 4.4, 5.5, 2.2};

        System.out.println("Resultado: " + ex2(array1, 3));
        System.out.println("Resultado: " + ex2(array1, 2));
        System.out.println("Resultado: " + ex2(array2, 2.2));
        System.out.println("Resultado: " + ex2(array2, 3.2));

    }

    public static <T extends Comparable> boolean ex2(T[] tab, T valor){

        int count = 0;

        for(T element : tab){
            if(element.compareTo(valor) == 0)
                count++;

            if(count == 2)
                return true;
        }
        return false;
    }
}
