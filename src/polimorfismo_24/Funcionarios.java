package polimorfismo_24;

public class Funcionarios {
    //Modele as classes referentes aos funcionários de uma
    //universidade, que serão os professores, coordenadores e funcionários administrativos.
    // Os atributos comuns de todos os funcionários são:
    // Nome, CPF, número de registro, órgão de lotação e salário.
    //Os professores possuem os atributos: Nível de graduação, disciplina
    //ministrada , quantidade de alunos e quantidade de turmas.
    // Os coordenadores possuem os atributos: ProfessoresSupervisionados
    //  Os funcionários administrativos possuem os atributos: Função Administrativa e Senioridade.
    // Implemente, além dos getters e setters e os construtores, os seguintes métodos:
    // aumentoSalario: para todos menos os coordenadores aumenta o salário em
    //10% e para os coordenadores o aumento é de 5%.
    // adicionaTurma: para os professores.
    // ze4xcwdqasa      'adicionaProfessor (para os coordenadores): Para adicionar um professor na lista de professores supervisionados
private String nome;
private String numero_registro;
private String orgao_lotacao;
private double salario;

    public Funcionarios(String nome, String numero_registro, String orgao_lotacao, double salario) {
        this.nome = nome;
        this.numero_registro = numero_registro;
        this.orgao_lotacao = orgao_lotacao;
        this.salario = salario;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumero_registro() {
        return numero_registro;
    }

    public void setNumero_registro(String numero_registro) {
        this.numero_registro = numero_registro;
    }

    public String getOrgao_lotacao() {
        return orgao_lotacao;
    }

    public void setOrgao_lotacao(String orgao_lotacao) {
        this.orgao_lotacao = orgao_lotacao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    // Implemente, além dos getters e setters e os construtores, os seguintes métodos:
    // aumentoSalario: para todos menos os coordenadores aumenta o salário em
    //10% e para os coordenadores o aumento é de 5%.

    public double aumenta_salario() {
        double novo_salario= salario *1.1;
        return novo_salario;

    }
}
