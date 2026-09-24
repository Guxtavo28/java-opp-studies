package aula09_exercicio;

public class pessoa{
    private String nome;
    private int idade;
    private String sexo;

    public pessoa(String nome, int idade, String sexo){
        this.setNome(nome);
        this.setIdade(idade);
        this.setSexo(sexo);
    }

    public void apresentar(){
        System.out.println(this.getNome() + " de " + this.getIdade() + " anos" + ". Sexo: " + this.getSexo());
    }

    public void fazerAniversario(){
        this.setIdade(this.getIdade()+1);
        System.out.println("Feliz " + this.getIdade() + " anos!");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }


}