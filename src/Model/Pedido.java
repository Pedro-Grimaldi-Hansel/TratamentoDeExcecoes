package Model;

import java.util.ArrayList;

public class Pedido {
    private int pk_pedido;
    private String cod_pedido;
    private String descricao;
    private String data;
    private Cliente cliente;
    private ArrayList<Produto> produtos;

    public int getPk_pedido() {
        return pk_pedido;
    }

    public void setPk_pedido(int pk_pedido) {
        this.pk_pedido = pk_pedido;
    }

    public String getCod_pedido() {
        return cod_pedido;
    }

    public void setCod_pedido(String cod_pedido) {
        this.cod_pedido = cod_pedido;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }
}
