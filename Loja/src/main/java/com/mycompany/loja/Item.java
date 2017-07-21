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
public class Item {

    /**
     * @return the coditem
     */
    public int getCoditem() {
        return coditem;
    }

    /**
     * @param coditem the coditem to set
     */
    public void setCoditem(int coditem) {
        this.coditem = coditem;
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
     * @return the subtotal
     */
    public float getSubtotal() {
        return subtotal;
    }

    /**
     * @param subtotal the subtotal to set
     */
    public void setSubtotal(float subtotal) {
        this.subtotal = subtotal;
    }
    
    private int coditem;
    private int quantidade;
    private float subtotal;
    
    
}
