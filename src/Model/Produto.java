package Model;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Produto {
    private int pk_produto;
    private String cod_produto;
    private String nome;
    private String descricao;
    private int unidade;
    private double preco_unitario;
    private ArrayList<Pedido> pedidos;
}
