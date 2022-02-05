public class Pessoa {
    // Atributos
    public String nome;
    public String cpf;

    // Construtor
    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    // Método
    public double tirarCopias(int quantidade) {
        return 0.10 * (double) quantidade;
    }
}

// Subclasse Aluno
class Aluno extends Pessoa {
    public Aluno(String nome, String cpf) {
        super(nome, cpf);
    }
    public String matricula; // Atributo exclusivo que não consta na superclasse

    // Método sobrescrito na subclasse
    public double tirarCopias(int quantidade) {
        return 0.07 * (double) quantidade;
    }
}

// Subclasse Professor
class Professor extends Pessoa {
    public Professor(String nome, String cpf) {
        super(nome, cpf);
    }
    public double salario; // Atributo exclusivo que não consta na superclasse
    public String disciplina; // Atributo exclusivo que não consta na superclasse
}

// Subclasse Funcionário
class Funcionario extends Pessoa {
    public Funcionario(String nome, String cpf) {
        super(nome, cpf);
    }
    public double salario; // Atributo exclusivo que não consta na superclasse
    public String cargo; // Atributo exclusivo que não consta na superclasse
}