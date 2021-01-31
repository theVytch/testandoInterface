package aplicacao;

import model.entidade.FiguraGeometrica;
import model.entidade.Quadrado;
import model.entidade.Triangulo;

public class Programa {

    public static void main(String[] args) {


        Quadrado quadrado = new Quadrado(2);

        FiguraGeometrica figuraGeometricaQua = new Quadrado(2);
        FiguraGeometrica figuraGeometricaTri = new Triangulo(20, 30, 30, 20, 50);


        System.out.println("Nome: "+ figuraGeometricaQua.getNomeFigura());
        System.out.println("Area: "+figuraGeometricaQua.area());
        System.out.println("Perimetro: "+figuraGeometricaQua.perimetro());

        System.out.println("-------------------------------");

        System.out.println("Nome: "+figuraGeometricaTri.getNomeFigura());
        System.out.println("Area: "+figuraGeometricaTri.area());
        System.out.println("Perimetro: "+figuraGeometricaTri.perimetro());


    }

}
