package Model;

import java.util.ArrayList;

public class Cliente {
    private int pk_cliente;
    private String cod_cliente;
    private String nome;
    private String end_rua;
    private int end_numero;
    private String end_complemento;
    private String end_bairro;
    private String end_cidade;
    private ArrayList<Pedido> pedidos;
}
