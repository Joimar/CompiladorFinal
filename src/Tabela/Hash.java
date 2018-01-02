/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tabela;

import model.Token;

/**
 *
 * @author Joimar
 */
public class Hash 
{
    
    private int chave;
    private Token valor;
    
    
    public Hash(int chave, Token valor) 
    {
        this.chave = chave;
        this.valor = valor;
    }
    
    public void setChave(int chave)
    {
    
        this.chave = chave;
    }
    
    public void setValor(Token valor)
    {
    
        this.valor = valor;
    
    }
    
    public int getChave()
    {
    
        return chave;
    }
    
    public Token getValor()
    {
    
        return valor;
    }
    
}
