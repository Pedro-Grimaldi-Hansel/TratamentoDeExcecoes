package Model;

import java.util.ArrayList;

public class Pedido {
    private int pk_pedido;
    private String cod_pedido;
    private String descricao;
    private String data;
    private Cliente cliente;
    private ArrayList<Produto> produtos;
}
