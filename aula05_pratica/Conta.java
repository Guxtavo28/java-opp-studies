package aula05_pratica;

public class Conta {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    public Conta(){
        setSaldo(0);
        setStatus(false);

    }

    public void estadoConta(){
        System.out.println("------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus() + "\n");
    }

    public void abrirConta(String t){
        this.setTipo(t);
        this.setSaldo(0f);
        this.setStatus(true);

        if(t.equals("CC")){
            this.setSaldo(50);
        }else if(t.equals("CP")){
            this.setSaldo(150);
        }
        System.out.println("Conta aberta tmj\n");
    }

    public void fecharConta(){
        if(this.getSaldo() > 0){
            System.out.println("Tem dinheiro aqui, fecha nao garai");
        }else if(this.getSaldo() < 0){
            System.out.println("Ta devendo pagarai tmb. Vai fechar devendo a firma?");
        }else{
            System.out.println("Conta fechada tmj\n");
            this.setStatus(false);
        }
    }

    public void depositar(float valor){
        if(this.getStatus() && valor > 0){
            this.setSaldo(this.getSaldo() + valor);
        }else{
            System.out.println("Conta fechada");
        }
    }

    public void sacar(float valor){
        if(this.getStatus() && valor <= this.getSaldo()){
            this.setSaldo(this.getSaldo() - valor);
            System.out.println("Saldo sacado: " + valor);
            System.out.println("Saldo atual: " + this.getSaldo());
        }else{
            System.out.println("Conta fechada");
        }
    }

    public void pagarMensal(){
        float v = 0;
        if(this.getTipo().equals("CC")){
            v = 12;
        }else if(this.getTipo().equals("CP")){
            v = 20;
        }

        if(this.getStatus() && this.getSaldo() >= v){
            this.setSaldo(this.getSaldo() - v);
        }else{
            System.out.println("Conta fechada ou saldo insuficiente");
        }
    }

    //Getters e Setters-------------------------------------
    public void setNumConta(int m){
        this.numConta = m;
    }
    public int getNumConta(){
        return this.numConta;
    }

    public void setTipo(String t){
        this.tipo = t;
    }
    public String getTipo(){
        return this.tipo;
    }

    public void setDono(String d){
        this.dono = d;
    }
    public String getDono(){
        return this.dono;
    }

    public void setSaldo(float s){
        this.saldo = s;
    }
    public float getSaldo(){
        return this.saldo;
    }

    public void setStatus(boolean s){
        this.status = s;
    }
    public boolean getStatus(){
        return this.status;
    }
    //Fim getters e setters -----------------------------------------
}
