package aula06_encapsulamento;

public class controleRemoto implements controlador{
    private int volume;
    private boolean ligado;
    private boolean tocando;

    public controleRemoto(){
        setVolume(50);
        setLigado(false);
        setTocando(false);
    }

    private int getVolume(){
        return this.volume;
    }
    private void setVolume(int v){
        this.volume = v;
    }

    private boolean getLigado(){
        return this.ligado;
    }
    private void setLigado(boolean l){
        this.ligado = l;
    }

    private boolean getTocando(){
        return this.tocando;
    }
    private void setTocando(boolean t){
        this.tocando = t;
    }

    //métodos abstratos
    @Override
    public void ligar(){
        this.setLigado(true);
    }

    @Override 
    public void desligar(){
        this.setLigado(false);
    }

    @Override 
    public void abrirMenu(){
        System.out.println("-------MENU-----");
        System.out.println("Esta ligado? " + this.getLigado());
        System.out.println("Esta tocando? " + this.getTocando());
        System.out.print("Volume: " + this.getVolume() + ": ");
        for(int i = 0; i<= this.getVolume(); i+=10){
            System.out.print(" [] ");
        }
        System.out.println();
    }

    @Override 
    public void fecharMenu(){
        System.out.println("Fechando menu");
    }

    @Override 
    public void maisVolume(){
        if(this.getLigado() && this.getVolume() <= 95){
            this.setVolume(this.getVolume() + 5);
        }else{
            System.out.println("Nao da pra aumentar");
        }
    }

    @Override 
    public void menosVolume(){
        if(this.getLigado() && this.getVolume() >= 5){
            this.setVolume(this.getVolume()-5);
        }else{
            System.out.println("Nao da pra diminuir");
        }
    }

    @Override 
    public void ligarMudo(){
        if(this.getLigado() && this.getVolume() > 0){
            this.setVolume(0);
        }
    }

    @Override 
    public void desligarMudo(){
        if(this.getLigado() && this.getVolume() == 0){
            this.setVolume(50);
        }
    }

    @Override 
    public void play(){
        if(this.getLigado() && !(this.getTocando())){
            this.setTocando(true);
        }
    }

    @Override 
    public void pause(){
        if(this.getLigado() && this.getTocando()){
            this.setTocando(false);
        }
    }

}