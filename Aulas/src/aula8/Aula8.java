package aula8;

import java.awt.*;

public class Aula8 {

    public static void main(String[] args){

        Point ponto1 = new Point();
        ponto1.x = 10;
        ponto1.y = 10;

        Point ponto2 = ponto1;

        Point ponto3 = new Point();
        ponto3.x = 10;
        ponto3.y = 10;

        System.out.println("Iguais ? " + (ponto1 == ponto2));
        System.out.println("Iguais ? " + (ponto1 == ponto3));
        System.out.println("Iguais ? " + (ponto1.equals(ponto3)));


    }

    public static void limparXeY(Point p){
        System.out.println("1: " + p);
        p = new Point();
        System.out.println("2: " + p);
    }
}
