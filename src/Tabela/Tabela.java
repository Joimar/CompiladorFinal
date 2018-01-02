/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tabela;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import model.Token;

/**
 *
 * @author Joimar
 */
public class Tabela 
{
     private HashMap map;
     private Hashtable tabela;
    public Tabela()
    {
        
        map = new HashMap();
        tabela = new Hashtable();
    }
    
    
   
    
    
    
    public void Add(int chave,Hash valor)
    {
    
        tabela.put(valor, chave); 
    
    }
    
    
    
    public void delete(int chave)
    {
    
        tabela.remove(chave); 
    }
    
    public void delete(int chave, Hash valor)
    {
    
        tabela.remove(chave, valor);
        
    }
}
