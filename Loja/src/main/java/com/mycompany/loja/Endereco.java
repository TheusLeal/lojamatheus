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
public class Endereco {

    /**
     * @return the tipo_de_logradouro
     */
    public String getTipo_de_logradouro() {
        return tipo_de_logradouro;
    }

    /**
     * @param tipo_de_logradouro the tipo_de_logradouro to set
     */
    public void setTipo_de_logradouro(String tipo_de_logradouro) {
        this.tipo_de_logradouro = tipo_de_logradouro;
    }

    /**
     * @return the logradouro
     */
    public String getLogradouro() {
        return logradouro;
    }

    /**
     * @param logradouro the logradouro to set
     */
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
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

    /**
     * @return the complemento
     */
    public char getComplemento() {
        return complemento;
    }

    /**
     * @param complemento the complemento to set
     */
    public void setComplemento(char complemento) {
        this.complemento = complemento;
    }

    /**
     * @return the bairro
     */
    public char getBairro() {
        return bairro;
    }

    /**
     * @param bairro the bairro to set
     */
    public void setBairro(char bairro) {
        this.bairro = bairro;
    }

    /**
     * @return the cidade
     */
    public char getCidade() {
        return cidade;
    }

    /**
     * @param cidade the cidade to set
     */
    public void setCidade(char cidade) {
        this.cidade = cidade;
    }

    /**
     * @return the UF
     */
    public String getUF() {
        return UF;
    }

    /**
     * @param UF the UF to set
     */
    public void setUF(String UF) {
        this.UF = UF;
    }

    /**
     * @return the CEP
     */
    public int getCEP() {
        return CEP;
    }

    /**
     * @param CEP the CEP to set
     */
    public void setCEP(int CEP) {
        this.CEP = CEP;
    }

    /**
     * @return the pais
     */
    public char getPais() {
        return pais;
    }

    /**
     * @param pais the pais to set
     */
    public void setPais(char pais) {
        this.pais = pais;
    }
    
    private String tipo_de_logradouro;
    private String logradouro;
    private int numero;
    private char complemento;
    private char bairro;
    private char cidade;
    private String UF;
    private int CEP;
    private char pais;
    
    
    
}
