package aula2;

public class AulaDois {

    public static void main(String[] args){
        System.out.println("Aula 2");
        //operador de atribuicao =
        int numeroDaCasa = 12;
//        System.out.println("Inteiro " + numeroDaCasa);
        //operadores aritmeticos + - * / %
        int saldo = 100;
        int deposito = 10;
        int total = saldo + deposito;
//        System.out.println("Soma " + total);

        int saque = 15;
        total = total - saque;
//        System.out.println("Subtracao " + total);

        int rendaExtra = 3;
        total = total * rendaExtra;
//        System.out.println("Multiplicacao " + total);

        int distribuicao = 5;
        total = total / distribuicao;
//        System.out.println("Divisao " + total);

        int restoZero = 3;
        int restoNaoZero = 5;
        //% módulo -> retorna o resto de uma divisao
        int totalSemResto = numeroDaCasa % restoZero;
        int totalComResto = numeroDaCasa % restoNaoZero;

//        System.out.println("Modulo resto zero " + totalSemResto);
//        System.out.println("Modulo resto nao zero " + totalComResto);

        //Incrementar ++
        int contador = 0;
//        ++contador;
//        System.out.println("Contador " + ++contador);
//        System.out.println("Contador " + contador);
        //Decrementar --

        int idadeJoao = 8;
        int idadeMaria = 9;
        int idadePedro = 8;

        System.out.println("Joao é mais velho do que Maria? " + (idadeJoao > idadeMaria));
        System.out.println("Joao é mais novo do que Pedro? " + (idadeJoao < idadePedro));
        System.out.println("Joao tem a mesma idade que Pedro? " + (idadeJoao == idadePedro));
        System.out.println("Joao e Maria tem idades diferentes? " + (idadeJoao != idadeMaria));

        //AND - > E
        System.out.println("Joao é mais velho do que Maria e tem a mesma idade de Pedro?"
                + ((idadeJoao > idadeMaria) && (idadeJoao == idadePedro)));
        System.out.println("Maria é mais velha do que Joao e Joao tem a mesma idade de Pedro?"
                + ((idadeMaria > idadeJoao) && (idadeJoao == idadePedro)));

        //OR - > OU
        System.out.println("Joao é mais velho do que Maria ou ele tem a mesma idade de Pedro?"
                + ((idadeJoao > idadeMaria) || (idadeJoao == idadePedro)));
    }
}
