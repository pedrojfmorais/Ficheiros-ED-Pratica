import java.util.Arrays;
import java.util.Random;

public class Main {

    static int[] criaArrayCom(
            int valor,
            int dimensao,
            boolean diferentes){
        int m[]=new int[dimensao];
        if(diferentes){
            for(int i=0;i<dimensao;i++)
                m[i]=i*10;
            if((valor%10!=0)||(0>valor)||(valor>(dimensao-1)*10))
                m[0]=valor;
        }
        else{
            Random r=new Random();
            int gama=(Math.abs(valor)<10)?10:Math.abs(valor);
            for(int i=0;i<dimensao;i++)
                m[i]=r.nextInt(gama*4)-gama*2;
            m[0]=valor;
        }
        Arrays.sort(m);
        return m;
    }

    //Ex1
    public static boolean binRecursivo(int [] tab, int chave){

        int mid = tab[tab.length/2];
        int [] newt = new int[0];

        if(mid == chave)
            return true;

        else if(tab.length == 1)
            return false;

        else if(mid < chave)
            newt = Arrays.copyOfRange(tab, tab.length/2, tab.length);

        else if(mid > chave)
            newt = Arrays.copyOfRange(tab, 0, tab.length/2);

        return binRecursivo(newt, chave);
    }

    //Ex2
    public static boolean binIterativa(int [] tab, int chave){

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

    //Ex3
    public static int binPosicao(int [] tab, int chave){

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

    //Ex4
    public static int binPosicaoEx4(int [] tab, int chave){

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

    //Ex5
    public static double binEx5(int [] tab, int chave){

        int res = binPosicaoEx4(tab, chave);

        if(res < 0)
            res = res * -1 - 1;

        return (double) res / tab.length;
    }

    //Ex6
    public static int binEx6(int [] tab, int start, int end){

        int firstPosition = binPosicaoEx4(tab, start);
        int lastPosition = binPosicaoEx4(tab, end);

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
//        boolean res = binRecursivo(array, 3);
//        boolean res = binIterativa(array, 3);
//
//        if(res) {
//            System.out.println("Existe");
//        }
//        else {
//            System.out.println("Não existe");
//        }

//        int pos = binPosicao(array, 1);
//
//        System.out.println("Resultado '" + binPosicaoEx4(array, 1) + "'.");
//        System.out.println("Resultado '" + binPosicaoEx4(array, 4) + "'.");
//        System.out.println("Resultado '" + binPosicaoEx4(array, 10) + "'.");
//        System.out.println("Resultado '" + binPosicaoEx4(array, 13) + "'.");
//        System.out.println("Resultado '" + binPosicaoEx4(array, 16) + "'.");

//        System.out.println("Resultado '" + binEx5(array, 15) + "'.");
//        System.out.println("Resultado '" + binEx5(array, 14) + "'.");
//        System.out.println("Resultado '" + binEx5(array, 3) + "'.");
//        System.out.println("Resultado '" + binEx5(array, 1) + "'.");
//        System.out.println("Resultado '" + binEx5(array, 100) + "'.");
//
        System.out.println("Resultado '" + binEx6(array, 0, 15) + "'.");
        System.out.println("Resultado '" + binEx6(array, 3, 7) + "'.");
        System.out.println("Resultado '" + binEx6(array, 4, 14) + "'.");
        System.out.println("Resultado '" + binEx6(array, 4, 5) + "'.");
        System.out.println("Resultado '" + binEx6(array, 0, 100) + "'.");
    }
}