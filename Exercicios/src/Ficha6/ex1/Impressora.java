package Ficha6.ex1;

public class Impressora {

    private String nome;
    private int porto;
    private String marca;
    private String modelo;
    private String driver;
    private double versao;

    public Impressora(String nome, int porto, String marca, String modelo, String driver, double versao) {
        this.nome = nome;
        this.porto = porto;
        this.marca = marca;
        this.modelo = modelo;
        this.driver = driver;
        this.versao = versao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPorto() {
        return porto;
    }

    public void setPorto(int porto) {
        this.porto = porto;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public double getVersao() {
        return versao;
    }

    public void setVersao(double versao) {
        this.versao = versao;
    }

    @Override
    public String toString() {
        return "Impressora: " +
                "nome='" + nome + '\'' +
                ", porto=" + porto +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", driver='" + driver + '\'' +
                ", versao=" + versao + '\'';
    }
}
