package J_Generics_Set_Map.contagem_votos.entities;

public class Candidato implements Comparable<Candidato> {
    private String nome;
    private Integer quantidadeVotos;

    public Candidato(String nome, Integer quantidadeVotos) {
        this.nome = nome;
        this.quantidadeVotos = quantidadeVotos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQuantidadeVotos() {
        return quantidadeVotos;
    }

    public void setQuantidadeVotos(Integer quantidadeVotos) {
        this.quantidadeVotos = quantidadeVotos;
    }


    @Override
    public int compareTo(Candidato o) {
        return -getQuantidadeVotos().compareTo(o.quantidadeVotos);
    }
}
