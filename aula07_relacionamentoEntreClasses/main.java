package aula07_relacionamentoEntreClasses;

import java.util.ArrayList;

public class main{
    public static void main(String[] args) {
        ArrayList<lutador> l = new ArrayList<>(6);
        l.add(0, new lutador("Prett", "France", 31, 1.75f, 86.9f, 11, 3, 1));
        l.add(1, new lutador("Put", "Brazil", 29, 1.68f, 57.8f, 14, 2, 3) );
        l.add(2, new lutador("Snap", "USA", 35, 1.65f, 80.9f, 12, 2, 1));
        l.add(3, new lutador("Dead", "Australai", 28, 1.93f, 81.6f, 13, 0, 2));
        l.add(4, new lutador("Ufo", "Brazil", 37, 1.70f, 119.3f, 5, 4, 3));
        l.add(5, new lutador("Nerd", "USA", 30, 1.81f, 105.7f, 12, 2, 4));

        // l.get(1).apresentar();
        // System.out.println();
        // l.get(0).apresentar();

        // l.get(2).status();
        // l.get(3).getCategoria();
        // l.get(1).ganharLuta();
        // l.get(0).empatarLuta();
        // System.out.println();
        // System.out.println();
        // l.get(1).apresentar();
        // System.out.println();
        // l.get(0).apresentar();

        System.out.println("Luta 1: ");
        luta UFC01 = new luta();
        UFC01.marcarLuta(l.get(0), l.get(1));
        UFC01.lutar();

        System.out.println("\n\nLuta 2: ");

        luta UFC02 = new luta();
        UFC02.marcarLuta(l.get(2), l.get(2));
        UFC02.lutar();

        
        System.out.println("\n\nLuta 3: ");

        luta UFC03 = new luta();
        UFC03.marcarLuta(l.get(4), l.get(5));
        UFC03.lutar();
    }
}