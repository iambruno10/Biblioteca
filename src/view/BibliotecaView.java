package view;

import java.util.Scanner;

public class BibliotecaView {
    private Scanner scanner;

    public BibliotecaView() {
        this.scanner = new Scanner(System.in);
    }

    public int mostrarMenu() {
        System.out.println("Biblioteca Menu:");
        System.out.println("1. Cadastrar Livro");
        System.out.println("2. Listar Livros");
        System.out.println("3. Emprestar Livro");
        System.out.println("4. Devolver Livro");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
        return scanner.nextInt();
    }

    // Métodos para entrada de dados do usuário
}
