package aula7;

import java.util.Scanner;

public class Aula7 {

    //Packages
    public static void main(String[] args){
        System.out.println("Digite o nome do usuario:");
        Scanner scaneador = new Scanner(System.in);
        String nomeDoUsuario = scaneador.nextLine();
        System.out.printf("O nome do usuario é %s", nomeDoUsuario);
    }
}
