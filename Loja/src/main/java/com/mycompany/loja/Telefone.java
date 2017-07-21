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
public class Telefone {

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
     * @return the DDD
     */
    public int getDDD() {
        return DDD;
    }

    /**
     * @param DDD the DDD to set
     */
    public void setDDD(int DDD) {
        this.DDD = DDD;
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }
     
    private String descricao;
    private int DDD;
    private int numero;
    
    
}
