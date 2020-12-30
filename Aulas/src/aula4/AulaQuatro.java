package aula4;

public class AulaQuatro {
    public static void main(String[] args){
        //Loops, lacos, repeticoes
        int numero = (int) (Math.random() * 5 +1);

        while(true){
            System.out.println("Que número estou pensando entre 1 e 5?");
            int chute = new java.util.Scanner( System.in ).nextInt();

            if(chute < 1 || chute > 5){
                System.out.println("Somente números entre 1 e 5, por favor!");
                continue;
            }

            if(numero == chute){
                System.out.println("Parabéns!");
                break;
            }
            else if( numero > chute){
                System.out.println("Opa... o meu número é maior do que o seu chute!");
            }else if( numero < chute){
                System.out.println("Opa... o meu número é menor do que o seu chute!");
            }

        }
    }
}
