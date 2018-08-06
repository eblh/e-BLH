package Visão;

public class frmCadMae extends javax.swing.JDialog {

    public frmCadMae(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null); // Iniciar form centralizado
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlCadMae2 = new javax.swing.JPanel();
        btnMaeExcluir = new javax.swing.JButton();
        btnMaeInserir = new javax.swing.JButton();
        btnMaeEditar = new javax.swing.JButton();
        btnMaePesquisar = new javax.swing.JButton();
        btnMaeSair = new javax.swing.JButton();
        jspMae2 = new javax.swing.JSeparator();
        jspMae1 = new javax.swing.JSeparator();
        btnMaeSalvar = new javax.swing.JButton();
        btnMaeDesfazer = new javax.swing.JButton();
        jtpCadMae1 = new javax.swing.JTabbedPane();
        pnlCadMaeDados = new javax.swing.JPanel();
        pnlMaeDados = new javax.swing.JPanel();
        lblMaeBairro = new javax.swing.JLabel();
        txtMaeBairro = new javax.swing.JTextField();
        lblMaeCidade = new javax.swing.JLabel();
        txtMaeCidade = new javax.swing.JTextField();
        lblMaeEstado = new javax.swing.JLabel();
        cbbMaeEstado = new javax.swing.JComboBox<>();
        txtMaeLograd1 = new javax.swing.JTextField();
        lblMaeNum = new javax.swing.JLabel();
        txtMaeLograd = new javax.swing.JTextField();
        lblMaeLogradouro = new javax.swing.JLabel();
        txtMaeCEP = new javax.swing.JFormattedTextField();
        lblMaeCEP = new javax.swing.JLabel();
        lblMaeMae = new javax.swing.JLabel();
        txtMaeMae = new javax.swing.JTextField();
        lblMaeDN = new javax.swing.JLabel();
        txtMaeDN = new javax.swing.JFormattedTextField();
        txtMaeIdade = new javax.swing.JTextField();
        lblMaeIdade = new javax.swing.JLabel();
        lblMaeNatur = new javax.swing.JLabel();
        txtMaeNatur = new javax.swing.JTextField();
        txtMaeTelFixo1 = new javax.swing.JFormattedTextField();
        lblMaeTelFixo1 = new javax.swing.JLabel();
        txtMaeTelFixo = new javax.swing.JFormattedTextField();
        lblMaeTelFixo = new javax.swing.JLabel();
        txtMaeCNS = new javax.swing.JTextField();
        lblMaeCNS = new javax.swing.JLabel();
        lblMaeCod = new javax.swing.JLabel();
        txtMaeCod = new javax.swing.JFormattedTextField();
        lblMaeNome = new javax.swing.JLabel();
        txtMaeNome = new javax.swing.JTextField();
        pnlCadMaeEscola = new javax.swing.JPanel();
        pnlCadMaeSoro = new javax.swing.JPanel();
        pnlCadMaeBebe = new javax.swing.JPanel();
        pnlCadMaeAdicio = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro da Mãe");

