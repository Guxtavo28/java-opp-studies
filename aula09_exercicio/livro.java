package aula09_exercicio;

import java.util.Random;

public class livro implements publicacao{
    private String titulo, autor;
    private int totPaginas, pagAtual;
    private boolean aberto;
    private pessoa leitor;

    public livro(String autor, pessoa leitor, String titulo, int totPaginas) {
        this.setAutor(autor);
        this.setLeitor(leitor);
        this.setTitulo(titulo);
        this.setTotPaginas(totPaginas);
        
        this.setPagAtual(0);
        this.setAberto(false);
    }
    
    public void detalhes(){
        System.out.println("Titulo: " + this.getTitulo());
        System.out.println("Autor: " + this.getAutor());
        System.out.println("Total de paginas: " + this.getTotPaginas());
        System.out.println("Pagina atual: " + this.getPagAtual());
        if(this.isAberto()){
            System.out.println("Esta: aberto");
        }else{
            System.out.println("Esta: fechado");
        }
        System.out.print("Quem essta lendo: "); this.leitor.apresentar();
    }
    
    @Override
    public void abrir(){
        if(this.isAberto()){
            System.out.println("Já estava aberto");
        }else{
            this.setAberto(true);
        }
    }

    @Override 
    public void fechar(){
        if(!this.isAberto()){
            System.out.println("Já estava fechado");
        }else{
            this.setAberto(false);
        }
    }

    @Override
    public void folhear(){
        Random gerador = new Random();
        int pag = gerador.nextInt(this.getTotPaginas()+1);
        this.setPagAtual(pag);
        System.out.println("Parou na página " + pag);
    }

    @Override
    public void avancarPag(){
        if(this.getPagAtual() >= getTotPaginas()){
            System.out.println("Está na ultima pagina. Não há mais como avançar");
        }else{
            this.setPagAtual(this.getPagAtual()+1);
        }
    }

    @Override 
    public void voltarPag(){
        if(this.getPagAtual() == 0){
            System.out.println("Está na primeira página. Não há como voltar");
        }else{
            this.setPagAtual(this.getPagAtual()-1);
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        if(this.getPagAtual() < pagAtual){
            System.out.println("Nao tem como ir para essa pagina. O maximo e: " + this.getTotPaginas());
        }else{
            this.pagAtual = pagAtual;
        }
        
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(pessoa leitor) {
        this.leitor = leitor;
    }

   


}