package SistemaFatura;

import SystemSale.ServiceVenda;
import SystemSale.ServiceVendedor;
import SystemSale.Venda;

import java.util.List;
import java.util.Scanner;

public class Sistema {
    public static Scanner obterDados(String mensagem) {
        System.out.println(mensagem);
        return new Scanner(System.in);
    }
    public static void menu(){
        System.out.println("Seu sistema de organização financeira");
        System.out.println("Cadastrar Consumidor");
        System.out.println("Exibir consumidores");
        System.out.println("Cadastrar fatura");
        System.out.println("Pesquisar fatura ");
        System.out.println("Exibir Fatura");

    }

    public static Consumidor cadastrarConsumidor() throws Exception {
        String nomeConsumidor = obterDados("Digite o nome do novo consumidor:").nextLine();
        String cpfConsumidor = obterDados("Digite o cpf do novo Consumidor").nextLine();
        String emailConsumidor = obterDados("Digite o e-mail do novo consumidor").nextLine();
        return ServiceConsumidor.cadastrarConsumidor(nomeConsumidor, cpfConsumidor,emailConsumidor);

    }

    public static Fatura cadastrarFatura() throws Exception {
        double valorCompra = obterDados("Digite o valor da compra").nextDouble();
        String dataFatura = obterDados("Digite a data de vencimento da fatura:").nextLine();
        String emailConsumidor = obterDados("Digite o email do consumidor").nextLine();
        return ServiceFatura.cadastrarFatura(valorCompra, dataFatura, emailConsumidor);
    }
    public static List<Fatura> pesquisarFatura() throws Exception {
        String email = obterDados("Digite o email do consumidor que deseja pesquisar:").nextLine();
        List<Fatura> faturaList = ServiceFatura.pesquisarFatura(email);
        return faturaList;
    }

    public static void execucao() throws Exception {
        boolean loop = true;
        menu();
        String opcaoMenu = obterDados("Digite sua opção:").nextLine();

        while (loop) {

            if (opcaoMenu.equalsIgnoreCase("cadastrar consumidor")) {
                cadastrarConsumidor();
                break;
            }if(opcaoMenu.equalsIgnoreCase("exibir consumidores")){
                ServiceConsumidor.exibirConsumidores();
                break;
            }
            if (opcaoMenu.equalsIgnoreCase("cadastrar fatura")) {
                cadastrarFatura();
                break;
            } else if (opcaoMenu.equalsIgnoreCase("exibir fatura")) {
                ServiceFatura.exibirFatura();
                break;
            }else if(opcaoMenu.equalsIgnoreCase("pesquisar fatura")){
                pesquisarFatura();
                break;
            }
        }

    }
}
