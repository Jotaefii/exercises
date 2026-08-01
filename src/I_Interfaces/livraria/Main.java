package I_Interfaces.livraria;

import I_Interfaces.livraria.entities.Book;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Book> books = new ArrayList<>();
        Path files = Path.of(System.getProperty("user.home") + "//Desktop//Books.txt");

        int opcao = 1;
        while (opcao != 0) {
            System.out.println("1 - Adicionar livro");
            System.out.println("2 - Listar livros");
            System.out.println("0 - Sair");
            opcao = sc.nextInt();
            sc.nextLine();

            System.out.println();

            switch (opcao) {
                case 1:
                    try (BufferedWriter bw = Files.newBufferedWriter(files, StandardOpenOption.CREATE, StandardOpenOption.APPEND)) {
                        System.out.print("Digite o titulo do livro: ");
                        String titulo = sc.nextLine();
                        System.out.print("Digite o autor do livro: ");
                        String autor = sc.nextLine();
                        System.out.print("Digite o preco do livro: ");
                        double preco = sc.nextDouble();

                        Book book = new Book(titulo, autor, preco);

                        bw.write(book.toString());
                        bw.newLine();
                        System.out.println();
                    }
                    catch (IOException e){
                        System.out.println("Error: " +  e.getMessage());
                    }
                    break;

                case 2:
                    try (BufferedReader br = Files.newBufferedReader(files)){
                        String linha;
                        while ((linha = br.readLine()) != null) {
                            String[] linhas = linha.split(",");
                            Book book = new Book(linhas[0], linhas[1], Double.parseDouble(linhas[2]));
                            books.add(book);
                        }
                        Collections.sort(books);
                        for (Book book : books) {
                            System.out.println(book);
                        }
                        System.out.println();
                    }
                    catch (IOException e){
                        System.out.println("Error: " +  e.getMessage());
                    }
                    break;
            }
        }
    }
}
