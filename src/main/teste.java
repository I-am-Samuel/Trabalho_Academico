package main;

import java.util.Random;
import gerenciador.Secao;

public class Teste {
    public static void main(String[] args) {
        Random random = new Random();

        Secao ses1 = new Secao("Velozes e Furiosos 1", "13:45");
        Secao ses2 = new Secao("Velozes e Furiosos 2", "15:15");
        Secao ses3 = new Secao("Velozes e Furiosos 3", "16:30");

        Secao[] vetor = {ses1, ses2, ses3};

        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 20; i++) {
                vetor[j].getAssento().setAssento(random.nextInt(5), random.nextInt(4), random.nextBoolean());
            }
            System.out.println(vetor[j].toString());
            
            System.out.println("/");
            System.out.println(vetor[j].getAssento().mostraLugares());
            System.out.println("\\");
            
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        }
    }
}
