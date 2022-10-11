import java.util.Arrays;

public class ex3 {
    public static int ex3(int [] tab, int chave){

        int mid;
        int pos = tab.length/2 + 1;

        while(true){

            mid = tab[tab.length/2];

            if(mid == chave)
                return pos - 1;

            else if(tab.length == 1)
                return -1;

            else if(mid < chave) {
                tab = Arrays.copyOfRange(tab, tab.length / 2, tab.length);
                pos += Math.floor((float)tab.length/2);
            }

            else if(mid > chave) {
                tab = Arrays.copyOfRange(tab, 0, tab.length / 2);
                pos -= Math.ceil((float)tab.length/2);
            }

        }
    }

    public static void main(String[] args) {

        int[] array = {3,7,12,15};

        System.out.println("Resultado '" +  ex3(array, 1) + "'.");
    }
}
