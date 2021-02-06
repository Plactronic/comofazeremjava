package aula9;

public class Aula9 {

    public static void main(String[] args){
        int numero = 9;

        // | espaco 1 | espaco 2 | espaco 3|
        int[] idades = new int[3];
        idades[0] = 12;
        idades[1] = 24;
        idades[2] = 36;


        String[] nomes = new String[]{"Pedro", "Aline", "Paulo"};
        Aluno[] alunos = new Aluno[nomes.length];

        double[] notasAluno1 = new double[]{5.5,5.9,6.8};
        double[] notasAluno2 = new double[]{7.5,5.9,6.8};
        double[] notasAluno3 = new double[]{5.5,9.9,6.8};

        int indice = 0;
        for(String nome : nomes){
            Aluno aluno = new Aluno();
            aluno.setNome(nome);
            alunos[indice] = aluno;
            indice += 1;
        }

        alunos[0].setNotas(notasAluno1);
        alunos[1].setNotas(notasAluno2);
        alunos[2].setNotas(notasAluno3);


        for(Aluno alunosOliveira : alunos){
            System.out.println(alunosOliveira.getNome());
            System.out.println("Nota média: " + alunosOliveira.getNotaMedia(alunosOliveira.getNotas()));
        }


    }
}

class Aluno{
    private String nome;
    private int nota;
    private double[] notas;

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public double getNotaMedia(double... notas){
        double soma = 0;
        for(double nota : notas){
            soma += nota;
        }
        return soma / notas.length;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome + " de Oliveira";
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
}
