public class ex6 {
    public static int ex6(int [] tab, int start, int end){

        int firstPosition = ex4.ex4(tab, start);
        int lastPosition = ex4.ex4(tab, end);

        if(firstPosition < 0)
            firstPosition = -firstPosition - 1;

        if(lastPosition < 0)
            lastPosition = -lastPosition - 1;
        else
            lastPosition++;

        return lastPosition - firstPosition;
    }

    public static void main(String[] args) {

        int[] array = {3,7,12,15};

        System.out.println("Resultado '" + ex6(array, 0, 15) + "'.");
        System.out.println("Resultado '" + ex6(array, 3, 7) + "'.");
        System.out.println("Resultado '" + ex6(array, 4, 14) + "'.");
        System.out.println("Resultado '" + ex6(array, 4, 5) + "'.");
        System.out.println("Resultado '" + ex6(array, 0, 100) + "'.");
    }
}
