/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

import javax.swing.JFrame;

/**
 *
 * @author leonardo
 */
public class TelaSeries extends javax.swing.JFrame {

    /**
     * Creates new form TelaFilmes
     */
    public TelaSeries() {
        super("Séries");
        initComponents();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 400);
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
        botaoCadastro = new javax.swing.JButton();
        botaoPesquisa = new javax.swing.JButton();
        botaoVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Ubuntu Mono", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Séries");

        botaoCadastro.setBackground(new java.awt.Color(51, 102, 255));
        botaoCadastro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        botaoCadastro.setForeground(new java.awt.Color(255, 255, 255));
        botaoCadastro.setText("Cadastro");
        botaoCadastro.setBorderPainted(false);
        botaoCadastro.setPreferredSize(new java.awt.Dimension(200, 25));
        botaoCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastroActionPerformed(evt);
            }
        });

        botaoPesquisa.setBackground(new java.awt.Color(0, 153, 51));
        botaoPesquisa.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        botaoPesquisa.setForeground(new java.awt.Color(255, 255, 255));
        botaoPesquisa.setText("Pesquisa");
        botaoPesquisa.setPreferredSize(new java.awt.Dimension(200, 25));
        botaoPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPesquisaActionPerformed(evt);
            }
        });

        botaoVoltar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        botaoVoltar.setText("Voltar");
        botaoVoltar.setContentAreaFilled(false);
        botaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botaoVoltar)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 153, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botaoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(141, 141, 141))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(63, 63, 63)
                .addComponent(botaoCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(botaoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 140, Short.MAX_VALUE)
                .addComponent(botaoVoltar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarActionPerformed
        JFrame frame = new TelaInicial();
        frame.setVisible(true);
        dispose();
    }//GEN-LAST:event_botaoVoltarActionPerformed

    private void botaoCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastroActionPerformed
        JFrame frame = new TelaCadastroSeries();
        frame.setVisible(true);
        dispose();
    }//GEN-LAST:event_botaoCadastroActionPerformed

    private void botaoPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPesquisaActionPerformed
        JFrame frame = new TelaPesquisaSeries();
        frame.setVisible(true);
        dispose();
    }//GEN-LAST:event_botaoPesquisaActionPerformed

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
            java.util.logging.Logger.getLogger(TelaSeries.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaSeries.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaSeries.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaSeries.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaSeries().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCadastro;
    private javax.swing.JButton botaoPesquisa;
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
