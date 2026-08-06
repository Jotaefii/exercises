package J_Generics_Set_Map.sistema_biblioteca.service;

import J_Generics_Set_Map.sistema_biblioteca.entities.Livro;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class BlibiotecaService {

    private final Map<Integer, Livro> livroMap = new HashMap<>();
    private final Set<String> generos = new HashSet<>();

    public void cadastrarLivro(Livro livro) {
        if (livroMap.containsKey(livro.getIsbn())) {
            System.out.println("Livro já cadastrado!");
            return;
        }

        livroMap.put(livro.getIsbn(), livro);

        generos.add(livro.getGender());
        System.out.println("Livro cadastrado!");
    }

    public Livro buscarLivro(int isbn) {
        return livroMap.get(isbn);
    }

    public void listarLivros() {
        for (Livro livro : livroMap.values()) {
            System.out.print(livro);
        }
    }

    public void listarGeneros() {
        for (String genero : generos) {
            System.out.println(genero);
        }
    }

    public void removerLivro(int isbn) {
        Livro livro = buscarLivro(isbn);

        if (livro == null) {
            System.out.println("Nenhum livro encontrado!");
            return;
        }

        livroMap.remove(livro.getIsbn());
    }
}
