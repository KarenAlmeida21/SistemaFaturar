package polimorfismo_24;

import java.util.ArrayList;
import java.util.List;

public class Professor extends Funcionarios {
    ////Os professores possuem os atributos: Nível de graduação, disciplina
    //    //ministrada , quantidade de alunos e quantidade de turmas.
    private String nivel_graduacao;
    private String disciplina;
    private int qtde_alunos;
    private int qtde_turmas;
    public List<Turma> turma = new ArrayList<>();



    public Professor(String nome, String numero_registro, String orgao_lotacao, double salario, String nivel_graduacao, String disciplina, int qtde_alunos, int qtde_turmas) {
        super(nome, numero_registro, orgao_lotacao, salario);
        this.nivel_graduacao = nivel_graduacao;
        this.disciplina = disciplina;
        this.qtde_alunos = qtde_alunos;
        this.qtde_turmas = qtde_turmas;


    }

    @Override
    public String toString() {
        return "Professor{" +
                "nivel_graduacao='" + nivel_graduacao + '\'' +
                ", disciplina='" + disciplina + '\'' +
                ", qtde_alunos=" + qtde_alunos +
                '}';
    }

    public void setNivel_graduacao(String nivel_graduacao) {
        this.nivel_graduacao = nivel_graduacao;
    }

    public String getNivel_graduacao() {

        return nivel_graduacao;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public int getQtde_alunos() {
        return qtde_alunos;
    }

    public void setQtde_alunos(int qtde_alunos) {
        this.qtde_alunos = qtde_alunos;
    }

    public int getQtde_turmas() {
        return qtde_turmas;
    }

    public void setQtde_turmas(int qtde_turmas) {
        this.qtde_turmas = qtde_turmas;
    }


    public void adiciona_turma(Turma turmaAdicionada) {
        this.turma.add(turmaAdicionada);
    }

}
