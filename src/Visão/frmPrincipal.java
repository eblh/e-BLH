package Visão;

public class frmPrincipal extends javax.swing.JFrame {

    public frmPrincipal() {
        initComponents();
        
        setLocationRelativeTo(null); //ABRIR CENTRALIZADO
        setExtendedState(MAXIMIZED_BOTH); //ABRIR MAXIMIZADO
    }

     @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPrincipalFundo = new javax.swing.JPanel();
        jmbPrincipal = new javax.swing.JMenuBar();
        jmCadastros = new javax.swing.JMenu();
        jmiCadMae = new javax.swing.JMenuItem();
        jmiCadRN = new javax.swing.JMenuItem();
        jspCad01 = new javax.swing.JPopupMenu.Separator();
        jmiCadLocal = new javax.swing.JMenuItem();
        jspCad02 = new javax.swing.JPopupMenu.Separator();
        jmiCadUsuario = new javax.swing.JMenuItem();
        jspCad03 = new javax.swing.JPopupMenu.Separator();
        jmiCadSair = new javax.swing.JMenuItem();
        jmEstoque = new javax.swing.JMenu();
        jmiContVidroVazio = new javax.swing.JMenuItem();
        jmiContLeite = new javax.swing.JMenuItem();
        jmAtendimento = new javax.swing.JMenu();
        jmiFichaAtend = new javax.swing.JMenuItem();
        jmSistema = new javax.swing.JMenu();
        jmiSistSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("e-BLH - Prontuário Eletrônico do Banco de Leite Humano de Marília/SP - Fone (14) 3413-8696");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnlPrincipalFundoLayout = new javax.swing.GroupLayout(pnlPrincipalFundo);
        pnlPrincipalFundo.setLayout(pnlPrincipalFundoLayout);
        pnlPrincipalFundoLayout.setHorizontalGroup(
            pnlPrincipalFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        pnlPrincipalFundoLayout.setVerticalGroup(
            pnlPrincipalFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        jmCadastros.setText("Cadastros");

        jmiCadMae.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        jmiCadMae.setText("Cadastro Mãe");
        jmiCadMae.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCadMaeActionPerformed(evt);
            }
        });
        jmCadastros.add(jmiCadMae);

        jmiCadRN.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        jmiCadRN.setText("Cadastro Recém Nascido");
        jmCadastros.add(jmiCadRN);
        jmCadastros.add(jspCad01);

        jmiCadLocal.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        jmiCadLocal.setText("Cadastro Localização");
        jmCadastros.add(jmiCadLocal);
        jmCadastros.add(jspCad02);

        jmiCadUsuario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        jmiCadUsuario.setText("Cadastro de Usuário");
        jmiCadUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCadUsuarioActionPerformed(evt);
            }
        });
        jmCadastros.add(jmiCadUsuario);
        jmCadastros.add(jspCad03);

        jmiCadSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F12, 0));
        jmiCadSair.setText("Sair");
        jmiCadSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCadSairActionPerformed(evt);
            }
        });
        jmCadastros.add(jmiCadSair);

        jmbPrincipal.add(jmCadastros);

        jmEstoque.setText("Estoque");

        jmiContVidroVazio.setText("Controle Vidros Vazios");
        jmEstoque.add(jmiContVidroVazio);

        jmiContLeite.setText("Controle de Leite");
        jmEstoque.add(jmiContLeite);

        jmbPrincipal.add(jmEstoque);

        jmAtendimento.setText("Atendimento");

        jmiFichaAtend.setText("Ficha de Atendimento");
        jmAtendimento.add(jmiFichaAtend);

        jmbPrincipal.add(jmAtendimento);

        jmSistema.setText("Sistema");
        jmSistema.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmSistemaMouseClicked(evt);
            }
        });

        jmiSistSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, java.awt.event.InputEvent.ALT_MASK));
        jmiSistSair.setText("Sair");
        jmiSistSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiSistSairActionPerformed(evt);
            }
        });
        jmSistema.add(jmiSistSair);

        jmbPrincipal.add(jmSistema);

        setJMenuBar(jmbPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipalFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipalFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiCadSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCadSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jmiCadSairActionPerformed

    private void jmSistemaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmSistemaMouseClicked
        
    }//GEN-LAST:event_jmSistemaMouseClicked

    private void jmiCadMaeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCadMaeActionPerformed
        new frmCadMae(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_jmiCadMaeActionPerformed

    private void jmiCadUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCadUsuarioActionPerformed
        new frmCadUsuario(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_jmiCadUsuarioActionPerformed

    private void jmiSistSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiSistSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jmiSistSairActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jmAtendimento;
    private javax.swing.JMenu jmCadastros;
    private javax.swing.JMenu jmEstoque;
    private javax.swing.JMenu jmSistema;
    private javax.swing.JMenuBar jmbPrincipal;
    private javax.swing.JMenuItem jmiCadLocal;
    private javax.swing.JMenuItem jmiCadMae;
    private javax.swing.JMenuItem jmiCadRN;
    private javax.swing.JMenuItem jmiCadSair;
    private javax.swing.JMenuItem jmiCadUsuario;
    private javax.swing.JMenuItem jmiContLeite;
    private javax.swing.JMenuItem jmiContVidroVazio;
    private javax.swing.JMenuItem jmiFichaAtend;
    private javax.swing.JMenuItem jmiSistSair;
    private javax.swing.JPopupMenu.Separator jspCad01;
    private javax.swing.JPopupMenu.Separator jspCad02;
    private javax.swing.JPopupMenu.Separator jspCad03;
    private javax.swing.JPanel pnlPrincipalFundo;
    // End of variables declaration//GEN-END:variables
}
