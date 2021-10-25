package SistemaLoja;

public class Main {

    public static void main(String[] args) {
        // LISTA DE EXERCÍCIOS - CLASSES



        System.out.println("Fornecedor");
        Fornecedor roupa = new Fornecedor("Caio", "884744", "74645885", 1000, 600);
        System.out.println(roupa.getNome());
        System.out.println("Endereço: " + roupa.getEndereço());
        System.out.println("Telefone: " + roupa.getTelefone());
        System.out.println("Crédito: " + roupa.getValorCredito());
        System.out.println("Divida: " + roupa.getValorDivida());
        System.out.println("Saldo: " + roupa.obterSaldo());
        System.out.println("_______________________________________");
        System.out.println("Colaborador");
        Colaborador loja = new Colaborador("Joao", "hhswhdw", "48t9854", 60, 1500, 75);
        System.out.println(loja.getNome());
        System.out.println("Endereço: " + loja.getEndereço());
        System.out.println("Telefone: " + loja.getTelefone());
        loja.calcularSalario();
        System.out.println("Salario liquido do Colaborador: " + loja.calcularSalario());
        System.out.println("---------------------------------------------------------");
        System.out.println("Administrador");
        Administrador rh = new Administrador("Paul","rua hutoia","659863",54,3800,180,300);
        rh.setNome("Ana");
        System.out.println("Nome: " + rh.getNome());
        System.out.println("Endereço: " + rh.getEndereço());
        System.out.println("Telefone: " + rh.getTelefone());
        rh.setImposto(200);
        rh.calcularSalario();
        //double Salario_Liquido = rh.calcular_salario();
       // System.out.println(Salario_Liquido);
        System.out.println("Salario liquido do Administrador: " +rh.calcularSalario());


    }
}
