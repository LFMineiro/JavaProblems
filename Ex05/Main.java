public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Luiz", 23048);
        Aluno aluno2 = new Aluno("Thiago", 23048);
        System.out.println(aluno1);
        System.out.println(aluno2);
        System.out.println(aluno1.equals(aluno2));
    }
}
