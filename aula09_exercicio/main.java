package aula09_exercicio;

public class main{
    public static void main(String[] args){
        pessoa p1 = new pessoa("Pedro", 22, "Sem experiencia");

        livro l1 = new livro("Jose Fernandes", p1, "No limiar da penumbra", 40);

        l1.detalhes();

        l1.setPagAtual(40);

        l1.detalhes();
        l1.avancarPag();
    }
}