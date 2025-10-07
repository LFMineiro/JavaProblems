import java.util.Objects;

public class Aluno {
    private String nome;
    private Integer matricula;

    public Aluno(String nome, Integer matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Aluno: " + nome + " (" + matricula + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;

        Aluno aluno = (Aluno) obj;
        return Objects.equals(matricula, aluno.matricula);
    }
    
    
}
