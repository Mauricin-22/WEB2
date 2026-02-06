import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Sistema sistema = new Sistema();
        int opcao;

        do {
            System.out.println("\n1-Adicionar  2-Listar  3-Sair");
            opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {
                System.out.print("Nome: ");
                sistema.adicionar(scanner.nextLine());
            }
            else if (opcao == 2) {
                sistema.listar();
            }
        } while (opcao != 3);

        scanner.close();
    }
}
