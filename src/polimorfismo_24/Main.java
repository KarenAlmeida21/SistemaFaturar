package polimorfismo_24;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Funcionarios funcionario = new Funcionarios("ana", "876", "prefeitura", 3000);
        funcionario.aumenta_salario();
        // System.out.println(funcionario.aumenta_salario());

        //instanciando turmas
        Turma turma1 = new Turma("azul",20);



        Professor professor = new Professor("Paul", "90", "89", 3000, "especialista", "Geografia", 50,1);
        professor.aumenta_salario();
        System.out.println("Novo salário do professor: " + professor.aumenta_salario());

        //testando método adiciona turma
        Professor professora = new Professor("ana", "90", "98", 3000, "especilista", "ciencias", 90,1);
        System.out.println(professora);
        professora.adiciona_turma(turma1);
        System.out.println(professora.turma.toString());



        //instanciando coordenador e exibindo lista
        List<Professor> professorList = new ArrayList<>();
        Coordenador coordenador = new Coordenador("carlos", "89", "98", 3000, professorList);
        coordenador.adicionar_professor(professora);
        System.out.println(coordenador.getNome());
        System.out.println(coordenador.getProfessor_supervisionado().toString());


    }
}
