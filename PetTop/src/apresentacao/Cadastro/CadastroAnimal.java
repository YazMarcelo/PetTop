/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apresentacao.Cadastro;

import entidade.Animal;
import entidade.Cliente;
import entidade.Especie;
import java.awt.BorderLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.GroupLayout.Alignment.CENTER;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import negocio.NAnimal;
import negocio.NCliente;
import negocio.NEspecie;
import util.Mensagem;
import util.Utilitarios;

/**
 *
 * @author HELM
 */
public class CadastroAnimal extends javax.swing.JFrame {

    int esc;
    TableRowSorter trs;
    DefaultTableModel model = null;
    Mensagem msg = new Mensagem();
    String idCliente;
    int idAlteracao;

    /**
     * Creates new form CadastroAnimal
     */
    public CadastroAnimal() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        adicionandoDadosComboBox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelEspecie = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabelAcao = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldRGA = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldRaca = new javax.swing.JTextField();
        jComboBoxPorte = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jComboBoxEspecie = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jTextFieldPesquisar1 = new javax.swing.JTextField();
        jButtonAlterar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jLabelCliente = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAnimal = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanelEspecie.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Campos Obrigatórios *");

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelAcao.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelAcao.setText("Animais");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabelAcao)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabelAcao)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jLabel3.setText("RGA");

        jTextFieldRGA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldRGAKeyTyped(evt);
            }
        });

        jLabel4.setText("Nome*");

        jLabel5.setText("Raça");

        jComboBoxPorte.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Grande", "Médio", "Pequeno" }));

        jLabel6.setText("Porte");

        jLabel7.setText("Espécie");

        jLabel8.setText("Filtro");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione...", "Código", "RGA", "Nome", "Raça", "Porte", "Espécie" }));

        jTextFieldPesquisar1.setForeground(new java.awt.Color(204, 204, 204));
        jTextFieldPesquisar1.setText("Procurar...");
        jTextFieldPesquisar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldPesquisar1MouseClicked(evt);
            }
        });
        jTextFieldPesquisar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPesquisar1ActionPerformed(evt);
            }
        });
        jTextFieldPesquisar1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldPesquisar1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldPesquisar1KeyTyped(evt);
            }
        });

        jButtonAlterar.setBackground(new java.awt.Color(0, 136, 204));
        jButtonAlterar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonAlterar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAlterar.setText("Alterar");
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });

        jButtonExcluir.setBackground(new java.awt.Color(210, 50, 45));
        jButtonExcluir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonExcluir.setForeground(new java.awt.Color(255, 255, 255));
        jButtonExcluir.setText("Excluir");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jButtonSalvar.setBackground(new java.awt.Color(0, 136, 204));
        jButtonSalvar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonSalvar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jLabelCliente.setText("jLabel1");

        jTableAnimal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "RGA", "Nome", "Raça", "Porte", "Espécie"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableAnimal);
        if (jTableAnimal.getColumnModel().getColumnCount() > 0) {
            jTableAnimal.getColumnModel().getColumn(0).setResizable(false);
            jTableAnimal.getColumnModel().getColumn(0).setPreferredWidth(10);
            jTableAnimal.getColumnModel().getColumn(1).setResizable(false);
            jTableAnimal.getColumnModel().getColumn(1).setPreferredWidth(30);
            jTableAnimal.getColumnModel().getColumn(2).setResizable(false);
            jTableAnimal.getColumnModel().getColumn(2).setPreferredWidth(250);
            jTableAnimal.getColumnModel().getColumn(3).setResizable(false);
            jTableAnimal.getColumnModel().getColumn(3).setPreferredWidth(50);
            jTableAnimal.getColumnModel().getColumn(4).setPreferredWidth(50);
            jTableAnimal.getColumnModel().getColumn(5).setResizable(false);
            jTableAnimal.getColumnModel().getColumn(5).setPreferredWidth(60);
        }

        javax.swing.GroupLayout jPanelEspecieLayout = new javax.swing.GroupLayout(jPanelEspecie);
        jPanelEspecie.setLayout(jPanelEspecieLayout);
        jPanelEspecieLayout.setHorizontalGroup(
            jPanelEspecieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEspecieLayout.createSequentialGroup()
                .addGroup(jPanelEspecieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelEspecieLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelEspecieLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelEspecieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEspecieLayout.createSequentialGroup()
                                .addComponent(jButtonSalvar)
                                .addGap(10, 10, 10)
                                .addComponent(jButtonAlterar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonExcluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextFieldPesquisar1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEspecieLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelEspecieLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanelEspecieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelEspecieLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(366, 366, 366)
                                .addComponent(jLabelCliente))
                            .addGroup(jPanelEspecieLayout.createSequentialGroup()
                                .addGroup(jPanelEspecieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelEspecieLayout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jComboBoxPorte, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelEspecieLayout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextFieldRGA, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(30, 30, 30)
                                .addGroup(jPanelEspecieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelEspecieLayout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextFieldRaca, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanelEspecieLayout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBoxEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 93, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelEspecieLayout.setVerticalGroup(
            jPanelEspecieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEspecieLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelEspecieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabelCliente))
                .addGap(18, 18, 18)
                .addGroup(jPanelEspecieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldRGA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldRaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanelEspecieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jComboBoxPorte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jComboBoxEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(jPanelEspecieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelEspecieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPesquisar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAlterar)
                    .addComponent(jButtonExcluir)
                    .addComponent(jButtonSalvar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelEspecie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldPesquisar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldPesquisar1MouseClicked
        jTextFieldPesquisar1.setText("");
    }//GEN-LAST:event_jTextFieldPesquisar1MouseClicked

    private void jTextFieldPesquisar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPesquisar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPesquisar1ActionPerformed

    private void jTextFieldPesquisar1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPesquisar1KeyReleased

    }//GEN-LAST:event_jTextFieldPesquisar1KeyReleased

    private void jTextFieldPesquisar1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPesquisar1KeyTyped
        jTextFieldPesquisar1.setForeground(new java.awt.Color(0, 0, 0));

        String selecionado = (String) jComboBox3.getSelectedItem();

        switch (selecionado) {
            case "Nome":
                esc = 2;
                break;
            case "Código":
                esc = 0;
                break;
            case "RGA":
                esc = 1;
                break;
            case "Raça":
                esc = 3;
                break;
            case "Porte":
                esc = 4;
                break;
            case "Espécie":
                esc = 5;
                break;
        }

        jTextFieldPesquisar1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {

                trs.setRowFilter(RowFilter.regexFilter("(?i)" + jTextFieldPesquisar1.getText(), esc));
            }
        });
        trs = new TableRowSorter(model);
        jTableAnimal.setRowSorter(trs);
    }//GEN-LAST:event_jTextFieldPesquisar1KeyTyped

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed

        if (jTableAnimal.getSelectedRow() >= 0) {
            try {
                String id = (String) jTableAnimal.getValueAt(jTableAnimal.getSelectedRow(), 0);

                NAnimal neg = new NAnimal();
                Animal anim = (Animal) neg.consultar(id);

                this.idAlteracao = anim.getCodigo();

                jTextFieldRGA.setText(anim.getRga());
                jTextFieldNome.setText(anim.getNome());
                jTextFieldRaca.setText(anim.getRaca());

                jComboBoxPorte.setSelectedItem(anim.getPorteDoAnimal());
                jComboBoxEspecie.setSelectedItem(anim.getEspecie());
            } catch (Exception e) {
            }
        } else {
            msg.msg12();
        }
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        if (jTableAnimal.getSelectedRow() >= 0) {
            int resposta = msg.msg03();

            if (resposta == JOptionPane.YES_OPTION) {
                try {

                    String id = (String) jTableAnimal.getValueAt(jTableAnimal.getSelectedRow(), 0);

                    NAnimal neg = new NAnimal();
                    neg.excluir(id);
                    model.removeRow(jTableAnimal.getSelectedRow());
                    jTableAnimal.setModel(model);

                    msg.msg05();
                } catch (Exception ex) {
                    Logger.getLogger(CadastroAnimal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } else {
            msg.msg12();
        }
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        try {

            Animal anim = new Animal();
            NAnimal neg = new NAnimal();

            anim.setCodigo(idAlteracao);
            anim.setNome(jTextFieldNome.getText());
            anim.setRga(jTextFieldRGA.getText());
            anim.setRaca(jTextFieldRaca.getText());
            anim.setPorteDoAnimal(jComboBoxPorte.getSelectedItem().toString());
            anim.setCliente(new NCliente().consultar(idCliente));
            anim.setEspecie((Especie) jComboBoxEspecie.getSelectedItem());
            neg.salvar(anim);

            atualizar();
            limparCampos();

        } catch (Exception ex) {
            Logger.getLogger(CadastroAnimal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jTextFieldRGAKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldRGAKeyTyped
        Utilitarios.someteNumeros(evt);
    }//GEN-LAST:event_jTextFieldRGAKeyTyped

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
            java.util.logging.Logger.getLogger(CadastroAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroAnimal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox jComboBoxEspecie;
    private javax.swing.JComboBox<String> jComboBoxPorte;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelAcao;
    private javax.swing.JLabel jLabelCliente;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelEspecie;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableAnimal;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldPesquisar1;
    private javax.swing.JTextField jTextFieldRGA;
    private javax.swing.JTextField jTextFieldRaca;
    // End of variables declaration//GEN-END:variables
    public void settarCliente(String id) throws Exception {
        idCliente = id;
        atualizar();
        NCliente negClie = new NCliente();
        Cliente clie = new Cliente();
        clie = negClie.consultar(id);

        jLabelCliente.setText(clie.getNome());
        jLabelCliente.setAlignmentX(595 - (clie.getNome().length() / 2));
        
    }

    public void adicionandoDadosComboBox() {
        try {
            ArrayList<Object> listaDeEspecialidades;
            NEspecie neg = new NEspecie();
            listaDeEspecialidades = neg.listar();

            for (Object objeto : listaDeEspecialidades) {
                Especie objEspecie = (Especie) objeto;
                jComboBoxEspecie.addItem(objEspecie);
            }
        } catch (Exception ex) {

        }
    }
    
    public void atualizar(){
                try {
            ArrayList<Object> listaDeAnimaiss;
            NAnimal neg = new NAnimal();
            listaDeAnimaiss = neg.listarPorCliente(idCliente);
            model = (DefaultTableModel) jTableAnimal.getModel();

            model.setNumRows(0);
            for (int pos = 0; pos < listaDeAnimaiss.size(); pos++) {
                String[] saida = new String[6];
                Animal aux = (Animal) listaDeAnimaiss.get(pos);
                saida[0] = String.valueOf(aux.getCodigo());
                saida[1] = aux.getRga();
                saida[2] = aux.getNome();
                saida[3] = aux.getRaca();
                saida[4] = aux.getPorteDoAnimal();
                saida[5] = (aux.getEspecie().getDescricao());
                model.addRow(saida);
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, erro.getMessage());
        }
    }

    private void limparCampos() {
        jTextFieldRGA.setText("");
        jTextFieldRaca.setText("");
        jTextFieldNome.setText("");
        jComboBoxPorte.setSelectedItem("Grande");
    }
}