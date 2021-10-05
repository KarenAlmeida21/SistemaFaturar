package SistemaLoja;

public class Colaborador extends Pessoa{
    //
    //Considere, como outra subclasse da classe Pessoa, a classe Colaborador. Considere
    // que cada instância da classe Colaborador tem, para além dos atributos que caracterizam
    // a classe Pessoa, os atributos codigoSetor (inteiro), salarioBase (double) e imposto (double).
    //Implemente a classe Colaborador com métodos seletores e modificadores e um
    // método calcularSalario.
    //Escreva um programa de teste adequado para a classe Colaborador .

    private int codigoSetor;
    private double salarioBase;
    private double imposto;

    public Colaborador(String nome, String endereço, String telefone, int codigoSetor, double salarioBase, double imposto) {
        super(nome, endereço, telefone);
        this.codigoSetor = codigoSetor;
        this.salarioBase=salarioBase;
        this.imposto=imposto;

    }

    public int getCodigoSetor() {
        return codigoSetor;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase= salarioBase;
    }

    public void setCodigo_setor(int codigoSetor) {
        this.codigoSetor= codigoSetor;
    }


    public double calcularSalario(){
     double salarioLiquido =   salarioBase-imposto;
     return salarioLiquido;
    }

}
