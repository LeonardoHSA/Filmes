/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

import DAO.SerieDAO;
import java.awt.event.KeyEvent;
import java.util.List;
import javaBeans.Serie;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Leonardo
 */
public class TelaPesquisaSeries extends javax.swing.JFrame {
    
    
    
    /**
     * Creates new form TelaPesquisaFilmes
     */
    public TelaPesquisaSeries() {
        super("Tela de pesquisa");
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

        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaSeries = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        textFieldPesquisaPorNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        textFieldPesquisaDecada = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        textFieldPesquisaAleatorio = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        textFieldPesquisaPorGenero = new javax.swing.JTextField();
        botaoLimpar = new javax.swing.JButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel3.setText("jLabel3");

        jButton2.setText("Pesquisar");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tabelaSeries.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Filme", "Nome", "Genero", "Direção", "Ano Lançamento", "Temporadas", "Streamer"
            }
        ));
        jScrollPane1.setViewportView(tabelaSeries);

        jLabel1.setText("Pesquisa por nome: ");

        textFieldPesquisaPorNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textFieldPesquisaPorNomeKeyPressed(evt);
            }
        });

        jLabel2.setText("Pesquisa por década: ");

        textFieldPesquisaDecada.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textFieldPesquisaDecadaKeyPressed(evt);
            }
        });

        jLabel4.setText("Pesquisa aleatória por grupo: ");

        textFieldPesquisaAleatorio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textFieldPesquisaAleatorioKeyPressed(evt);
            }
        });

        jLabel5.setText("Pesquisa por gênero:");

        textFieldPesquisaPorGenero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textFieldPesquisaPorGeneroKeyPressed(evt);
            }
        });

        botaoLimpar.setText("Limpar");
        botaoLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jButton1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(textFieldPesquisaDecada, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textFieldPesquisaAleatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textFieldPesquisaPorGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(textFieldPesquisaPorNome)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(botaoLimpar))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 813, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(textFieldPesquisaPorNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textFieldPesquisaDecada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(textFieldPesquisaAleatorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(textFieldPesquisaPorGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 369, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(botaoLimpar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFrame frame = new TelaSeries();
        frame.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void textFieldPesquisaPorNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldPesquisaPorNomeKeyPressed
         if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            try {
            
            String nome = textFieldPesquisaPorNome.getText();
            // executando o select
            SerieDAO dao = new SerieDAO();
            List<Serie> listSerie = dao.pesquisaSerieNome(nome);
        
            // colocando os dados na tabela
            DefaultTableModel model = (DefaultTableModel) tabelaSeries.getModel();
            model.setRowCount(0);
        
             for(Serie s : listSerie){
                model.addRow(new Object[]{
                    s.getIdSerie(),
                    s.getNome(),
                    s.getGenero(),
                    s.getDirecao(),
                    s.getAnoLancamento(),
                    s.getTemporadas(),
                    s.getStreamer()
                });
            }
            } catch (Exception erroSql) {
                JOptionPane.showMessageDialog(null, "Erro ao pesquisar: " + erroSql);
            }
        
        }
    }//GEN-LAST:event_textFieldPesquisaPorNomeKeyPressed

    private void textFieldPesquisaDecadaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldPesquisaDecadaKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            try {
            
            int dataInicial = Integer.parseInt(textFieldPesquisaDecada.getText());
            // executando o select
            SerieDAO dao = new SerieDAO();
            List<Serie> listSerie = dao.pesquisaSeriesDecada(dataInicial);
        
            // colocando os dados na tabela
            DefaultTableModel model = (DefaultTableModel) tabelaSeries.getModel();
            model.setRowCount(0);
        
             for(Serie s : listSerie){
                model.addRow(new Object[]{
                    s.getIdSerie(),
                    s.getNome(),
                    s.getGenero(),
                    s.getDirecao(),
                    s.getAnoLancamento(),
                    s.getTemporadas(),
                    s.getStreamer()
                });
            }
            } catch (Exception erroSql) {
                JOptionPane.showMessageDialog(null, "Erro ao pesquisar: " + erroSql);
            }
        }
    }//GEN-LAST:event_textFieldPesquisaDecadaKeyPressed

    private void textFieldPesquisaAleatorioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldPesquisaAleatorioKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            try {
            
            int valor = Integer.parseInt(textFieldPesquisaAleatorio.getText());
            // executando o select
            SerieDAO dao = new SerieDAO();
            List<Serie> listSerie = dao.pesquisaSeriesAleatorio(valor);
        
            // colocando os dados na tabela
            DefaultTableModel model = (DefaultTableModel) tabelaSeries.getModel();
            model.setRowCount(0);
        
             for(Serie s : listSerie){
                model.addRow(new Object[]{
                    s.getIdSerie(),
                    s.getNome(),
                    s.getGenero(),
                    s.getDirecao(),
                    s.getAnoLancamento(),
                    s.getTemporadas(),
                    s.getStreamer()
                });
            }
            } catch (Exception erroSql) {
                JOptionPane.showMessageDialog(null, "Erro ao pesquisar: " + erroSql);
            }
        }
    }//GEN-LAST:event_textFieldPesquisaAleatorioKeyPressed

    private void textFieldPesquisaPorGeneroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldPesquisaPorGeneroKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            try {
            
            String genero = textFieldPesquisaPorGenero.getText();
            // executando o select
            SerieDAO dao = new SerieDAO();
            List<Serie> listSerie = dao.pesquisaSerieGenero(genero);
        
            // colocando os dados na tabela
            DefaultTableModel model = (DefaultTableModel) tabelaSeries.getModel();
            model.setRowCount(0);
        
             for(Serie s : listSerie){
                model.addRow(new Object[]{
                    s.getIdSerie(),
                    s.getNome(),
                    s.getGenero(),
                    s.getDirecao(),
                    s.getAnoLancamento(),
                    s.getTemporadas(),
                    s.getStreamer()
                });
            }
            } catch (Exception erroSql) {
                JOptionPane.showMessageDialog(null, "Erro ao pesquisar: " + erroSql);
            }
        }
    }//GEN-LAST:event_textFieldPesquisaPorGeneroKeyPressed

    private void botaoLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLimparActionPerformed
        textFieldPesquisaAleatorio.setText("");
        textFieldPesquisaDecada.setText("");
        textFieldPesquisaPorGenero.setText("");
        textFieldPesquisaPorNome.setText("");
    }//GEN-LAST:event_botaoLimparActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPesquisaSeries.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPesquisaSeries.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPesquisaSeries.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPesquisaSeries.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPesquisaSeries().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoLimpar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaSeries;
    private javax.swing.JTextField textFieldPesquisaAleatorio;
    private javax.swing.JTextField textFieldPesquisaDecada;
    private javax.swing.JTextField textFieldPesquisaPorGenero;
    private javax.swing.JTextField textFieldPesquisaPorNome;
    // End of variables declaration//GEN-END:variables
}
