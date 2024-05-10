import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    // Lista simulada de livros
    private static List<String> livros = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcao;
        do {
            mostrarMenu();
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    cadastrarLivro(scanner);
                    break;
                case 2:
                    listarLivros();
                    break;
                case 3:
                    emprestarLivro(scanner);
                    break;
                case 4:
                    devolverLivro(scanner);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);

        scanner.close();
    }

    private static void mostrarMenu() {
        System.out.println("=== Menu ===");
        System.out.println("1. Cadastrar Livro");
        System.out.println("2. Listar Livros");
        System.out.println("3. Emprestar Livro");
        System.out.println("4. Devolver Livro");
        System.out.println("0. Sair");
        System.out.println("============");
        System.out.print("Escolha uma opção: ");
    }

    private static void cadastrarLivro(Scanner scanner) {
        System.out.println("Digite o nome do livro:");
        String nomeLivro = scanner.nextLine();
        nomeLivro = scanner.nextLine(); // Limpar o buffer
        System.out.println("Digite o nome do autor:");
        String autor = scanner.nextLine();

        // Aqui você pode implementar a lógica para cadastrar o livro no banco de dados
        // Por enquanto, apenas adicionaremos o livro à lista simulada
        livros.add(nomeLivro + " - " + autor);
        System.out.println("Livro '" + nomeLivro + "' cadastrado com sucesso! Autor: " + autor);
    }

    private static void listarLivros() {
        System.out.println("Listar Livros:");
        if (livros.isEmpty()) {
            System.out.println("Nenhum livro cadastrado.");
        } else {
            for (int i = 0; i < livros.size(); i++) {
                System.out.println((i + 1) + ". " + livros.get(i));
            }
        }
    }

    private static void emprestarLivro(Scanner scanner) {
        System.out.println("Escolha o número do livro a ser emprestado:");
        listarLivros();
        // Aqui você pode implementar a lógica para emprestar o livro
    }

    private static void devolverLivro(Scanner scanner) {
        System.out.println("Escolha o número do livro a ser devolvido:");
        listarLivros();
        int numLivro = scanner.nextInt();
        if (numLivro >= 1 && numLivro <= livros.size()) {
            String livroDevolvido = livros.get(numLivro - 1);
            // Aqui você pode implementar a lógica para devolver o livro no banco de dados
            System.out.println("Livro '" + livroDevolvido + "' devolvido com sucesso!");
        } else {
            System.out.println("Número de livro inválido.");
        }
    }
}
