package aula06_encapsulamento;


public class main{
    public static void main(String[] args){
        controleRemoto c1 = new controleRemoto();

        c1.maisVolume();
        c1.ligar();
        for(int i = 0; i<24; i++){
            c1.maisVolume();
        }

        c1.abrirMenu();
        c1.desligar();

        c1.menosVolume();
        c1.abrirMenu();
        // c1.maisVolume();
    }
}

/*
Encapsulamento:



*/