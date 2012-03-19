/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fasa.vendas;

/**
 *
 * @author Hugo Santos
 */
public class ItenVenda {
    private int codigo;
    private Venda v = new Venda();
    private Produto p = new Produto();
    private int quantidade;
    private float valor_unitario;

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the v
     */
    public Venda getV() {
        return v;
    }

    /**
     * @param v the v to set
     */
    public void setV(Venda v) {
        this.v = v;
    }

    /**
     * @return the p
     */
    public Produto getP() {
        return p;
    }

    /**
     * @param p the p to set
     */
    public void setP(Produto p) {
        this.p = p;
    }

    /**
     * @return the quantidade
     */
    public int getQuantidade() {
        return quantidade;
    }

    /**
     * @param quantidade the quantidade to set
     */
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    /**
     * @return the valor_unitario
     */
    public float getValor_unitario() {
        return valor_unitario;
    }

    /**
     * @param valor_unitario the valor_unitario to set
     */
    public void setValor_unitario(float valor_unitario) {
        this.valor_unitario = valor_unitario;
    }
}
