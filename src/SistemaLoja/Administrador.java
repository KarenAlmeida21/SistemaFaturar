package SistemaLoja;

public class Administrador extends Colaborador{
    ////Implemente a classe Administrador como subclasse da classe Colaborador.
    //        // ]Um determinado administrador tem como atributos, para além dos atributos
    //        // da classe Pessoa e da classe Colaborador, o atributo ajudaDeCusto (double).
    //        // Note que deverá redefinir na classe Administrador o método herdado calcularSalario
    //        // (o salário de um administrador é equivalente ao salário de um empregado
    //        // usual acrescido das ajuda de custo).
    //        //Escreva um programa de teste adequado para esta classe.
    private double ajudaCusto;

    public Administrador(String nome, String endereço, String telefone, int codigo_setor, double salario_base, double imposto, double ajuda_custo) {
        super(nome, endereço, telefone, codigo_setor, salario_base, imposto);
        this.ajudaCusto = ajudaCusto;
    }

    public double getAjudaCusto() {
        return ajudaCusto;
    }

    public void setAjudaCusto(double ajudaCusto) {
        this.ajudaCusto = ajudaCusto;
    }

    @Override
    public double calcularSalario() {
        double salarioLiquido= (this.getSalarioBase() - this.getImposto() ) + this.ajudaCusto;
        return salarioLiquido;
    }
}
