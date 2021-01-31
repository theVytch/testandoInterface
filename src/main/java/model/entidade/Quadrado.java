package model.entidade;

public class Quadrado implements FiguraGeometrica {

    private int lado;

    public Quadrado(int lado) {
        this.lado = lado;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }


    @Override
    public String getNomeFigura() {
        return "quadrado";
    }

    @Override
    public int area() {
        int valorArea;
        valorArea = lado * lado;
        return valorArea;
    }

    @Override
    public int perimetro() {
        int valorPerimentro;
        valorPerimentro = lado * 4;
        return valorPerimentro;
    }
}
