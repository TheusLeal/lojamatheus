/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.loja;

/**
 *
 * @author aluno
 */
public class Produto {

    /**
     * @return the cod_prod
     */
    public int getCod_prod() {
        return cod_prod;
    }

    /**
     * @param cod_prod the cod_prod to set
     */
    public void setCod_prod(int cod_prod) {
        this.cod_prod = cod_prod;
    }

    /**
     * @return the estoque
     */
    public int getEstoque() {
        return estoque;
    }

    /**
     * @param estoque the estoque to set
     */
    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    /**
     * @return the valor_unitário
     */
    public float getValor_unitário() {
        return valor_unitário;
    }

    /**
     * @param valor_unitário the valor_unitário to set
     */
    public void setValor_unitário(float valor_unitário) {
        this.valor_unitário = valor_unitário;
    }

    /**
     * @return the cod_barra
     */
    public int getCod_barra() {
        return cod_barra;
    }

    /**
     * @param cod_barra the cod_barra to set
     */
    public void setCod_barra(int cod_barra) {
        this.cod_barra = cod_barra;
    }

    /**
     * @return the nome
     */
    public char getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(char nome) {
        this.nome = nome;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the marca
     */
    public char getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(char marca) {
        this.marca = marca;
    }

    /**
     * @return the preco
     */
    public float getPreco() {
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(float preco) {
        this.preco = preco;
    }
    
    private int cod_prod;
    private int estoque;
    private float valor_unitário;
    private int cod_barra;
    private char nome;
    private String descricao;
    private char marca;
    private float preco;
    
    
    
}
