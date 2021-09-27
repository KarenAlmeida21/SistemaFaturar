package polimorfismo_24;

import java.util.ArrayList;
import java.util.List;

public class Turma {
private String nome;
private int qtde_alunos;


    public Turma(String nome, int qtde_alunos) {
        this.nome = nome;
        this.qtde_alunos = qtde_alunos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtde_alunos() {
        return qtde_alunos;
    }

    public void setQtde_alunos(int qtde_alunos) {
        this.qtde_alunos = qtde_alunos;
    }

    @Override
    public String toString() {
        return "Turma{" +
                "Nome ='" + getNome() + '\'' +
                " Quantidade de alunos ='" + getQtde_alunos() + '}';
    }
}


