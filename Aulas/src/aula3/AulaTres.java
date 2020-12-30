package aula3;

public class AulaTres {

    public static void main(String[] args){

        int numeroAleatorio = (int) (Math.random() * 5 +1);

        System.out.println("Qual o número escondido na variável?");
        int chute = new java.util.Scanner( System.in ).nextInt();

        // numero == chute
        if(numeroAleatorio == chute){
            System.out.println("Parabéns você acertou e ganhou 10 pontos!");
        } else if(chute == (numeroAleatorio -1) || chute == (numeroAleatorio+1)){
            System.out.println("Parabéns você chegou perto e ganhou 7 pontos!");
            System.out.printf("O número era %d", numeroAleatorio);
        }
        else {
            System.out.printf("Errou! O número era %d ", numeroAleatorio);
            System.out.println("");
            System.out.println("Recomece o programa e tente de novo!");
        }

        if(chute > 0){
            System.out.println("O numero era positivo!");
        }else{
            System.out.println("O numero era negativo");
        }





    }

}
