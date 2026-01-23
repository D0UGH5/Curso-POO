package GenericsSetAndMap.Entities;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class Alunos implements Comparable<Alunos> {

    private String name;

    public Alunos(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Alunos alunos = (Alunos) o;
        return Objects.equals(name, alunos.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    @Override
    public int compareTo(@NotNull Alunos other) {
        return name.toUpperCase().compareTo(other.name.toUpperCase());
    }
}
