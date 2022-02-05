public class Main {

    public static void main(String[] args) {
        Aluno aluno00001 = new Aluno("José Henrique", "123.456.789-00");
        aluno00001.matricula = "515155";
        System.out.println(aluno00001.nome);
        System.out.println(aluno00001.cpf);
        System.out.println(aluno00001.matricula);

        System.out.println("O aluno " + aluno00001.nome + " pagará R$" +
                aluno00001.tirarCopias(500) + " pelas cópias tiradas.");

        Professor professor01 = new Professor("Ricardo Mathias", "111.222.333-44");
        professor01.disciplina = "Matemática";
        System.out.println(professor01.nome);
        System.out.println(professor01.cpf);
        System.out.println(professor01.disciplina);
    }
}