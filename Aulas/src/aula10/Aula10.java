package aula10;

import javax.swing.plaf.TableUI;

public class Aula10 {

    public static void main(String[] args) {
        Tabuleiro t = new Tabuleiro();
        t.initTabuleiro();
        t.showTabuleiro();
        System.out.println("********************** MOVIMENTANDO ********************");
        t.moverPeca(1,0,2,0);
        t.showTabuleiro();
    }
}

class Tabuleiro{
    private final int LINHAS = 8;
    private final int COLUNAS = 8;
    private Casa[][] tabuleiro;

    public void initTabuleiro(){
        tabuleiro = new Casa[LINHAS][COLUNAS];
        for(int i = 0; i < LINHAS; i++){
            for(int j = 0; j < COLUNAS; j++){
                tabuleiro[i][j] = new Casa();
            }
        }
        initPecas(0,false,tabuleiro[0]);
        initPecas(1,true,tabuleiro[1]);

        initPecas(6,true,tabuleiro[6]);
        initPecas(7,false,tabuleiro[7]);
    }

    public void moverPeca(int atualLinha, int atualColuna, int linha, int coluna){
        for(int i = 0; i < LINHAS; i++){
            if(i == linha){
                for(int j = 0; j < COLUNAS; j++){
                    if(j == coluna){
                        Peca p = tabuleiro[atualLinha][atualColuna].getPeca();
                        tabuleiro[atualLinha][atualColuna].setOcupada(false);
                        tabuleiro[atualLinha][atualColuna].setPeca(null);

                        p.setLinha(linha);
                        p.setColuna(coluna);

                        tabuleiro[linha][coluna].setOcupada(true);
                        tabuleiro[linha][coluna].setPeca(p);
                    }
                }
            }
        }
    }

    public void showTabuleiro(){
        for(int i = 0; i < LINHAS; i++){
            System.out.println("_________________________________________________________");
            for(int j = 0; j < COLUNAS; j++){
                Peca p = tabuleiro[i][j].getPeca();
                if(null != p){
                    if(p.getNome().equals("peao")){
                        System.out.print("| "+ p.getNome() + " ");
                    }else{
                        System.out.print("|" + p.getNome()+ " ");
                    }

                    if(j == COLUNAS -1){
                        System.out.print("|");
                    }

                }else{
                    System.out.print("| vazio");
                    if(j == COLUNAS -1){
                        System.out.print("|");
                    }
                }
            }
            System.out.println("");
        }
        System.out.println("_________________________________________________________");
    }

    private Casa[] initPecas(int linha, boolean somentePeoes, Casa[] casa){
        if(somentePeoes){
            int p = 0;
            while(p < LINHAS){
                Peca peao = new Peca();
                peao.setNome("peao");
                peao.setLinha(linha);
                peao.setColuna(p);
                casa[p].setOcupada(true);
                casa[p].setPeca(peao);
                p++;
            }
            return casa;
        }else{
            Peca torre = new Peca();
            torre.setNome("torre");
            torre.setColuna(0);
            torre.setLinha(linha);
            casa[0].setOcupada(true);
            casa[0].setPeca(torre);

            Peca torre2 = new Peca();
            torre2.setNome("torre");
            torre2.setColuna(7);
            torre2.setLinha(linha);
            casa[7].setOcupada(true);
            casa[7].setPeca(torre2);

            Peca cavalo = new Peca();
            cavalo.setNome("cavalo");
            cavalo.setColuna(1);
            cavalo.setLinha(linha);
            casa[1].setOcupada(true);
            casa[1].setPeca(cavalo);

            Peca cavalo2 = new Peca();
            cavalo2.setNome("cavalo");
            cavalo2.setColuna(6);
            cavalo2.setLinha(linha);
            casa[6].setOcupada(true);
            casa[6].setPeca(cavalo2);

            Peca bispo = new Peca();
            bispo.setNome("bispo");
            bispo.setColuna(2);
            bispo.setLinha(linha);
            casa[2].setOcupada(true);
            casa[2].setPeca(bispo);

            Peca bispo2 = new Peca();
            bispo2.setNome("bispo");
            bispo2.setColuna(5);
            bispo2.setLinha(linha);
            casa[5].setOcupada(true);
            casa[5].setPeca(bispo2);

            Peca rainha = new Peca();
            rainha.setNome("rainha");
            rainha.setColuna(3);
            rainha.setLinha(linha);
            casa[3].setOcupada(true);
            casa[3].setPeca(rainha);

            Peca rei = new Peca();
            rei.setNome("rei");
            rei.setColuna(4);
            rei.setLinha(linha);
            casa[4].setOcupada(true);
            casa[4].setPeca(rei);

            return casa;
        }
    }
}

class Peca{
    private String nome;
    private int linha;
    private int coluna;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getLinha() {
        return linha;
    }

    public void setLinha(int linha) {
        this.linha = linha;
    }

    public int getColuna() {
        return coluna;
    }

    public void setColuna(int coluna) {
        this.coluna = coluna;
    }
}

class Casa{
    private boolean ocupada;
    private int linha;
    private int coluna;
    private Peca peca;

    public Peca getPeca() {
        return peca;
    }

    public void setPeca(Peca peca) {
        this.peca = peca;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }

    public int getLinha() {
        return linha;
    }

    public void setLinha(int linha) {
        this.linha = linha;
    }

    public int getColuna() {
        return coluna;
    }

    public void setColuna(int coluna) {
        this.coluna = coluna;
    }
}
