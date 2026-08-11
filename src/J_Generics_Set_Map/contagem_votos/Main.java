package J_Generics_Set_Map.contagem_votos;

import J_Generics_Set_Map.contagem_votos.entities.Candidato;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Path file = Path.of(System.getProperty("user.home") + "//Desktop//candidatos.txt");

        Map<String, Candidato> candidatos = new HashMap<>();

        try (BufferedReader br = Files.newBufferedReader(file)){
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] dados = linha.split(",");

                Candidato candidato = new Candidato(dados[0], Integer.parseInt(dados[1]));
                if (candidatos.containsKey(candidato.getNome())) {
                    int somaVotos = 0;
                    somaVotos += candidatos.get(candidato.getNome()).getQuantidadeVotos() + candidato.getQuantidadeVotos();
                    candidatos.get(candidato.getNome()).setQuantidadeVotos(somaVotos);
                } else {
                    candidatos.put(dados[0], candidato);
                }
            }
            List<Candidato> candidatoList = new ArrayList<>(candidatos.values());

            candidatoList.sort((c1, c2) -> Integer.compare(c2.getQuantidadeVotos(), c1.getQuantidadeVotos()));

            for (Candidato c : candidatoList) {
                System.out.println(c.getNome() + ": " + c.getQuantidadeVotos());
            }
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
