package aula3;

public class AulaTres1 {
    public static void main(String[] args){
        System.out.println("Digite o primeiro valor:");
        double primeiroNumero = new java.util.Scanner( System.in ).nextDouble();
        System.out.println("Digite a operacao desejada: +, -, /, *");
        char operador = new java.util.Scanner( System.in ).nextLine().charAt(0);
        System.out.println("Digite o segundo valor:");
        double segundoNumero = new java.util.Scanner( System.in ).nextDouble();

        switch(operador){
            case '+':
                System.out.println("Resultado da soma: " + (primeiroNumero + segundoNumero));
                break;
            case '-':
                System.out.println("Resultado da substracao " + (primeiroNumero - segundoNumero));
                break;
            case '/':
                System.out.println("Resultado da divisao: " + (primeiroNumero / segundoNumero));
                break;
            case '*':
                System.out.println("Resultado da multiplicacao: " + (primeiroNumero * segundoNumero));
                break;
        }
    }
}
