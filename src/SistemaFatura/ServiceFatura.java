package SistemaFatura;

import SystemSale.*;

import java.util.ArrayList;
import java.util.List;

public class ServiceFatura {
    public static List<Fatura> listFatura = new ArrayList<>();

    public ServiceFatura() {
    }


    public void setListFatura(List<Fatura> listFatura) {
        this.listFatura = listFatura;
    }

    public List<Fatura> getListFatura() {
        return listFatura;
    }

    public static List<Fatura> pesquisarFatura(String email) {
        List<Fatura> faturasConsumidor = new ArrayList<>();
        for (Fatura faturaReferencia : listFatura) {
            if (faturaReferencia.getConsumidor().getEmail().equals(email)) {
                faturasConsumidor.add(faturaReferencia);
                System.out.println(faturaReferencia);
            }
        }
        return faturasConsumidor;
    }


    public static Fatura cadastrarFatura(double valorFatura, String dataDaCompra, String emailConsumidor)
            throws Exception {
        Consumidor consumidor = new Consumidor(emailConsumidor);
        Fatura fatura = new Fatura(valorFatura, dataDaCompra, consumidor);
        listFatura.add(fatura);
        return fatura;
    }

    public static void exibirFatura() {
        for (Fatura faturaReferencia : listFatura) {
            System.out.println(faturaReferencia);

        }
    }
}
