/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package application;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class TelaCadastroDentista extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaCadastroDentista
     */
    public TelaCadastroDentista() {
        initComponents();
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
        txtNomeDent = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtCRO = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cmbEspec = new javax.swing.JComboBox<>();
        btnCadastrarDent = new javax.swing.JButton();

        jLabel1.setText("Nome: ");

        txtNomeDent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeDentActionPerformed(evt);
            }
        });

        jLabel2.setText("CRO:");

        txtCRO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCROActionPerformed(evt);
            }
        });

        jLabel3.setText("Espec:");

        cmbEspec.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ortodentia", "Implantodontia", "Traumatologia", "Periodontia" }));

        btnCadastrarDent.setText("Cadastrar");
        btnCadastrarDent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarDentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNomeDent, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnCadastrarDent, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmbEspec, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtCRO, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(109, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNomeDent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCRO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbEspec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(btnCadastrarDent, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeDentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeDentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeDentActionPerformed

    private void txtCROActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCROActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCROActionPerformed

    private void btnCadastrarDentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarDentActionPerformed
        String nome = txtNomeDent.getText();
        String aux = txtCRO.getText();
        int cro = Integer.parseInt(aux);
        Dentista dentista = new Dentista(cro ,nome);
        dentista.setEspecialidade((String)cmbEspec.getSelectedItem());
        BancoDeDados bd = new BancoDeDados();
        bd.addDentista(dentista);
        
        JOptionPane.showMessageDialog(null, "Dentista cadastrado com sucesso!");
    }//GEN-LAST:event_btnCadastrarDentActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrarDent;
    private javax.swing.JComboBox<String> cmbEspec;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtCRO;
    private javax.swing.JTextField txtNomeDent;
    // End of variables declaration//GEN-END:variables
}
