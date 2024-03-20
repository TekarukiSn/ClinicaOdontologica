package application;

public class TelaPrincipal extends javax.swing.JFrame {

    public TelaPrincipal() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktop = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuCadastro = new javax.swing.JMenu();
        mnuCadastroPaciente = new javax.swing.JMenuItem();
        mnuCadastroDentista = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnuSair = new javax.swing.JMenuItem();
        mnuAgendar = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        mnuCadastro.setText("Cadastro");

        mnuCadastroPaciente.setText("Paciente");
        mnuCadastroPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCadastroPacienteActionPerformed(evt);
            }
        });
        mnuCadastro.add(mnuCadastroPaciente);

        mnuCadastroDentista.setText("Dentista");
        mnuCadastroDentista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCadastroDentistaActionPerformed(evt);
            }
        });
        mnuCadastro.add(mnuCadastroDentista);
        mnuCadastro.add(jSeparator1);

        mnuSair.setText("Sair");
        mnuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSairActionPerformed(evt);
            }
        });
        mnuCadastro.add(mnuSair);

        jMenuBar1.add(mnuCadastro);

        mnuAgendar.setText("Consulta");

        jMenuItem1.setText("Agendar ");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        mnuAgendar.add(jMenuItem1);

        jMenuBar1.add(mnuAgendar);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuCadastroPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCadastroPacienteActionPerformed
        TelaCadastroPaciente telaInterna = new TelaCadastroPaciente();
        desktop.add(telaInterna);
        telaInterna.setVisible(true);
        telaInterna.setClosable(true);
    }//GEN-LAST:event_mnuCadastroPacienteActionPerformed

    private void mnuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mnuSairActionPerformed

    private void mnuCadastroDentistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCadastroDentistaActionPerformed
        TelaCadastroDentista telaInternaDent = new TelaCadastroDentista();
        desktop.add(telaInternaDent);
        telaInternaDent.setVisible(true);
        telaInternaDent.setClosable(true);
    }//GEN-LAST:event_mnuCadastroDentistaActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        TelaAgendarConsulta telaInterna = new TelaAgendarConsulta();
        desktop.add(telaInterna);
        telaInterna.setVisible(true);
        telaInterna.setClosable(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenu mnuAgendar;
    private javax.swing.JMenu mnuCadastro;
    private javax.swing.JMenuItem mnuCadastroDentista;
    private javax.swing.JMenuItem mnuCadastroPaciente;
    private javax.swing.JMenuItem mnuSair;
    // End of variables declaration//GEN-END:variables
}
