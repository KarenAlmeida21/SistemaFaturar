package SistemaFatura;

import java.util.ArrayList;
import java.util.List;

public class ServiceConsumidor {

    public static List<Consumidor> listConsumidor = new ArrayList<>();

    public ServiceConsumidor() {
    }

    public static List<Consumidor> getListConsumidor() {
        return listConsumidor;
    }

    public static void setListConsumidor(List<Consumidor> listConsumidor) {
        ServiceConsumidor.listConsumidor = listConsumidor;
    }

    public static void validarArroba(String email) throws Exception {
        if (!email.contains("@")) {
            throw new Exception("Verifique o e-mail e digite novamente");
        }
    }

    public static void verificarConsumidorRepetido(String emailConsumidor) throws Exception {
        for (Consumidor consumidor : listConsumidor) {
            if (consumidor.getEmail().equalsIgnoreCase(emailConsumidor)) {
                throw new Exception("E-mail já cadastrado.Verifique");
            }
        }
    }

    public static Consumidor cadastrarConsumidor(String nome, String cpf, String email) throws Exception {
        verificarConsumidorRepetido(email);
        validarArroba(email);
        Consumidor consumidor = new Consumidor(nome, cpf, email);
        listConsumidor.add(consumidor);
        return consumidor;

    }

    public static void exibirConsumidores() {
        for (Consumidor consumidor : listConsumidor) {
            System.out.println(consumidor);
        }
    }

}
