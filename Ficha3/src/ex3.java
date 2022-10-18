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
class Quadrado extends Figura{

    double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double area(){
        return lado * lado;
    }
}

public class ex3 {

    public static void main(String[] args) {
        Comparable<Object> co = new Comparable<Object>() {
            @Override
            public int compareTo(Object o) {
                return 0;
            }
        };
        Comparable<Figura> cf = new Comparable<Figura>() {
            @Override
            public int compareTo(Figura o) {
                return 0;
            }
        };
        Comparable<Retangulo> cr = new Comparable<Retangulo>() {
            @Override
            public int compareTo(Retangulo o) {
                return 0;
            }
        };

        Retangulo r = new Retangulo(5, 5);
        Quadrado q = new Quadrado(5);

        System.out.println("Resultado: " + ex3_b(r, q));
        System.out.println("Resultado: " + ex3_b(r, r));
        System.out.println("Resultado: " + ex3_b(r, cr));
        System.out.println("Resultado: " + ex3_b(r, co));
        System.out.println("Resultado: " + ex3_b(r, cf));

        System.out.println("Resultado: " + ex3_c(r, q));
        System.out.println("Resultado: " + ex3_c(r, r));
        System.out.println("Resultado: " + ex3_c(r, cr));
        System.out.println("Resultado: " + ex3_c(r, co));
        System.out.println("Resultado: " + ex3_c(r, cf));

    }

    public static int ex3_b(Retangulo rect, Comparable<? super Retangulo> outro){
        return outro.compareTo(rect);
    }

    public static <T> int ex3_c(T t, Comparable<? super T> outro){
        return outro.compareTo(t);
    }
}
