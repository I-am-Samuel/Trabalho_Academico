import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cinema {

    private static List<Secao> secoes = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;
        do {
            System.out.println("Menu:");
            System.out.println("1. Cadastrar");
            System.out.println("2. Vender");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    cadastrar();
                    break;
                case 2:
                    
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 3);
    }

    private static void cadastrar() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Cadastro da seção " + i);
            System.out.print("Nome do filme: ");
            String nomeFilme = scanner.nextLine();
            System.out.print("Horário (formato HH:MM): ");
            String horario = scanner.nextLine();

            Secao secao = new Secao(nomeFilme, horario);
            secoes.add(secao);

            System.out.println("Seção cadastrada com sucesso!\n");
        }
    }
     private static void vender() {
        
        if (secoes.isEmpty()) {
            System.out.println("Nenhuma seção cadastrada para venda.");
            return;
        }
    
        
        System.out.println("Seções disponíveis:");
        for (int i = 0; i < secoes.size(); i++) {
            Secao secao = secoes.get(i);
            System.out.println((i + 1) + ". " + secao.getNomeFilme() + " - Horário: " + secao.getHorario());
        }
    
        
        System.out.print("Escolha uma seção pelo número: ");
        int escolha = scanner.nextInt();
        
    
        Secao secaoEscolhida = secoes.get(escolha - 1);
    
        
        System.out.println("Você escolheu a seção: " + secaoEscolhida.getNomeFilme() +
                           " no horário " + secaoEscolhida.getHorario() + ". Venda confirmada!");
        
       
    }   

}
