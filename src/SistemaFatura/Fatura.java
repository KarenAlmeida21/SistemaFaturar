package SistemaFatura;

public class Fatura {
    private double valorFatura;
    private String DataVencimento;
    private Consumidor consumidor;

    public Fatura() {
    }

    public Fatura(double valor, int data, Consumidor consumidor) {
    }

    public Fatura(double valorFatura, String dataVencimento) {
        this.valorFatura = valorFatura;
        DataVencimento = dataVencimento;
    }

    public Fatura(double valorFatura, String dataVencimento, Consumidor consumidor) {
        this.valorFatura = valorFatura;
        DataVencimento = dataVencimento;
        this.consumidor = consumidor;
    }

    public double getValorFatura() {
        return valorFatura;
    }

    public void setValorFatura(double valorFatura) {
        this.valorFatura = valorFatura;
    }

    public String getDataVencimento() {
        return DataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        DataVencimento = dataVencimento;
    }

    public Consumidor getConsumidor() {
        return consumidor;
    }

    public void setConsumidor(Consumidor consumidor) {
        this.consumidor = consumidor;
    }

    @Override
    public String toString() {
        return "Fatura:" +
                "Valor da Fatura:" + valorFatura +
                "Data de Vencimento:" + DataVencimento +
                "Consumidor:" + consumidor;
    }
}