        pnlCadMae2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnMaeExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Excluir.png"))); // NOI18N
        btnMaeExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnMaeExcluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMaeExcluir.setOpaque(false);
        btnMaeExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaeExcluirActionPerformed(evt);
            }
        });

        btnMaeInserir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Inserir.png"))); // NOI18N
        btnMaeInserir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnMaeInserir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMaeInserir.setOpaque(false);
        btnMaeInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaeInserirActionPerformed(evt);
            }
        });

        btnMaeEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Editar.png"))); // NOI18N
        btnMaeEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnMaeEditar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMaeEditar.setOpaque(false);
        btnMaeEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaeEditarActionPerformed(evt);
            }
        });

        btnMaePesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Pesquisar.png"))); // NOI18N
        btnMaePesquisar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnMaePesquisar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMaePesquisar.setOpaque(false);
        btnMaePesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaePesquisarActionPerformed(evt);
            }
        });

        btnMaeSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Sair.png"))); // NOI18N
        btnMaeSair.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnMaeSair.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMaeSair.setOpaque(false);
        btnMaeSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaeSairActionPerformed(evt);
            }
        });

        jspMae2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jspMae1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        btnMaeSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Salvar.png"))); // NOI18N
        btnMaeSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnMaeSalvar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMaeSalvar.setOpaque(false);
        btnMaeSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaeSalvarActionPerformed(evt);
            }
        });

        btnMaeDesfazer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Desfazer.png"))); // NOI18N
        btnMaeDesfazer.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnMaeDesfazer.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMaeDesfazer.setOpaque(false);
        btnMaeDesfazer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaeDesfazerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlCadMae2Layout = new javax.swing.GroupLayout(pnlCadMae2);
        pnlCadMae2.setLayout(pnlCadMae2Layout);
        pnlCadMae2Layout.setHorizontalGroup(
            pnlCadMae2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCadMae2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(btnMaeInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnMaeEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnMaeExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnMaeSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnMaeDesfazer, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jspMae1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMaePesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jspMae2, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMaeSair, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlCadMae2Layout.setVerticalGroup(
            pnlCadMae2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCadMae2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCadMae2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jspMae2)
                    .addComponent(btnMaePesquisar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                    .addComponent(btnMaeExcluir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMaeSair, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jspMae1)
                    .addComponent(btnMaeSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMaeDesfazer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMaeEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMaeInserir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jtpCadMae1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        pnlMaeDados.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("Dados da Doadora"), "Dados da Doadora"));

        lblMaeBairro.setText("Bairro *");

        txtMaeBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaeBairroActionPerformed(evt);
            }
        });

        lblMaeCidade.setText("Cidade *");

        txtMaeCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaeCidadeActionPerformed(evt);
            }
        });

        lblMaeEstado.setText("Estado *");

        cbbMaeEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Selecione -", "Acre", "Alagoas", "Amapá", "Amazonas", "Bahia", "Ceará", "Distrito Federal", "Espírito Santo", "Goiás", "Maranhão", "Mato Grosso", "Mato Grosso do Sul", "Minas Gerais", "Pará", "Paraíba", "Paraná", "Pernambuco", "Piauí", "Rio de Janeiro", "Rio Grande do Norte", "Rio Grande do Sul", "Rondônia", "Roraima", "Santa Catarina", "São Paulo", "Sergipe", "Tocantins" }));

        txtMaeLograd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaeLograd1ActionPerformed(evt);
            }
        });

        lblMaeNum.setText("Nº *");

        txtMaeLograd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaeLogradActionPerformed(evt);
            }
        });

        lblMaeLogradouro.setText("Logradouro *");

        try {
            txtMaeCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lblMaeCEP.setText("CEP *");

        lblMaeMae.setText("Nome da Mãe da Doadora *");

        txtMaeMae.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaeMaeActionPerformed(evt);
            }
        });

        lblMaeDN.setText("Data de Nascimento *");
        lblMaeDN.setToolTipText("");

        try {
            txtMaeDN.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lblMaeIdade.setText("ANOS");
        lblMaeIdade.setToolTipText("");

        lblMaeNatur.setText("Naturalidade *");

        try {
            txtMaeTelFixo1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lblMaeTelFixo1.setText("Telefone Celular *");

        try {
            txtMaeTelFixo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lblMaeTelFixo.setText("Telefone Fixo *");

        lblMaeCNS.setText("CNS *");
        lblMaeCNS.setToolTipText("");

        lblMaeCod.setText("Código *");
        lblMaeCod.setToolTipText("");

        try {
            txtMaeCod.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lblMaeNome.setText("Nome *");

        javax.swing.GroupLayout pnlMaeDadosLayout = new javax.swing.GroupLayout(pnlMaeDados);
        pnlMaeDados.setLayout(pnlMaeDadosLayout);
        pnlMaeDadosLayout.setHorizontalGroup(
            pnlMaeDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMaeDadosLayout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addGroup(pnlMaeDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblMaeCod)
                    .addComponent(lblMaeMae)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMaeDadosLayout.createSequentialGroup()
                        .addGroup(pnlMaeDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlMaeDadosLayout.createSequentialGroup()
                                .addGroup(pnlMaeDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMaeCNS, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblMaeCNS)
                                    .addGroup(pnlMaeDadosLayout.createSequentialGroup()
                                        .addComponent(txtMaeDN, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtMaeIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblMaeIdade)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMaeDadosLayout.createSequentialGroup()
                                .addComponent(lblMaeDN)
                                .addGap(192, 192, 192)))
                        .addGroup(pnlMaeDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMaeNatur)
                            .addGroup(pnlMaeDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtMaeNatur)
                                .addGroup(pnlMaeDadosLayout.createSequentialGroup()
                                    .addGroup(pnlMaeDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtMaeTelFixo, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblMaeTelFixo))
                                    .addGap(18, 18, 18)
                                    .addGroup(pnlMaeDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblMaeTelFixo1)
                                        .addComponent(txtMaeTelFixo1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMaeDadosLayout.createSequentialGroup()
                                .addGap(151, 151, 151)
                                .addGroup(pnlMaeDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblMaeNum)
                                    .addComponent(txtMaeLograd1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(pnlMaeDadosLayout.createSequentialGroup()
                        .addComponent(lblMaeCEP)
                        .addGap(87, 87, 87)
                        .addComponent(lblMaeLogradouro))
                    .addGroup(pnlMaeDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(pnlMaeDadosLayout.createSequentialGroup()
                            .addComponent(txtMaeCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtMaeLograd, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txtMaeMae, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlMaeDadosLayout.createSequentialGroup()
                        .addGroup(pnlMaeDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlMaeDadosLayout.createSequentialGroup()
                                .addComponent(txtMaeBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtMaeCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlMaeDadosLayout.createSequentialGroup()
                                .addComponent(lblMaeBairro)
                                .addGap(173, 173, 173)
                                .addComponent(lblMaeCidade)))
                        .addGap(18, 18, 18)
                        .addGroup(pnlMaeDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMaeEstado)
                            .addComponent(cbbMaeEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMaeDadosLayout.createSequentialGroup()
                        .addComponent(txtMaeCod, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlMaeDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMaeNome)
                            .addComponent(txtMaeNome, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(57, 57, 57))
        );
        pnlMaeDadosLayout.setVerticalGroup(
            pnlMaeDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMaeDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlMaeDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMaeCod)
                    .addComponent(lblMaeNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlMaeDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtMaeNome, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(txtMaeCod))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlMaeDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlMaeDadosLayout.createSequentialGroup()
                        .addComponent(lblMaeCNS)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMaeCNS, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlMaeDadosLayout.createSequentialGroup()
                        .addGroup(pnlMaeDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMaeTelFixo)
                            .addComponent(lblMaeTelFixo1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlMaeDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMaeTelFixo)
                            .addComponent(txtMaeTelFixo1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlMaeDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMaeDN)
                    .addComponent(lblMaeNatur))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlMaeDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMaeDN, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMaeIdade)
                    .addComponent(txtMaeNatur, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaeIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblMaeMae)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMaeMae, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlMaeDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMaeCEP)
                    .addComponent(lblMaeLogradouro)
                    .addComponent(lblMaeNum))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlMaeDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMaeCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaeLograd, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaeLograd1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlMaeDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMaeBairro)
                    .addComponent(lblMaeCidade)
                    .addComponent(lblMaeEstado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlMaeDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMaeBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaeCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbMaeEstado))
                .addGap(162, 162, 162))
        );

        lblMaeNome.getAccessibleContext().setAccessibleName("Nome *");

        javax.swing.GroupLayout pnlCadMaeDadosLayout = new javax.swing.GroupLayout(pnlCadMaeDados);
        pnlCadMaeDados.setLayout(pnlCadMaeDadosLayout);
        pnlCadMaeDadosLayout.setHorizontalGroup(
            pnlCadMaeDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCadMaeDadosLayout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addComponent(pnlMaeDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
        pnlCadMaeDadosLayout.setVerticalGroup(
            pnlCadMaeDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCadMaeDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlMaeDados, javax.swing.GroupLayout.PREFERRED_SIZE, 494, Short.MAX_VALUE)
                .addContainerGap())
        );

        jtpCadMae1.addTab("Dados da Mãe", pnlCadMaeDados);

        javax.swing.GroupLayout pnlCadMaeEscolaLayout = new javax.swing.GroupLayout(pnlCadMaeEscola);
        pnlCadMaeEscola.setLayout(pnlCadMaeEscolaLayout);
        pnlCadMaeEscolaLayout.setHorizontalGroup(
            pnlCadMaeEscolaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 740, Short.MAX_VALUE)
        );
        pnlCadMaeEscolaLayout.setVerticalGroup(
            pnlCadMaeEscolaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 516, Short.MAX_VALUE)
        );

        jtpCadMae1.addTab("Escolaridade / Renda", pnlCadMaeEscola);

        javax.swing.GroupLayout pnlCadMaeSoroLayout = new javax.swing.GroupLayout(pnlCadMaeSoro);
        pnlCadMaeSoro.setLayout(pnlCadMaeSoroLayout);
        pnlCadMaeSoroLayout.setHorizontalGroup(
            pnlCadMaeSoroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 740, Short.MAX_VALUE)
        );
        pnlCadMaeSoroLayout.setVerticalGroup(
            pnlCadMaeSoroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 516, Short.MAX_VALUE)
        );

        jtpCadMae1.addTab("Sorologia", pnlCadMaeSoro);

        javax.swing.GroupLayout pnlCadMaeBebeLayout = new javax.swing.GroupLayout(pnlCadMaeBebe);
        pnlCadMaeBebe.setLayout(pnlCadMaeBebeLayout);
        pnlCadMaeBebeLayout.setHorizontalGroup(
            pnlCadMaeBebeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 740, Short.MAX_VALUE)
        );
        pnlCadMaeBebeLayout.setVerticalGroup(
            pnlCadMaeBebeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 516, Short.MAX_VALUE)
        );

        jtpCadMae1.addTab("Dados do Bebê", pnlCadMaeBebe);

        javax.swing.GroupLayout pnlCadMaeAdicioLayout = new javax.swing.GroupLayout(pnlCadMaeAdicio);
        pnlCadMaeAdicio.setLayout(pnlCadMaeAdicioLayout);
        pnlCadMaeAdicioLayout.setHorizontalGroup(
            pnlCadMaeAdicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 740, Short.MAX_VALUE)
        );
        pnlCadMaeAdicioLayout.setVerticalGroup(
            pnlCadMaeAdicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 516, Short.MAX_VALUE)
        );

        jtpCadMae1.addTab("Informações Adicionais", pnlCadMaeAdicio);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlCadMae2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jtpCadMae1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jtpCadMae1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlCadMae2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMaeExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaeExcluirActionPerformed
        /*DAOCliente qry = new DAOCliente();
        qry.excluir(txtCodigo.getText());
        this.LimparCampos();
        HabilitarBotoes();
        JOptionPane.showMessageDialog(null, "Cliente Excluído com Sucesso!!!");*/
    }//GEN-LAST:event_btnMaeExcluirActionPerformed

    private void btnMaeInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaeInserirActionPerformed
        /*HabilitarCampos();
        DesabilitarBotoes();
        txtCodigo.requestFocus();*/
    }//GEN-LAST:event_btnMaeInserirActionPerformed

    private void btnMaeEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaeEditarActionPerformed
        /*press_edit = true;
        DesabilitarBotoes();
        HabilitarCampos();
        txtCodigo.requestFocus(true);*/
    }//GEN-LAST:event_btnMaeEditarActionPerformed

    private void btnMaePesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaePesquisarActionPerformed
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
    }//GEN-LAST:event_btnMaePesquisarActionPerformed

    private void btnMaeSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaeSairActionPerformed
        setVisible(false);
    }//GEN-LAST:event_btnMaeSairActionPerformed

    private void btnMaeSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaeSalvarActionPerformed
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
    }//GEN-LAST:event_btnMaeSalvarActionPerformed

    private void btnMaeDesfazerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaeDesfazerActionPerformed
        /*LimparCampos();
        DesabilitarCampos();
        HabilitarBotoes();
        press_edit = false;*/
    }//GEN-LAST:event_btnMaeDesfazerActionPerformed

    private void txtMaeMaeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaeMaeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaeMaeActionPerformed

    private void txtMaeLogradActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaeLogradActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaeLogradActionPerformed

    private void txtMaeLograd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaeLograd1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaeLograd1ActionPerformed

    private void txtMaeBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaeBairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaeBairroActionPerformed

    private void txtMaeCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaeCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaeCidadeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frmCadMae dialog = new frmCadMae(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnMaeDesfazer;
    private javax.swing.JButton btnMaeEditar;
    private javax.swing.JButton btnMaeExcluir;
    private javax.swing.JButton btnMaeInserir;
    private javax.swing.JButton btnMaePesquisar;
    private javax.swing.JButton btnMaeSair;
    private javax.swing.JButton btnMaeSalvar;
    private javax.swing.JComboBox<String> cbbMaeEstado;
    private javax.swing.JSeparator jspMae1;
    private javax.swing.JSeparator jspMae2;
    private javax.swing.JTabbedPane jtpCadMae1;
    private javax.swing.JLabel lblMaeBairro;
    private javax.swing.JLabel lblMaeCEP;
    private javax.swing.JLabel lblMaeCNS;
    private javax.swing.JLabel lblMaeCidade;
    private javax.swing.JLabel lblMaeCod;
    private javax.swing.JLabel lblMaeDN;
    private javax.swing.JLabel lblMaeEstado;
    private javax.swing.JLabel lblMaeIdade;
    private javax.swing.JLabel lblMaeLogradouro;
    private javax.swing.JLabel lblMaeMae;
    private javax.swing.JLabel lblMaeNatur;
    private javax.swing.JLabel lblMaeNome;
    private javax.swing.JLabel lblMaeNum;
    private javax.swing.JLabel lblMaeTelFixo;
    private javax.swing.JLabel lblMaeTelFixo1;
    private javax.swing.JPanel pnlCadMae2;
    private javax.swing.JPanel pnlCadMaeAdicio;
    private javax.swing.JPanel pnlCadMaeBebe;
    private javax.swing.JPanel pnlCadMaeDados;
    private javax.swing.JPanel pnlCadMaeEscola;
    private javax.swing.JPanel pnlCadMaeSoro;
    private javax.swing.JPanel pnlMaeDados;
    private javax.swing.JTextField txtMaeBairro;
    private javax.swing.JFormattedTextField txtMaeCEP;
    private javax.swing.JTextField txtMaeCNS;
    private javax.swing.JTextField txtMaeCidade;
    private javax.swing.JFormattedTextField txtMaeCod;
    private javax.swing.JFormattedTextField txtMaeDN;
    private javax.swing.JTextField txtMaeIdade;
    private javax.swing.JTextField txtMaeLograd;
    private javax.swing.JTextField txtMaeLograd1;
    private javax.swing.JTextField txtMaeMae;
    private javax.swing.JTextField txtMaeNatur;
    private javax.swing.JTextField txtMaeNome;
    private javax.swing.JFormattedTextField txtMaeTelFixo;
    private javax.swing.JFormattedTextField txtMaeTelFixo1;
    // End of variables declaration//GEN-END:variables
}
