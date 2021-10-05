package SistemaLoja;

public class Fornecedor extends Pessoa {
    // //Considere, como subclasse da classe Pessoa
    //        //(desenvolvida no item anterior) a classe Fornecedor.
    //        // Considere que cada instância da classe Fornecedor tem,
    //        // para além dos atributos que caracterizam a classe Pessoa,
    //        // os atributos valorCredito
    //        // (correspondente ao crédito máximo atribuído ao fornecedor)
    //        // e valorDivida (montante da dívida para com o fornecedor).
    //        //Implemente na classe Fornecedor, para além dos usuais métodos seletores
    //        // e modificadores, um método obterSaldo() que devolve a diferença entre os
    //        // valores dos atributos valorCredito e valorDivida.
    //        //Depois de implementada a classe Fornecedor,
    //        // crie um programa de teste adequado que lhe permita verificar o funcionamento
    //        // dos métodos implementados na classe Fornecedor e os herdados da classe Pessoa.
    private double valorCredito;
    private double valorDivida;


    public void setValorCredito(double valorCredito) {
        this.valorCredito = valorCredito;
    }

    public double getValorCredito() {
        return valorCredito;
    }

    public void setValorDivida(double valor_divida) {
        this.valorDivida = valor_divida;
    }

    public double getValor_divida() {
        return valorDivida;
    }

    public Fornecedor(String nome, String endereço, String telefone, double valor_credito, double valor_divida) {
        super(nome, endereço, telefone);
        this.valorCredito = valor_credito;
        this.valorDivida = valor_divida;
    }

    public double obter_saldo  (){
        double saldo= valorCredito - valorDivida;
        return saldo;
    }
}
