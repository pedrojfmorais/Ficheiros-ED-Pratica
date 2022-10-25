package Ficha2;

public class ex2 {
    public static boolean ex2(int [] tab, int chave){

        int linf = 0, lsup=tab.length-1;
        int meio = tab.length/2;

        do{
            if(tab[meio]==chave) return true;
            if(tab[meio]<chave) linf=meio+1;
            else lsup=meio-1;
            meio = (linf+lsup)/2;

        }while(linf < lsup);

        if(tab[meio]==chave)
            return true;

        return false;
    }

    public static void main(String[] args) {

        int[] array = {3,7,12,15};

        boolean res = ex2(array, 3);

        if(res) {
            System.out.println("Existe");
        }
        else {
            System.out.println("Não existe");
        }
    }
}
