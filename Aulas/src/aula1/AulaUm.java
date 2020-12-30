package aula1;

public class AulaUm {

    public static void main(String[] args){

        //tipos primitivos
        int idade = 34;
        boolean solteiro = true;
        double altura = 1.81;

        //tipos por referencia
        String nome = "Plactronic";

        System.out.println("Olá, como é o seu nome?");
        String nomeDoUsuario = new java.util.Scanner( System.in ).nextLine();

        //%s == String
        System.out.printf("Prazer %s. Meu nome é Plactronic!", nomeDoUsuario);
        System.out.println("");
        System.out.println("Quantos anos você tem?");

        int idadeDoUsuario = new java.util.Scanner( System.in ).nextInt();
        //%d == int
        System.out.printf("Interessante! %d é o dobro da sua idade!", idadeDoUsuario*2);
        System.out.println("");
        System.out.printf("%s, qual é a sua altura?", nomeDoUsuario);

        double alturaDoUsuario = new java.util.Scanner( System.in ).nextDouble();
        System.out.printf("%s Legal! Eu tenho %s", alturaDoUsuario, Math.random()*100);
        System.out.println("");
        System.out.println("Tenha um bom dia! Até a próxima aula!");
    }
}
