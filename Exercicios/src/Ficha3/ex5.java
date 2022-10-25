package Ficha3;

class Ponto <T extends Number, S extends Number> {
    T primeiro;
    S segundo;

    public Ponto(T primeiro, S segundo) {
        this.primeiro = primeiro;
        this.segundo = segundo;
    }

    public void copy(Ponto <? extends T, ? extends S> p){
        this.primeiro = p.primeiro;
        this.segundo = p.segundo;
    }

    @Override
    public String toString() {
        return "(" + primeiro + "," + segundo + ")";
    }
}

public class ex5 {
    public static void main(String[] args) {
        Ponto<Integer, Integer> p=new Ponto< >(3,4);
        Ponto<Number, Number> x=new Ponto<>(0,0);
        System.out.println(p); // imprime (3,4)
        System.out.println(x); // imprime (0,0)
        x.copy(p);
        System.out.println(x); // imprime (3,4)

//        Ponto<String, Integer> erro=
//                new Ponto<String,Integer>(“olá”,3);
    }
}
