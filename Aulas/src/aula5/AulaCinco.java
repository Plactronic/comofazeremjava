package aula5;

/**
 * Aula 5: Classes, objetos e métodos
 */
public class AulaCinco {

    public static void main(String[] args){
        System.out.println("Criando um objeto da classe livro:");
        Livro livroUm = new Livro();
        livroUm.setNomeDoLivro("O senhor dos anéis");
        livroUm.setAutor("Tolkien");
        livroUm.setNumeroDePaginas(900);
        livroUm.setEditora("Abril");

        Livro livroDois = new Livro();
        livroDois.setNomeDoLivro("Os cantos de maldoror");
        livroDois.setNumeroDePaginas(453);
        livroDois.setEditora("Heidelberg");
        livroDois.setAutor("Lautreamont");

        System.out.println("aula5.Livro um. Nome do livro: " + livroUm.getNomeDoLivro());
        System.out.println("aula5.Livro dois. Autor: " + livroDois.getAutor());
        System.out.println("aula5.Livro dois. Editora: " + livroDois.getEditora());
    }
}

class Livro{
    String nomeDoLivro;
    String autor;
    int numeroDePaginas;
    String editora;

    private void adicionarLTDA(){
        this.editora += " LTDA.";
    }

    public void setNomeDoLivro(String nomeDoLivro){
        this.nomeDoLivro = nomeDoLivro;
    }

    public String getNomeDoLivro(){
        return this.nomeDoLivro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
        adicionarLTDA();
    }
}

