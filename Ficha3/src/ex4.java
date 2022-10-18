public class ex4 {
    public static void main(String[] args) {

        Integer[] m ={3,2,6,3};
        String[] n ={"Ada", "Albino"};
        System.out.println(ex4(m,2)); // true
        System.out.println(ex4(n,"Francisco")); // false

    }

    public static <T, S extends Comparable<? super T>> boolean ex4(T[] array, S valor){
        for (T element : array ) {
            if(valor.compareTo(element) < 0)
                return true;
        }
        return false;
    }
}
