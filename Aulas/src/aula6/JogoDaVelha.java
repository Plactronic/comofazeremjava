public class JogoDaVelha {
    public static void main(String[] args){
        System.out.println("**** JOGO DA VELHA ****");
        System.out.println("Digite o nome do jogador 1:");
        String jogador1Nome = new  java.util.Scanner( System.in ).nextLine();
        Jogador j1 = new Jogador();
        j1.setNome(jogador1Nome);

        System.out.println("Digite o nome do jogador 2:");
        String jogador2Nome = new java.util.Scanner( System.in ).nextLine();
        Jogador j2 = new Jogador();
        j2.setNome(jogador2Nome);

        j1.setXouO("X");
        j2.setXouO("O");

        Jogo jogo = new Jogo();
        jogo.setJ1(j1);
        jogo.setJ2(j2);
        jogo.criar();
        jogo.setFinalizado(false);

        while(!jogo.isFinalizado()){
            jogo.turno(jogo.getJ1());
            jogo.turno(jogo.getJ2());
        }

        System.out.println("**** FIM DE JOGO ****");
    }
}

class Jogo{
    private Jogador j1;
    private Jogador j2;
    private boolean finalizado;
    private Tabuleiro tabuleiro;
    private Jogador jDaVez;

    public void turno(Jogador j){
        System.out.println("Turno do jogador: " + j.getNome());
        setjDaVez(j);
        mostreTabuleiro();
        boolean jogadaValida = false;

        while(!jogadaValida){
            int jogada = new java.util.Scanner( System.in ).nextInt();
            while(jogada < 0 || jogada > 8){
                System.out.println("Somente campos de 0 a 8 sao permitidos");
                System.out.println("Entre novamente com o valor do campo desejado:");
                jogada = new java.util.Scanner( System.in ).nextInt();
            }
            switch(jogada){
                case 0:
                    jogadaValida = getTabuleiro().getC0().setXouO(j.getXouO());
                    break;
                case 1:
                    jogadaValida = getTabuleiro().getC1().setXouO(j.getXouO());
                    break;
                case 2:
                    jogadaValida = getTabuleiro().getC2().setXouO(j.getXouO());
                    break;
                case 3:
                    jogadaValida = getTabuleiro().getC3().setXouO(j.getXouO());
                    break;
                case 4:
                    jogadaValida = getTabuleiro().getC4().setXouO(j.getXouO());
                    break;
                case 5:
                    jogadaValida = getTabuleiro().getC5().setXouO(j.getXouO());
                    break;
                case 6:
                    jogadaValida = getTabuleiro().getC6().setXouO(j.getXouO());
                    break;
                case 7:
                    jogadaValida = getTabuleiro().getC7().setXouO(j.getXouO());
                    break;
                case 8:
                    jogadaValida = getTabuleiro().getC8().setXouO(j.getXouO());
                    break;
                default:
                    setFinalizado(true);
                    jogadaValida = true;
            }
            getTabuleiro().getTabuleiroAtual();
        }
    }

    private void mostreTabuleiro(){
        System.out.println("Escolha uma posicao no tabuleiro.");
        System.out.println("0|1|2");
        System.out.println("3|4|5");
        System.out.println("6|7|8");
    }

    public Jogador getjDaVez() {
        return jDaVez;
    }

    public void setjDaVez(Jogador jDaVez) {
        this.jDaVez = jDaVez;
    }

    public void criar(){
        tabuleiro = new Tabuleiro();
        tabuleiro.getC0().setXouO(" ");
        tabuleiro.getC1().setXouO(" ");
        tabuleiro.getC2().setXouO(" ");
        tabuleiro.getC3().setXouO(" ");
        tabuleiro.getC4().setXouO(" ");
        tabuleiro.getC5().setXouO(" ");
        tabuleiro.getC6().setXouO(" ");
        tabuleiro.getC7().setXouO(" ");
        tabuleiro.getC8().setXouO(" ");

        tabuleiro.getC0().setOcupado(false);
        tabuleiro.getC1().setOcupado(false);
        tabuleiro.getC2().setOcupado(false);
        tabuleiro.getC3().setOcupado(false);
        tabuleiro.getC4().setOcupado(false);
        tabuleiro.getC5().setOcupado(false);
        tabuleiro.getC6().setOcupado(false);
        tabuleiro.getC7().setOcupado(false);
        tabuleiro.getC8().setOcupado(false);
    }

