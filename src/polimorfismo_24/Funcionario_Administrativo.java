package polimorfismo_24;

public class Funcionario_Administrativo extends Funcionarios{
    private String funcao_adm;
    private String senioridade;

    public Funcionario_Administrativo(String nome, String numero_registro, String orgao_lotacao, double salario, String funcao_adm, String senioridade) {
        super(nome, numero_registro, orgao_lotacao, salario);

        this.funcao_adm = funcao_adm;
        this.senioridade = senioridade;
    }

    public String getFuncao_adm() {
        return funcao_adm;
    }

    public void setFuncao_adm(String funcao_adm) {
        this.funcao_adm = funcao_adm;
    }

    public String getSenioridade() {
        return senioridade;
    }

    public void setSenioridade(String senioridade) {
        this.senioridade = senioridade;
    }
}
