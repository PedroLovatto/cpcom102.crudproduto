/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;
import java.sql.Connection;
/**
 *
 * @author Pedro
 */
public class TesteConexao {
    
    public static void main(String[] args) {
        Connection con = ConnectionFactory.getConnection();
        
        if (con != null){
            System.out.println("Conectado com sucesso!");
        }System.out.println("Comentario realizado no repositorio remoto");
    }
    
}
