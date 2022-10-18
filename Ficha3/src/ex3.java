abstract class Figura implements Comparable<Figura>{
    public abstract double area();

    @Override
    public int compareTo(Figura o) {
        double dif = area() - o.area();

        if(dif > 0) return 1;
        if(dif < 0) return -1;
        return 0;
    }
}

class Retangulo extends Figura{

    double comprimento;
    double largura;

    public Retangulo(double comprimento, double largura) {
        this.comprimento = comprimento;
        this.largura = largura;
    }

    public double area(){
        return comprimento * largura;
    }
}

public class ex3 {

    public static int ex3_b(Retangulo rect, Comparable<? super Retangulo> outro){
        return outro.compareTo(rect);
    }

    public static <T> int ex3_c(T t, Comparable<? super T> outro){
        return outro.compareTo(t);
    }
}
