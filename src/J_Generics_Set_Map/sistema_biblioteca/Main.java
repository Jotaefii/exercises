package J_Generics_Set_Map.sistema_biblioteca;

import J_Generics_Set_Map.sistema_biblioteca.entities.Livro;
import J_Generics_Set_Map.sistema_biblioteca.service.BlibiotecaService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BlibiotecaService blibiotecaService = new BlibiotecaService();

        int opcao = 1;

        while (opcao != 0) {
            System.out.println("==========================");
            System.out.println("        BIBLIOTECA         ");
            System.out.println("==========================");

            System.out.println("1 - Cadastrar livro");
            System.out.println("2 - Buscar livro");
            System.out.println("3 - Listar livros");
            System.out.println("4 - Listar gêneros");
            System.out.println("5 - Remover livro");
            System.out.println("0 - Sair");

            System.out.println();
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("ISBN: ");
                    int isbn = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Titulo: ");
                    String title = sc.nextLine();

                    System.out.print("Autor: ");
                    String author = sc.nextLine();

                    System.out.print("Ano de lançamento: ");
                    int year = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Gênero: ");
                    String gender = sc.next();

                    Livro livro = new Livro(isbn, title, author, year, gender);

                    blibiotecaService.cadastrarLivro(livro);
                    break;

                case 2:
                    System.out.print("ISBN: ");
                    int isbnSearch = sc.nextInt();

                    Livro livro1 = blibiotecaService.buscarLivro(isbnSearch);

                    System.out.print(livro1);
                    break;

                case 3:
                    blibiotecaService.listarLivros();
                    break;

                case 4:
                    blibiotecaService.listarGeneros();
                    break;

                case 5:
                    System.out.print("ISBN: ");
                    int isbnSearchDelete = sc.nextInt();

                    blibiotecaService.removerLivro(isbnSearchDelete);
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
