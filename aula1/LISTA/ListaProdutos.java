import java.util.ArrayList;
import java.util.Scanner;

public class ListaProdutos {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
      
        ArrayList<String> produtos = new ArrayList<>();

        int opcao;

        do{
            System.out.println("\n=== MENU ===");
            System.out.print("\n1 - Adicionar.");
            System.out.print("\n2 - Listar.");
            System.out.print("\n3 - Remover.");
            System.out.print("\n4 - Sair.");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("\nNome do produto: ");
                    String nomeProduto = scanner.nextLine();
                    produtos.add(nomeProduto);

                    System.out.println("\nProduto " + nomeProduto + " adicionado. ");
                    break;

                case 2:
                    if (produtos.isEmpty()) {
                        System.out.println("\nLista vazia.");
                    } else {
                        final int[] i = {1};
                        produtos.forEach(p -> {
                            System.out.println(i[0] + ". " + p);
                            i[0]++;
                        });
                    }
                    break;
                
                case 3:
                    System.out.println("\nRemova produto.");
                    int indice = scanner.nextInt();

                    if (indice > 0 && indice <= produtos.size()) {
                        produtos.remove(indice - 1);
                    } else {
                        System.out.println("\nÍndice inválido.");
                    }
                    break;

                case 4:
                    System.out.println("\nEncerrando sistema...");
                    break;
                  
                default:
                    System.out.println("\nOpção inválida");
            }

        } while (opcao != 4);

        scanner.close();
    }
}
