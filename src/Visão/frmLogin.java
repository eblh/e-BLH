package Visão;

public class frmLogin extends javax.swing.JFrame {

    public frmLogin() {
        initComponents();
        
        //setUndecorated(true);
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnLoginSair = new javax.swing.JButton();
        btnLoginAcessar = new javax.swing.JButton();
        lblLoginUsuario = new javax.swing.JLabel();
        txtLoginUsuario = new javax.swing.JTextField();
        txtLoginUsuario1 = new javax.swing.JTextField();
        lblLoginSenha = new javax.swing.JLabel();
        lblLoginFundo = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(null);

        btnLoginSair.setBackground(new java.awt.Color(4, 134, 208));
        btnLoginSair.setFont(new java.awt.Font("IrisUPC", 1, 22)); // NOI18N
        btnLoginSair.setForeground(new java.awt.Color(255, 255, 255));
        btnLoginSair.setText("Sair");
        btnLoginSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginSairActionPerformed(evt);
            }
        });
        getContentPane().add(btnLoginSair);
        btnLoginSair.setBounds(270, 233, 80, 30);

        btnLoginAcessar.setBackground(new java.awt.Color(4, 134, 208));
        btnLoginAcessar.setFont(new java.awt.Font("IrisUPC", 1, 22)); // NOI18N
        btnLoginAcessar.setForeground(new java.awt.Color(255, 255, 255));
        btnLoginAcessar.setText("Acessar");
        btnLoginAcessar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginAcessarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLoginAcessar);
        btnLoginAcessar.setBounds(390, 233, 83, 30);

        lblLoginUsuario.setFont(new java.awt.Font("IrisUPC", 1, 24)); // NOI18N
        lblLoginUsuario.setForeground(new java.awt.Color(4, 134, 208));
        lblLoginUsuario.setText("Usuário");
        getContentPane().add(lblLoginUsuario);
        lblLoginUsuario.setBounds(270, 50, 60, 17);
        getContentPane().add(txtLoginUsuario);
        txtLoginUsuario.setBounds(270, 170, 210, 30);
        getContentPane().add(txtLoginUsuario1);
        txtLoginUsuario1.setBounds(270, 80, 210, 30);

        lblLoginSenha.setFont(new java.awt.Font("IrisUPC", 1, 24)); // NOI18N
        lblLoginSenha.setForeground(new java.awt.Color(4, 134, 208));
        lblLoginSenha.setText("Senha");
        getContentPane().add(lblLoginSenha);
        lblLoginSenha.setBounds(270, 140, 70, 17);

        lblLoginFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Login.jpg"))); // NOI18N
        getContentPane().add(lblLoginFundo);
        lblLoginFundo.setBounds(0, 0, 536, 310);

        setSize(new java.awt.Dimension(544, 337));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginAcessarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginAcessarActionPerformed
        frmPrincipal principal = new frmPrincipal();
        principal.setVisible(true);
        dispose();//Fechar
    }//GEN-LAST:event_btnLoginAcessarActionPerformed

    private void btnLoginSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnLoginSairActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLoginAcessar;
    private javax.swing.JButton btnLoginSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblLoginFundo;
    private javax.swing.JLabel lblLoginSenha;
    private javax.swing.JLabel lblLoginUsuario;
    private javax.swing.JTextField txtLoginUsuario;
    private javax.swing.JTextField txtLoginUsuario1;
    // End of variables declaration//GEN-END:variables
}
