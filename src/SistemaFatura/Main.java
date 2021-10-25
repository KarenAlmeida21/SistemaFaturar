package SistemaFatura;



public class Main {
    public static void main(String[] args) throws Exception {
        //Faça um sistema responsável pelo cadastro de faturas de uma organização.
        // Toda fatura possui um consumidor, valor a ser pago e data de vencimento.
        //Entrega Mínima: O projeto permite cadastrar diversas faturas e consumidores no sistema.
        //Entrega média: O sistema não permite cadastrar consumidores com e-mail inválido (sem @) e
        // não permite cadastrar consumidores com e-mail repetido.
        //Entrega Máxima: O sistema permite pesquisar todas as faturas de um consumidor através de seu e-mail
        boolean continuar = true;
        while (continuar) {
            try{
                Sistema.execucao();
            } catch (Exception erro){
                System.out.println(erro.getMessage());
            }




        }
    }
}
