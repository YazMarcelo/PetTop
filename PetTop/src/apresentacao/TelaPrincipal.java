/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apresentacao;

//import interfacesgraficas.Cadastro.TelaConsultaDevolvidos;
//import interfacesgraficas.Cadastro.TelaConsultaLocados;
//import interfacesgraficas.Cadastro.TelaLocar;
//import interfacesgraficas.Consulta.TelaConsultaCliente;
//import interfacesgraficas.Consulta.TelaConsultaMarca;
//import interfacesgraficas.Consulta.TelaConsultaModelo;
//import interfacesgraficas.Consulta.TelaConsultaVeiculo;
import java.awt.Color;
import static javax.swing.GroupLayout.Alignment.CENTER;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Pedro
 */
public class TelaPrincipal extends javax.swing.JFrame {
//    TelaConsultaMarca telaMarca = new TelaConsultaMarca();
//    TelaConsultaVeiculo telaVeiculo = new TelaConsultaVeiculo();
//    TelaConsultaModelo telaModelo = new TelaConsultaModelo();
//    TelaConsultaCliente telaCliente = new TelaConsultaCliente();
//    TelaLocar telaLocar = new TelaLocar();
//    TelaConsultaLocados telaDevolucao = new TelaConsultaLocados();
//    TelaConsultaDevolvidos tcd = new TelaConsultaDevolvidos();
    boolean aberta;
    
    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        
           
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu8 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();
        jMenuBar4 = new javax.swing.JMenuBar();
        jMenu10 = new javax.swing.JMenu();
        jMenu11 = new javax.swing.JMenu();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        jPanel1 = new javax.swing.JPanel();
        jButtonCliente = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jButtonLocar = new javax.swing.JButton();
        jButtonDevolver = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButtonDevolver1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabelSair = new javax.swing.JLabel();
        jLabelBemVindo = new javax.swing.JLabel();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jMenu3.setText("jMenu3");

        jMenu4.setText("jMenu4");

        jMenu5.setText("File");
        jMenuBar2.add(jMenu5);

        jMenu6.setText("Edit");
        jMenuBar2.add(jMenu6);

        jMenuItem3.setText("jMenuItem3");

        jMenu7.setText("jMenu7");

        jMenu8.setText("File");
        jMenuBar3.add(jMenu8);

        jMenu9.setText("Edit");
        jMenuBar3.add(jMenu9);

        jMenu10.setText("File");
        jMenuBar4.add(jMenu10);

        jMenu11.setText("Edit");
        jMenuBar4.add(jMenu11);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jButtonCliente.setBackground(new java.awt.Color(51, 51, 51));
        jButtonCliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonCliente.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCliente.setText("Produtos");
        jButtonCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClienteActionPerformed(evt);
            }
        });

        jButtonLocar.setBackground(new java.awt.Color(51, 51, 51));
        jButtonLocar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonLocar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonLocar.setText("Pedido");
        jButtonLocar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLocarActionPerformed(evt);
            }
        });

        jButtonDevolver.setBackground(new java.awt.Color(51, 51, 51));
        jButtonDevolver.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonDevolver.setForeground(new java.awt.Color(255, 255, 255));
        jButtonDevolver.setText("Cliente");
        jButtonDevolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDevolverActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MENU");

        jButtonDevolver1.setBackground(new java.awt.Color(51, 51, 51));
        jButtonDevolver1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonDevolver1.setForeground(new java.awt.Color(255, 255, 255));
        jButtonDevolver1.setText("Serviços");
        jButtonDevolver1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDevolver1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonLocar, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonDevolver, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonDevolver1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(10, 10, 10)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonLocar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButtonDevolver, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButtonDevolver1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButtonCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelSair.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabelSair.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSair.setText("Sair");
        jLabelSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelSairMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelSair)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelSair)
                .addContainerGap())
        );

        jLabelBemVindo.setFont(new java.awt.Font("Tahoma", 1, 60)); // NOI18N
        jLabelBemVindo.setForeground(new java.awt.Color(102, 102, 102));
        jLabelBemVindo.setText("Bem Vindo!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(176, 176, 176))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(381, 381, 381)
                        .addComponent(jLabelBemVindo)
                        .addContainerGap(394, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(203, 203, 203)
                .addComponent(jLabelBemVindo)
                .addGap(50, 50, 50)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(110, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClienteActionPerformed
//        telaCliente.setLocation(182, 36);
//       /*this.*/ this.add(telaCliente);
//        telaCliente.show();
//        telaVeiculo.dispose();
//        telaMarca.dispose();
//        telaModelo.dispose();
//        telaLocar.dispose();
//        telaDevolucao.dispose();
//        tcd.dispose();
        jLabelBemVindo.setText("");
    }//GEN-LAST:event_jButtonClienteActionPerformed

    private void jLabelSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSairMouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabelSairMouseClicked

    private void jButtonLocarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLocarActionPerformed
//       telaLocar.setLocation(182, 36);
//       /*this.*/ this.add(telaLocar);
//        telaLocar.atualizarTableCliente();
//        telaLocar.show();
//        telaCliente.dispose();
//        telaMarca.dispose();
//        telaModelo.dispose();
//        telaVeiculo.dispose();
//        telaDevolucao.dispose();
//        tcd.dispose();
        jLabelBemVindo.setText("");
    }//GEN-LAST:event_jButtonLocarActionPerformed

    private void jButtonDevolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDevolverActionPerformed
//        telaDevolucao.setLocation(182, 36);
//       /*this.*/ this.add(telaDevolucao);
//        telaDevolucao.show();
//        telaCliente.dispose();
//        telaMarca.dispose();
//        telaModelo.dispose();
//        telaVeiculo.dispose();
//        telaLocar.dispose();
//        tcd.dispose();
        jLabelBemVindo.setText("");
    }//GEN-LAST:event_jButtonDevolverActionPerformed

    private void jButtonDevolver1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDevolver1ActionPerformed
//        tcd.setLocation(182, 36);
//       /*this.*/ this.add(tcd);
//        tcd.show();
//        telaVeiculo.dispose();
//        telaMarca.dispose();
//        telaModelo.dispose();
//        telaLocar.dispose();
//        telaDevolucao.dispose();
//        telaCliente.dispose();
        jLabelBemVindo.setText("");
    }//GEN-LAST:event_jButtonDevolver1ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.Box.Filler filler1;
    private javax.swing.JButton jButtonCliente;
    private javax.swing.JButton jButtonDevolver;
    private javax.swing.JButton jButtonDevolver1;
    private javax.swing.JButton jButtonLocar;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelBemVindo;
    private javax.swing.JLabel jLabelSair;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuBar jMenuBar4;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}