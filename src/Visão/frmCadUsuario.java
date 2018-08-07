package Visão;

import java.awt.FlowLayout;
import javax.swing.ButtonGroup;
import javax.swing.text.html.HTML;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;
import Controle.Conexao;
import Modelo.TratamentoTXT;

public class frmCadUsuario extends javax.swing.JDialog {
    private ButtonGroup grpSex;

    public frmCadUsuario(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null); // Iniciar form centralizado
             
        ButtonGroup grpSex = new ButtonGroup();  
  
        grpSex.add(jrbUsuarioAtivo);  
        grpSex.add(jrbUsuarioInativo);  
                
        pnlUsuarioStatus.setLayout(new FlowLayout());
        pnlUsuarioStatus.add(jrbUsuarioAtivo);
        pnlUsuarioStatus.add(jrbUsuarioInativo);
        
        /*Limitando e tratando a insersão no JTextField
          - [^.....] = Apenas o que colocar ([^a-z]=Apenas Letras Minúsculas / [a-z]=Exceto Letras Minúsculas)
          - [^aA-zZ] = Apenas letras maiúsculas e minúsculas   */
        txtUsuarioUsuario.setDocument(new TratamentoTXT(15,"[^aA-zZ]"));//APENAS 15 LETRAS
        txtUsuarioNome.setDocument(new TratamentoTXT(45,"[^aA-zZ]"));//APENAS 45 LETRAS
        txtUsuarioSenha.setDocument(new TratamentoTXT(15,""));
        txtUsuarioConfSenha.setDocument(new TratamentoTXT(15,""));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        pnlCadUsuario2 = new javax.swing.JPanel();
        btnUsuarioExcluir = new javax.swing.JButton();
        btnUsuarioInserir = new javax.swing.JButton();
        btnUsuarioEditar = new javax.swing.JButton();
        btnUsuarioPesquisar = new javax.swing.JButton();
        btnUsuarioSair = new javax.swing.JButton();
        jspUsuario2 = new javax.swing.JSeparator();
        jspUsuario1 = new javax.swing.JSeparator();
        btnUsuarioSalvar = new javax.swing.JButton();
        btnUsuarioDesfazer = new javax.swing.JButton();
        pnlCadUsuario1 = new javax.swing.JPanel();
        pnlUsuarioDados = new javax.swing.JPanel();
        lblUsuarioSenha = new javax.swing.JLabel();
        txtUsuarioSenha = new javax.swing.JTextField();
        lblUsuarioConfSenha = new javax.swing.JLabel();
        txtUsuarioConfSenha = new javax.swing.JTextField();
        lblUsuarioUsuario = new javax.swing.JLabel();
        txtUsuarioUsuario = new javax.swing.JTextField();
        txtUsuarioNome = new javax.swing.JTextField();
        lblUsuarioNome = new javax.swing.JLabel();
        pnlUsuarioStatus = new javax.swing.JPanel();
        jrbUsuarioAtivo = new javax.swing.JRadioButton();
        jrbUsuarioInativo = new javax.swing.JRadioButton();
        lblUsuarioPerfil = new javax.swing.JLabel();
        cbbUsuarioPerfil = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnlCadUsuario2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnUsuarioExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Excluir.png"))); // NOI18N
        btnUsuarioExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnUsuarioExcluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnUsuarioExcluir.setOpaque(false);
        btnUsuarioExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuarioExcluirActionPerformed(evt);
            }
        });

        btnUsuarioInserir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Inserir.png"))); // NOI18N
        btnUsuarioInserir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnUsuarioInserir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnUsuarioInserir.setOpaque(false);
        btnUsuarioInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuarioInserirActionPerformed(evt);
            }
        });

        btnUsuarioEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Editar.png"))); // NOI18N
        btnUsuarioEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnUsuarioEditar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnUsuarioEditar.setOpaque(false);
        btnUsuarioEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuarioEditarActionPerformed(evt);
            }
        });

        btnUsuarioPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Pesquisar.png"))); // NOI18N
        btnUsuarioPesquisar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnUsuarioPesquisar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnUsuarioPesquisar.setOpaque(false);
        btnUsuarioPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuarioPesquisarActionPerformed(evt);
            }
        });

        btnUsuarioSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Sair.png"))); // NOI18N
        btnUsuarioSair.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnUsuarioSair.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnUsuarioSair.setOpaque(false);
        btnUsuarioSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuarioSairActionPerformed(evt);
            }
        });

        jspUsuario2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jspUsuario1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        btnUsuarioSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Salvar.png"))); // NOI18N
        btnUsuarioSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnUsuarioSalvar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnUsuarioSalvar.setOpaque(false);
        btnUsuarioSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuarioSalvarActionPerformed(evt);
            }
        });

        btnUsuarioDesfazer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Desfazer.png"))); // NOI18N
        btnUsuarioDesfazer.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnUsuarioDesfazer.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnUsuarioDesfazer.setOpaque(false);
        btnUsuarioDesfazer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuarioDesfazerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlCadUsuario2Layout = new javax.swing.GroupLayout(pnlCadUsuario2);
        pnlCadUsuario2.setLayout(pnlCadUsuario2Layout);
        pnlCadUsuario2Layout.setHorizontalGroup(
            pnlCadUsuario2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCadUsuario2Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(btnUsuarioInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnUsuarioEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnUsuarioExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnUsuarioSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnUsuarioDesfazer, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jspUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUsuarioPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jspUsuario2, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUsuarioSair, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
        pnlCadUsuario2Layout.setVerticalGroup(
            pnlCadUsuario2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCadUsuario2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCadUsuario2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jspUsuario2)
                    .addComponent(btnUsuarioPesquisar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                    .addComponent(btnUsuarioExcluir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUsuarioSair, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jspUsuario1)
                    .addComponent(btnUsuarioSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUsuarioDesfazer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUsuarioEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUsuarioInserir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pnlCadUsuario1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        pnlUsuarioDados.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do Usuário"));
        pnlUsuarioDados.setToolTipText("");
        pnlUsuarioDados.setName(""); // NOI18N

        lblUsuarioSenha.setText("Senha *");

        lblUsuarioConfSenha.setText("Confirmar Senha *");

        lblUsuarioUsuario.setText("Usuário *");

        lblUsuarioNome.setText("Nome *");

        pnlUsuarioStatus.setBorder(javax.swing.BorderFactory.createTitledBorder("Status *"));

        jrbUsuarioAtivo.setText("Ativo");

        jrbUsuarioInativo.setText("Inativo");

        javax.swing.GroupLayout pnlUsuarioStatusLayout = new javax.swing.GroupLayout(pnlUsuarioStatus);
        pnlUsuarioStatus.setLayout(pnlUsuarioStatusLayout);
        pnlUsuarioStatusLayout.setHorizontalGroup(
            pnlUsuarioStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUsuarioStatusLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jrbUsuarioAtivo)
                .addGap(18, 18, 18)
                .addComponent(jrbUsuarioInativo)
                .addContainerGap(13, Short.MAX_VALUE))
        );
        pnlUsuarioStatusLayout.setVerticalGroup(
            pnlUsuarioStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlUsuarioStatusLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlUsuarioStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbUsuarioAtivo)
                    .addComponent(jrbUsuarioInativo))
                .addContainerGap())
        );

        lblUsuarioPerfil.setText("Perfil *");

        cbbUsuarioPerfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Selecione -", "ADMINISTRADOR", "ATENDENTE", "ENFERMAGEM", "ESTOQUE", "PASTEURIZAÇÃO" }));

        javax.swing.GroupLayout pnlUsuarioDadosLayout = new javax.swing.GroupLayout(pnlUsuarioDados);
        pnlUsuarioDados.setLayout(pnlUsuarioDadosLayout);
        pnlUsuarioDadosLayout.setHorizontalGroup(
            pnlUsuarioDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUsuarioDadosLayout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addGroup(pnlUsuarioDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtUsuarioSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUsuarioSenha)
                    .addComponent(pnlUsuarioStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addGroup(pnlUsuarioDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblUsuarioConfSenha)
                    .addComponent(txtUsuarioConfSenha)
                    .addComponent(lblUsuarioPerfil)
                    .addComponent(cbbUsuarioPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(123, 123, 123))
            .addGroup(pnlUsuarioDadosLayout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addGroup(pnlUsuarioDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUsuarioNome)
                    .addComponent(txtUsuarioNome, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUsuarioUsuario)
                    .addComponent(txtUsuarioUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlUsuarioDadosLayout.setVerticalGroup(
            pnlUsuarioDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUsuarioDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblUsuarioUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsuarioUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblUsuarioNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsuarioNome, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(pnlUsuarioDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsuarioSenha)
                    .addComponent(lblUsuarioConfSenha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlUsuarioDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsuarioSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUsuarioConfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlUsuarioDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlUsuarioDadosLayout.createSequentialGroup()
                        .addComponent(lblUsuarioPerfil)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbbUsuarioPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pnlUsuarioStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlCadUsuario1Layout = new javax.swing.GroupLayout(pnlCadUsuario1);
        pnlCadUsuario1.setLayout(pnlCadUsuario1Layout);
        pnlCadUsuario1Layout.setHorizontalGroup(
            pnlCadUsuario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCadUsuario1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(pnlUsuarioDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlCadUsuario1Layout.setVerticalGroup(
            pnlCadUsuario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCadUsuario1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlUsuarioDados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlUsuarioDados.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlCadUsuario2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlCadUsuario1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(pnlCadUsuario1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlCadUsuario2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUsuarioExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuarioExcluirActionPerformed
        /*DAOCliente qry = new DAOCliente();
        qry.excluir(txtCodigo.getText());
        this.LimparCampos();
        HabilitarBotoes();
        JOptionPane.showMessageDialog(null, "Cliente Excluído com Sucesso!!!");*/
    }//GEN-LAST:event_btnUsuarioExcluirActionPerformed

    private void btnUsuarioInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuarioInserirActionPerformed
        /*HabilitarCampos();
        DesabilitarBotoes();
        txtCodigo.requestFocus();*/
    }//GEN-LAST:event_btnUsuarioInserirActionPerformed

    private void btnUsuarioEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuarioEditarActionPerformed
        /*press_edit = true;
        DesabilitarBotoes();
        HabilitarCampos();
        txtCodigo.requestFocus(true);*/
    }//GEN-LAST:event_btnUsuarioEditarActionPerformed

    private void btnUsuarioPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuarioPesquisarActionPerformed
        /*frmPesqCliente pesqCliente = new frmPesqCliente(null, rootPaneCheckingEnabled);
        pesqCliente.setVisible(true);
        Cliente cli = pesqCliente.getClienteSelecionado();
        if(cli != null){
            setDados(cli);
        }
        if(txtCodigo.getText().trim().isEmpty()){
            HabilitarBotoes();
        }else{
            btnClienteInserir.setEnabled(false);
            btnClienteEditar.setEnabled(true);
            btnClienteExcluir.setEnabled(true);
        }*/
    }//GEN-LAST:event_btnUsuarioPesquisarActionPerformed

    private void btnUsuarioSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuarioSairActionPerformed
        setVisible(false);
    }//GEN-LAST:event_btnUsuarioSairActionPerformed

    private void btnUsuarioSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuarioSalvarActionPerformed
        /*DAOCliente qry = new DAOCliente();
        if (press_edit == false){ //SALVA
            if(txtCodigo.getText().trim().isEmpty()){
                JOptionPane.showMessageDialog(null, "Código é obrigatório!!!","Aviso",JOptionPane.WHEN_IN_FOCUSED_WINDOW);
                txtCodigo.requestFocus();
            }else if(txtNome.getText().trim().isEmpty()){
                JOptionPane.showMessageDialog(null, "Nome é obrigatório!!!","Aviso",JOptionPane.WHEN_IN_FOCUSED_WINDOW);
                txtNome.requestFocus();
            }else if(txtDataNasc.getText().equals("  /  /    ")){
                JOptionPane.showMessageDialog(null, "A data é um campo obrigatório!", "Aviso", JOptionPane.WARNING_MESSAGE);
                txtDataNasc.requestFocus();
            }else{
                qry.salvar(this.getDados());
                JOptionPane.showMessageDialog(null, "Cliente inserido com sucesso!!!");
                this.LimparCampos();
                HabilitarBotoes();
                DesabilitarCampos();
            }
        }else{  //EDITA
            qry.editar(this.getDados(), txtCodigo.getText());
            JOptionPane.showMessageDialog(null, "Cliente editado com sucesso!!!");
            press_edit = false;
            this.LimparCampos();
            HabilitarBotoes();
            DesabilitarCampos();
        }*/
    }//GEN-LAST:event_btnUsuarioSalvarActionPerformed

    private void btnUsuarioDesfazerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuarioDesfazerActionPerformed
        /*LimparCampos();
        DesabilitarCampos();
        HabilitarBotoes();
        press_edit = false;*/
    }//GEN-LAST:event_btnUsuarioDesfazerActionPerformed

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
            java.util.logging.Logger.getLogger(frmCadUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCadUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCadUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCadUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frmCadUsuario dialog = new frmCadUsuario(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUsuarioDesfazer;
    private javax.swing.JButton btnUsuarioEditar;
    private javax.swing.JButton btnUsuarioExcluir;
    private javax.swing.JButton btnUsuarioInserir;
    private javax.swing.JButton btnUsuarioPesquisar;
    private javax.swing.JButton btnUsuarioSair;
    private javax.swing.JButton btnUsuarioSalvar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbbUsuarioPerfil;
    private javax.swing.JRadioButton jrbUsuarioAtivo;
    private javax.swing.JRadioButton jrbUsuarioInativo;
    private javax.swing.JSeparator jspUsuario1;
    private javax.swing.JSeparator jspUsuario2;
    private javax.swing.JLabel lblUsuarioConfSenha;
    private javax.swing.JLabel lblUsuarioNome;
    private javax.swing.JLabel lblUsuarioPerfil;
    private javax.swing.JLabel lblUsuarioSenha;
    private javax.swing.JLabel lblUsuarioUsuario;
    private javax.swing.JPanel pnlCadUsuario1;
    private javax.swing.JPanel pnlCadUsuario2;
    private javax.swing.JPanel pnlUsuarioDados;
    private javax.swing.JPanel pnlUsuarioStatus;
    private javax.swing.JTextField txtUsuarioConfSenha;
    private javax.swing.JTextField txtUsuarioNome;
    private javax.swing.JTextField txtUsuarioSenha;
    private javax.swing.JTextField txtUsuarioUsuario;
    // End of variables declaration//GEN-END:variables
}