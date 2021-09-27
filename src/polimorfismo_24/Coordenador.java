package polimorfismo_24;


import java.util.*;

public class Coordenador extends Funcionarios {
    public List<Professor> professor_supervisionado;

    public Coordenador(String nome, String numero_registro, String orgao_lotacao, double salario, List <Professor> professor_supervisionado) {
        super(nome, numero_registro, orgao_lotacao, salario);
        this.professor_supervisionado=professor_supervisionado;
    }




    @Override
    public double aumenta_salario() {
        double novo_salario = getSalario() * 1.05;
        return novo_salario;
    }
    public void adicionar_professor(Professor novo_professor){

      this.professor_supervisionado.add(novo_professor);


    }


    public List<Professor> getProfessor_supervisionado() {
        return professor_supervisionado;
    }

    public void setProfessor_supervisionado(List<Professor> professor_supervisionado) {
        this.professor_supervisionado = professor_supervisionado;
    }
}



