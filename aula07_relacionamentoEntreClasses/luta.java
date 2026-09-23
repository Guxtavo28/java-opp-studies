package aula07_relacionamentoEntreClasses;

import java.util.Random;



public class luta{
    private lutador desafiado;
    private lutador desafiante;
    private int rounds;
    private boolean aprovada;

    public void marcarLuta(lutador l1, lutador l2){
        if(l1.getCategoria().equals(l1.getCategoria()) && l1 != l2){
            this.setAprovada(true);
            this.setDesafiado(l1);
            this.setDesafiante(l2);
        }
        if(!(l1.getCategoria().equals(l2.getCategoria()))){
            System.out.println("Da pra lutar nao garai. Os cara tem categorias diferentes: ");
            System.out.println("O primeiro: " + l1.getPeso());
            System.out.println("O segundo: " + l2.getPeso());
            this.setAprovada(false);
            if(l1.getPeso() > l2.getPeso()){
                System.out.println("Desse jeito o " + l1.getNome() + " vai amassar o " + l2.getNome());
            }else{
                System.out.println("Desse jeito o " + l2.getNome() + " vai amassar o " + l1.getNome());
            }
        }

        if(l1==l2){
            this.setAprovada(false);
            System.out.println("Erraram na chave de novo nessa porra. Tão querendo colocar o " + l1.getNome() + " pra lutar com ele mesmo");
        }
    }

    public void lutar(){
        if(this.isAprovada()){
            System.out.println("##DESAFIADO##");
            desafiado.apresentar();
            System.out.println("\n##DESAFIANTE##");
            desafiante.apresentar();
            Random gerador = new Random();
            int r = gerador.nextInt(3);
            System.out.println("\n\n##RESULTADO##");
            switch(r){
                case 0:
                    System.out.println("Empate!");
                    this.getDesafiado().empatarLuta();
                    this.getDesafiante().empatarLuta();
                    break;
                case 1:
                    System.out.println("Vencedor: " + this.getDesafiado().getNome());
                    this.getDesafiado().ganharLuta();
                    this.getDesafiante().perderLuta();
                    break;
                
                case 2:
                    System.out.println("Vencedor: " + this.getDesafiante().getNome());
                    this.getDesafiante().ganharLuta();
                    this.getDesafiado().perderLuta();
                    break;
                default:
                    throw new AssertionError();
            }
        }
    }

    

    public lutador getDesafiado() {
        return desafiado;
    }
    public void setDesafiado(lutador desafiado) {
        this.desafiado = desafiado;
    }

    public lutador getDesafiante() {
        return desafiante;
    }
    public void setDesafiante(lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }
    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }
    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}
