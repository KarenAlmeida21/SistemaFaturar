package SistemaFatura;

public class Consumidor {
    private String nome;
    private String cpf;
    private String email;

    public Consumidor(String cpfConsumidor) {
    }

    public Consumidor(String nome, String cpf, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Consumidor{" +
                "Nome:" + nome +
                "Cpf:" + cpf +
                "E-mail:" + email;
    }
}