    public Tabuleiro getTabuleiro() {
        return tabuleiro;
    }

    public void setTabuleiro(Tabuleiro tabuleiro) {
        this.tabuleiro = tabuleiro;
    }

    public Jogador getJ1() {
        return j1;
    }

    public void setJ1(Jogador j1) {
        this.j1 = j1;
    }

    public Jogador getJ2() {
        return j2;
    }

    public void setJ2(Jogador j2) {
        this.j2 = j2;
    }

    public boolean isFinalizado() {
        return this.finalizado;
    }

    public void setFinalizado(boolean finalizado) {
        this.finalizado = finalizado;
    }
}

class Tabuleiro{
    //0|1|2
    //3|4|5
    //6|7|8
    //Um aula6.Tabuleiro vai ter 9 Campos
    Campo c0 = new Campo(); Campo c1 = new Campo(); Campo c2 = new Campo();
    Campo c3 = new Campo(); Campo c4 = new Campo(); Campo c5 = new Campo();
    Campo c6 = new Campo(); Campo c7 = new Campo(); Campo c8 = new Campo();

    public void getTabuleiroAtual(){
        System.out.println((getC0().getXouO() == " " ? "_" : getC0().getXouO())
                + "|" + (getC1().getXouO() == " " ? "_" : getC1().getXouO())
                + "|" + (getC2().getXouO() == " " ? "_" : getC2().getXouO()));

        System.out.println((getC3().getXouO() == " " ? "_" : getC3().getXouO())
                + "|" + (getC4().getXouO() == " " ? "_" : getC4().getXouO())
                + "|" + (getC5().getXouO() == " " ? "_" : getC5().getXouO()));

        System.out.println((getC6().getXouO()) + "|" + (getC7().getXouO()) + "|" + (getC8().getXouO()));
    }

    public Campo getC0() {
        return c0;
    }

    public void setC0(Campo c0) {
        this.c0 = c0;
    }

    public Campo getC1() {
        return c1;
    }

    public void setC1(Campo c1) {
        this.c1 = c1;
    }

    public Campo getC2() {
        return c2;
    }

    public void setC2(Campo c2) {
        this.c2 = c2;
    }

    public Campo getC3() {
        return c3;
    }

    public void setC3(Campo c3) {
        this.c3 = c3;
    }

    public Campo getC4() {
        return c4;
    }

    public void setC4(Campo c4) {
        this.c4 = c4;
    }

    public Campo getC5() {
        return c5;
    }

    public void setC5(Campo c5) {
        this.c5 = c5;
    }

    public Campo getC6() {
        return c6;
    }

    public void setC6(Campo c6) {
        this.c6 = c6;
    }

    public Campo getC7() {
        return c7;
    }

    public void setC7(Campo c7) {
        this.c7 = c7;
    }

    public Campo getC8() {
        return c8;
    }

    public void setC8(Campo c8) {
        this.c8 = c8;
    }
}

class Campo{
    private boolean ocupado;
    private String XouO;

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public String getXouO() {
        return XouO;
    }

    public boolean setXouO(String xouO) {
        if(!isOcupado()){
            XouO = xouO;
            setOcupado(true);
            return true;
        }
        System.out.println("Jogada inválida. Tente outro campo!");
        return false;
    }
}

class Jogador{
    private String nome;
    private String XouO;
    private boolean vencedor;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getXouO() {
        return XouO;
    }

    public void setXouO(String xouO) {
        XouO = xouO;
    }

    public boolean isVencedor() {
        return vencedor;
    }

    public void setVencedor(boolean vencedor) {
        this.vencedor = vencedor;
    }
}
