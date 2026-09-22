package aula02_Classes;
public class main{
    public static void main(String[] args){
        Caneta c1 = new Caneta();

        c1.modelo = "BIC";
        c1.carga = 2;
        c1.cor = "Preto berinjela";
        c1.tampar();
        c1.status();
        System.out.println("\n\n");

        c1.destampar();
        c1.status();
    }
}