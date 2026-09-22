package aula05_pratica;

public class main{
    public static void main(String[] args){
        Conta c1 = new Conta();
        c1.setNumConta(1111);
        c1.setDono("Jubilas");
        c1.abrirConta("CC");

        c1.depositar(400);

        c1.estadoConta();

        Conta c2 = new Conta();
        c2.setNumConta(1112);
        c2.setDono("Creusa");
        c2.abrirConta("CP");
        c2.depositar(200);

        c2.fecharConta();

        c2.depositar(123);
        c2.setSaldo(0);
        c2.fecharConta();

        c2.estadoConta();
    }
}