package main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import gerenciador.*;
import formatador.*;

public class Cinema {

    private static List<Secao> secoes = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    private static MenuFormatter format = new MenuFormatter();

    public static void main(String[] args) throws IOException, InterruptedException {
        int opcao;
        do {
            format.titulo("Menu:");
            System.out.println("1. Cadastrar"
                      + "\n" + "2. Vender"
                      + "\n" + "3. Sair");
            format.linha();

            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            format.limparTerminal();

            switch (opcao) {
                case 1:
                    cadastrar();
                    break;

                case 2:
                    vender();
                    break;

                case 3:
                    creditos();
                    format.mensagemTerminal(false, "Saindo...");
                    break;

                case 999: // Modo Teste
                    modo999();
                    break;

                default:
                    format.mensagemTerminal(true, "Opção inválida. Tente novamente.");
            }
            
		    format.delay(2);
            format.limparTerminal();
        } while (opcao != 3);
    }

    private static void cadastrar() throws IOException, InterruptedException {
        for (int i = 1; i <= 5; i++) {
            format.titulo("Cadastro da seção " + i);

            System.out.print("Nome do filme: ");
            String nomeFilme = scanner.nextLine();

            System.out.print("Horário (formato HH:MM): ");
            String horario = scanner.nextLine();

            Secao secao = new Secao(nomeFilme, horario, true);
            secoes.add(secao);

            format.mensagemTerminal(false, "Seção cadastrada com sucesso!");

		    format.delay(1);
            format.limparTerminal();
        }
    }
     private static void vender() {
        
        if (secoes.isEmpty()) {
            format.mensagemTerminal(false, "Nenhuma seção cadastrada para venda.");
            return;
        }
    
        format.titulo("Seções disponíveis:");
        for (int i = 0; i < secoes.size(); i++) {
            Secao secao = secoes.get(i);
            System.out.println((i + 1) + ". " + secao.getNomeFilme() + " - Horário: " + secao.getFormatHorario());
        }

        format.linha();
    
        System.out.print("Escolha uma seção pelo número identificador: ");
        int escolha = scanner.nextInt();
        
        format.linha();

        Secao secaoEscolhida = secoes.get(escolha - 1);

        format.mensagemTerminal(false, "Você escolheu a seção: " + secaoEscolhida.getNomeFilme() +
                           " no horário " + secaoEscolhida.getFormatHorario() + ". Venda confirmada!");
    }   

    public static void creditos () {
		format.titulo("Créditos");

		format.centralizar("Davi Rodrigues");
		format.centralizar("Samuel Eduardo");
		format.centralizar("Thiago Holz Coutinho");
	}

    private static void modo999 () {
        secoes.add(new Secao("Velozes e Furisos", "11:30", true));
        secoes.add(new Secao("Titanic"          , "12:30", false));
        secoes.add(new Secao("Avatar"           , "13:30", true));
        secoes.add(new Secao("Drive"            , "14:30", false));
        secoes.add(new Secao("Blade Runner 2049", "16:30", true));

        format.mensagemTerminal(false, "Seções Padrões cadastradas com sucesso!");

    }
}
