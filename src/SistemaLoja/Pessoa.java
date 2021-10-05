package SistemaLoja;

public class Pessoa {
    // //Crie uma Classe Pessoa, contendo os atributos encapsulados,
    //        // com seus respectivos seletores (getters) e modificadores (setters).
    //        // Atributos: String nome; String endereco; String telefone;
    private String nome;
    private String endereço;
    private String telefone;

    public Pessoa(String nome, String endereço, String telefone) {
        this.nome = nome;
        this.endereço=endereço;
        this.telefone=telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereço(){
        return endereço;
    }
    public void setEndereço(String endereço ){
        this.endereço=endereço;
    }
    public  String getTelefone(){
        return telefone;
    }
    public void setTelefone(String endereço){
        this.endereço=endereço;
    }


}
