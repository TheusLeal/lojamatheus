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
public class Venda {

    /**
     * @return the codvenda
     */
    public int getCodvenda() {
        return codvenda;
    }

    /**
     * @param codvenda the codvenda to set
     */
    public void setCodvenda(int codvenda) {
        this.codvenda = codvenda;
    }

    /**
     * @return the Numero_da_nota_fiscal
     */
    public int getNumero_da_nota_fiscal() {
        return Numero_da_nota_fiscal;
    }

    /**
     * @param Numero_da_nota_fiscal the Numero_da_nota_fiscal to set
     */
    public void setNumero_da_nota_fiscal(int Numero_da_nota_fiscal) {
        this.Numero_da_nota_fiscal = Numero_da_nota_fiscal;
    }

    /**
     * @return the Total
     */
    public int getTotal() {
        return Total;
    }

    /**
     * @param Total the Total to set
     */
    public void setTotal(int Total) {
        this.Total = Total;
    }
    
    private int codvenda;
    private int Numero_da_nota_fiscal;
    private int Total;
    
    
}
