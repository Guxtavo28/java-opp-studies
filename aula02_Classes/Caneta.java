package aula02_Classes;
public class Caneta{
    public String modelo;
    public String cor;
    private float ponta;
    protected  int carga;
    private boolean tampada;

    public void status(){
        System.out.println("Modelo : " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Esta tampada? " + this.tampada);
    }

    public void rabiscar(){
        if(this.tampada){
            System.out.println("Não posso rabiscar. Tem que destampar garai kkkj");
        }else{
            System.out.println("Agora to rabiscando bagarai slk");
        }
    }

    public void tampar(){
        this.tampada = true;
    }

    public void destampar(){
        this.tampada = false;
    }
}