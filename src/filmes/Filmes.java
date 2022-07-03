/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package filmes;

import javax.swing.JOptionPane;
import java.sql.Connection;
import javax.swing.JFrame;
import jdbc.PostgreSqlConnection;
import telas.TelaInicial;

/**
 *
 * @author leonardo
 */
public class Filmes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        try {
//            JOptionPane.showMessageDialog(null, "Testando a conexão");
//            Connection con = new PostgreSqlConnection().conecta();
//            JOptionPane.showMessageDialog(null, "Está conectado");
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "Erro ao conectar " + e);
//        }
        
        JFrame frame = new TelaInicial();
        frame.setVisible(true);
    }
    
}
