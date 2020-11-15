/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import connection.ConnectionFactory;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.bean.Produto;

/**
 *
 * @author Pedro
 */
public class ProdutoDAO1 {
     public void create() {

        Connection con = ConnectionFactory.getConnection();
        Statement stmt = null;
        try {
          
            String sql1= "INSERT INTO produto (descricao, qtd, preco) VALUES ('teste11', 15, 5.55)";
            String sql2= "INSERT INTO produto (descricao, qtd, preco) VALUES ('teste22', 25, 5.55)";
            String sql3= "INSERT INTO produto (descricao, qtd, preco) VALUES ('teste33', 35, 5.55)";
            
            con.setAutoCommit(false); //parar o auto commit
            
            
           stmt = con.createStatement();
          
            stmt.execute(sql1);
            stmt.executeUpdate(sql2); 
             if(true){
                throw new SQLException();
            }
            stmt.executeUpdate(sql3);
            
            con.commit();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar: " + ex);
            try {
                con.rollback();
            } catch (SQLException ex1) {
                Logger.getLogger(ProdutoDAO1.class.getName()).log(Level.SEVERE, null, ex1);
            }

        } finally {
            ConnectionFactory.closeConnection(con);
        }

    }

}
