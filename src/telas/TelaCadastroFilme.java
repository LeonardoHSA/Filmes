/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

import DAO.FilmeDAO;
import java.util.List;
import javaBeans.Filme;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author leonardo
 */
public class TelaCadastroFilme extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastroFilme
     */
    
    // listar
    public void listar(){
        try {
            // executando o select
        FilmeDAO dao = new FilmeDAO();
        List<Filme> listFilme = dao.listaFilmes();
        
        // colocando os dados na tabela
        DefaultTableModel model = (DefaultTableModel) tabelaFimes.getModel();
        model.setRowCount(0);
        
        for(Filme f : listFilme){
            model.addRow(new Object[]{
               f.getIdFilme(),
               f.getNome(),
               f.getGenero(),
               f.getDirecao(),
               f.getAno(),
               f.getStreamer()
            });
        }
        } catch (Exception e) {
        }
    }
    
    public TelaCadastroFilme() {
        super("Tela de cadastro");
        initComponents();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(850, 500);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nomeTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        generoTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        anoTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        direcaoTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        streamerTextField = new javax.swing.JTextField();
        botaoVoltar = new javax.swing.JButton();
        botaoCadastrar = new javax.swing.JButton();
        botaoAlterar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaFimes = new javax.swing.JTable();
        botaoDeletar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        idTextField = new javax.swing.JTextField();
        botaoLimpar = new javax.swing.JButton();
        botaoAtencao = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Ubuntu Mono", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastro de filmes");

        jLabel2.setText("Nome: ");

        nomeTextField.setSelectionColor(new java.awt.Color(204, 204, 204));

        jLabel3.setText("Genero: ");

        jLabel4.setText("Ano: ");

        jLabel5.setText("Direção: ");

        jLabel6.setText("Streamer:");

        botaoVoltar.setBackground(new java.awt.Color(204, 204, 204));
        botaoVoltar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        botaoVoltar.setText("Voltar");
        botaoVoltar.setContentAreaFilled(false);
        botaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarActionPerformed(evt);
            }
        });

        botaoCadastrar.setBackground(new java.awt.Color(0, 153, 51));
        botaoCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        botaoCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        botaoCadastrar.setText("Cadastrar");
        botaoCadastrar.setBorderPainted(false);
        botaoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarActionPerformed(evt);
            }
        });

        botaoAlterar.setBackground(new java.awt.Color(51, 102, 255));
        botaoAlterar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        botaoAlterar.setForeground(new java.awt.Color(255, 255, 255));
        botaoAlterar.setText("Alterar");
        botaoAlterar.setBorderPainted(false);
        botaoAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAlterarActionPerformed(evt);
            }
        });

        tabelaFimes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Filme", "Nome", "Genero", "Direção", "Ano", "Streamer"
            }
        ));
        tabelaFimes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaFimesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaFimes);

        botaoDeletar.setBackground(new java.awt.Color(255, 51, 51));
        botaoDeletar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        botaoDeletar.setForeground(new java.awt.Color(255, 255, 255));
        botaoDeletar.setText("Deletar");
        botaoDeletar.setBorderPainted(false);
        botaoDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoDeletarActionPerformed(evt);
            }
        });

        jLabel7.setText("ID: ");

        botaoLimpar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        botaoLimpar.setText("Limpar");
        botaoLimpar.setContentAreaFilled(false);
        botaoLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLimparActionPerformed(evt);
            }
        });

        botaoAtencao.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        botaoAtencao.setForeground(new java.awt.Color(51, 102, 255));
        botaoAtencao.setText("?");
        botaoAtencao.setContentAreaFilled(false);
        botaoAtencao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAtencaoActionPerformed(evt);
            }
        });

        jCheckBox1.setText("Já assistiu ?");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 826, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(botaoVoltar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botaoLimpar)
                        .addGap(18, 18, 18)
                        .addComponent(botaoDeletar)
                        .addGap(18, 18, 18)
                        .addComponent(botaoAlterar)
                        .addGap(18, 18, 18)
                        .addComponent(botaoCadastrar))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(direcaoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(generoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(anoTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(idTextField))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(botaoAtencao)
                                    .addComponent(jCheckBox1))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(nomeTextField)
                            .addComponent(streamerTextField))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nomeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(generoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(anoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(direcaoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoAtencao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(streamerTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoVoltar)
                    .addComponent(botaoCadastrar)
                    .addComponent(botaoAlterar)
                    .addComponent(botaoDeletar)
                    .addComponent(botaoLimpar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarActionPerformed
        JFrame frame = new TelaFilmes();
        frame.setVisible(true);
        dispose();
    }//GEN-LAST:event_botaoVoltarActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        listar();
    }//GEN-LAST:event_formWindowActivated

    private void botaoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarActionPerformed
        
        try {
            Filme obj = new Filme();
            obj.setNome(nomeTextField.getText());
            obj.setGenero(generoTextField.getText());
            obj.setDirecao(direcaoTextField.getText());
            obj.setAno(Integer.parseInt(anoTextField.getText()));
            obj.setStreamer(streamerTextField.getText());
            
            FilmeDAO dao = new FilmeDAO();
            dao.cadastraFilme(obj);
            
            JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!!!");
            
        } catch (Exception erroSql) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar: " + erroSql);
        }
    }//GEN-LAST:event_botaoCadastrarActionPerformed

    private void tabelaFimesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaFimesMouseClicked
        idTextField.setText(tabelaFimes.getValueAt(tabelaFimes.getSelectedRow(), 0).toString());
        nomeTextField.setText(tabelaFimes.getValueAt(tabelaFimes.getSelectedRow(), 1).toString());
        generoTextField.setText(tabelaFimes.getValueAt(tabelaFimes.getSelectedRow(), 2).toString());
        direcaoTextField.setText(tabelaFimes.getValueAt(tabelaFimes.getSelectedRow(), 3).toString());
        anoTextField.setText(tabelaFimes.getValueAt(tabelaFimes.getSelectedRow(), 4).toString());
        streamerTextField.setText(tabelaFimes.getValueAt(tabelaFimes.getSelectedRow(), 5).toString());
    }//GEN-LAST:event_tabelaFimesMouseClicked

    private void botaoLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLimparActionPerformed
        idTextField.setText("");
        nomeTextField.setText("");
        generoTextField.setText("");
        direcaoTextField.setText("");
        anoTextField.setText("");
        streamerTextField.setText("");
    }//GEN-LAST:event_botaoLimparActionPerformed

    private void botaoDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoDeletarActionPerformed
        
        try {
            Filme obj = new Filme();
            obj.setIdFilme(Integer.parseInt(idTextField.getText()));
            
            FilmeDAO dao = new FilmeDAO();
            dao.deletaFilme(obj);
            
            JOptionPane.showMessageDialog(null, "Filme deletado com sucesso!!!");
            
        } catch (Exception erroSql) {
            JOptionPane.showMessageDialog(null, "Erro ao deletar: " + erroSql);
        }
    }//GEN-LAST:event_botaoDeletarActionPerformed

    private void botaoAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAlterarActionPerformed
        
        try {
            Filme obj = new Filme();
            obj.setIdFilme(Integer.parseInt(idTextField.getText()));
            obj.setNome(nomeTextField.getText());
            obj.setGenero(generoTextField.getText());
            obj.setDirecao(direcaoTextField.getText());
            obj.setAno(Integer.parseInt(anoTextField.getText()));
            obj.setStreamer(streamerTextField.getText());
            
            FilmeDAO dao = new FilmeDAO();
            dao.alterarFilme(obj);
            
            JOptionPane.showMessageDialog(null, "Dados alterados com sucesso!!!");
        } catch (Exception erroSql) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar !!!" + erroSql);
        }
    }//GEN-LAST:event_botaoAlterarActionPerformed

    private void botaoAtencaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAtencaoActionPerformed
        
        JOptionPane.showMessageDialog(null, "Para cadastrar não é necessário prencher o campo 'ID'.");
    }//GEN-LAST:event_botaoAtencaoActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroFilme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroFilme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroFilme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroFilme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroFilme().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField anoTextField;
    private javax.swing.JButton botaoAlterar;
    private javax.swing.JButton botaoAtencao;
    private javax.swing.JButton botaoCadastrar;
    private javax.swing.JButton botaoDeletar;
    private javax.swing.JButton botaoLimpar;
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JTextField direcaoTextField;
    private javax.swing.JTextField generoTextField;
    private javax.swing.JTextField idTextField;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nomeTextField;
    private javax.swing.JTextField streamerTextField;
    private javax.swing.JTable tabelaFimes;
    // End of variables declaration//GEN-END:variables
}
