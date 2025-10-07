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
    
    
}
