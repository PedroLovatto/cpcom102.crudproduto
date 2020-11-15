/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import model.bean.Produto;
import model.dao.ProdutoDAO;

/**
 *
 * @author Pedro
 */
public class ProdutoController {
    
    public void create(String descricao, int quantidade, double preco){
        
        Produto produto = new Produto();
        ProdutoDAO produtoDAO = new ProdutoDAO();
        
        produto.setDescricao(descricao);
        produto.setQtd(quantidade);
        produto.setPreco(preco);
        
        produtoDAO.create(produto);
        
    }
    
    
    public ArrayList<Produto> read(){
        ProdutoDAO produtoDAO = new ProdutoDAO();
        return produtoDAO.read();
    }
    
    
    public void update(int idproduto, String descricao, int qtd, double preco){
        Produto produto = new Produto();
        
        produto.setIdProduto(idproduto);
        produto.setDescricao(descricao);
        produto.setQtd(qtd);
        produto.setPreco(preco);
        
        
        ProdutoDAO produtoDAO = new ProdutoDAO();
        produtoDAO.update(produto);
    }
    
    public void delete(int idproduto){
       Produto produto = new Produto();
       ProdutoDAO produtoDAO = new ProdutoDAO();
       
       produto.setIdProduto(idproduto);
       
       produtoDAO.delete(produto);
        
    }
    
    public ArrayList<Produto> getListaProdutosporDescricao(String descricao){
        ProdutoDAO produtoDAO = new ProdutoDAO();
        return produtoDAO.getListaProdutosporDescricao(descricao);
    }
    
    
    
    
    
    
}
