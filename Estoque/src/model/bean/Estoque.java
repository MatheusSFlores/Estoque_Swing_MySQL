package model.bean;



/**
 *
 * @author mathe
 */
public class Estoque {

    private int id;
    private String produto;
    private String descricao;
    private int quantidade;
    private double valor;
    private int mercado_id;

    public int getMercado_id() {
        return mercado_id;
    }

    public void setMercado_id(int mercado_id) {
        this.mercado_id = mercado_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
}
