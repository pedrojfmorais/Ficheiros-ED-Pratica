public class ex5 {
    public static double ex5(int [] tab, int chave){

        int res = ex4.ex4(tab, chave);

        if(res < 0)
            res = res * -1 - 1;

        return (double) res / tab.length;
    }

    public static void main(String[] args) {

        int[] array = {3,7,12,15};

        System.out.println("Resultado '" + ex5(array, 15) + "'.");
        System.out.println("Resultado '" + ex5(array, 14) + "'.");
        System.out.println("Resultado '" + ex5(array, 3) + "'.");
        System.out.println("Resultado '" + ex5(array, 1) + "'.");
        System.out.println("Resultado '" + ex5(array, 100) + "'.");
    }
}
