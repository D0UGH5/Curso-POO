package GenericsSetAndMap.Entities;

import java.util.Objects;

public class Candidato {

    private String nome;
    private Integer votos;

    public Candidato(String nome, Integer votos) {
        this.nome = nome;
        this.votos = votos;
    }

    public String getNome() {
        return nome;
    }

    public Integer getVotos() {
        return votos;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Candidato that = (Candidato) o;
        return Objects.equals(nome, that.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nome);
    }
}
