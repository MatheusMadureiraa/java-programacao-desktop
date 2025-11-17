package view;

import controller.ServicoDAO;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import model.Servico;
import util.JDBCUtil;
import util.Database;

public class JanelaServico extends javax.swing.JFrame {
    Database db = new Database();
    ServicoDAO dao = null;

    public JanelaServico() {
        initComponents();
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSalvar = new javax.swing.JButton();
        btnUltimo = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPreco = new javax.swing.JTextField();
        voltar = new javax.swing.JButton();
        btnAbreBanco = new javax.swing.JButton();
        btnVisualizarPorID = new javax.swing.JButton();
        btnPrimeiro = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();
        btnVisualizar = new javax.swing.JButton();
        title = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtDescricao = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDuracao = new javax.swing.JTextField();
        btnAnterior = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        btnProximo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnSalvar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSalvar.setText("Cadastrar");
        btnSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalvarMouseClicked(evt);
            }
        });
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnUltimo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnUltimo.setText("Último");
        btnUltimo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUltimoMouseClicked(evt);
            }
        });
        btnUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUltimoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Id:");

        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Duração (dias)");

        txtPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecoActionPerformed(evt);
            }
        });

        voltar.setText("Home");
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });

        btnAbreBanco.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAbreBanco.setText("Abre BD");
        btnAbreBanco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAbreBancoMouseClicked(evt);
            }
        });
        btnAbreBanco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbreBancoActionPerformed(evt);
            }
        });

        btnVisualizarPorID.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnVisualizarPorID.setText("Visualizar pelo id");
        btnVisualizarPorID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVisualizarPorIDMouseClicked(evt);
            }
        });
        btnVisualizarPorID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualizarPorIDActionPerformed(evt);
            }
        });

        btnPrimeiro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPrimeiro.setText("Primeiro");
        btnPrimeiro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPrimeiroMouseClicked(evt);
            }
        });
        btnPrimeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrimeiroActionPerformed(evt);
            }
        });

        btnAlterar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAlterar.setText("Alterar pelo id");
        btnAlterar.setActionCommand("Atualizar pelo id");
        btnAlterar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAlterarMouseClicked(evt);
            }
        });
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnDeletar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDeletar.setText("Deletar pelo id");
        btnDeletar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeletarMouseClicked(evt);
            }
        });
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });

        btnVisualizar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnVisualizar.setText("Visualizar Todos");
        btnVisualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVisualizarMouseClicked(evt);
            }
        });
        btnVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualizarActionPerformed(evt);
            }
        });

        title.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        title.setText("TELA DE SERVIÇOS");
        title.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Descrição");

        txtDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescricaoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Preço:");

        txtDuracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDuracaoActionPerformed(evt);
            }
        });

        btnAnterior.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAnterior.setText("Anterior");
        btnAnterior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAnteriorMouseClicked(evt);
            }
        });
        btnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorActionPerformed(evt);
            }
        });

        btnNovo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNovoMouseClicked(evt);
            }
        });
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnProximo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnProximo.setText("Próximo");
        btnProximo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProximoMouseClicked(evt);
            }
        });
        btnProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProximoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnVisualizarPorID, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVisualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(voltar)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnAbreBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 803, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtDuracao))
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtPreco))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(btnPrimeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(55, 55, 55)
                            .addComponent(btnAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnProximo, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(55, 55, 55)
                            .addComponent(btnUltimo, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(title)
                .addGap(342, 342, 342))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPrimeiro)
                    .addComponent(btnAnterior)
                    .addComponent(btnProximo)
                    .addComponent(btnUltimo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtDuracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAbreBanco)
                    .addComponent(btnNovo)
                    .addComponent(btnSalvar)
                    .addComponent(btnAlterar)
                    .addComponent(btnDeletar))
                .addGap(18, 18, 18)
                .addComponent(btnVisualizar)
                .addGap(18, 18, 18)
                .addComponent(btnVisualizarPorID)
                .addGap(53, 53, 53)
                .addComponent(voltar)
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalvarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalvarMouseClicked

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        Servico cli = CarregaServico();
        if (dao.Inserir(cli)) {
            JOptionPane.showMessageDialog(this, "Servico inserido com sucesso.");
            btnPrimeiroActionPerformed(evt);
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao inserir Servico.");
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnUltimoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUltimoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUltimoMouseClicked

    private void btnUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimoActionPerformed
        if (JDBCUtil.MovUltimo(dao.getRsdados())) {
            ExibeRegistro(dao.getServico());
        } else {
            JOptionPane.showMessageDialog(this, "O ultimo registro ja esta selecionado.");
        }
    }//GEN-LAST:event_btnUltimoActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void txtPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecoActionPerformed

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
        db.FechaConexao();
        new telaInicial();
        this.dispose();
    }//GEN-LAST:event_voltarActionPerformed

    private void btnAbreBancoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAbreBancoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAbreBancoMouseClicked

    private void btnAbreBancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbreBancoActionPerformed
        if (db.CriaConexao()) {
            dao = new ServicoDAO(db.getConnection());
            if (dao.ConsultarTodos()) {
                if (JDBCUtil.MovPrimeiro(dao.getRsdados())) {
                    ExibeRegistro(dao.getServico());
                }
            }
        }
    }//GEN-LAST:event_btnAbreBancoActionPerformed

    private void btnVisualizarPorIDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVisualizarPorIDMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVisualizarPorIDMouseClicked

    private void btnVisualizarPorIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizarPorIDActionPerformed
        int id = Integer.parseInt(txtId.getText());
        Servico cli = dao.BuscarPorId(id);

        if (cli == null) {
            JOptionPane.showMessageDialog(this, "Servico não encontrado.");
            return;
        }
        ExibeRegistro(cli);
    }//GEN-LAST:event_btnVisualizarPorIDActionPerformed

    private void btnPrimeiroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrimeiroMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPrimeiroMouseClicked

    private void btnPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimeiroActionPerformed
        if (JDBCUtil.MovPrimeiro(dao.getRsdados())) {
            ExibeRegistro(dao.getServico());
        } else {
            JOptionPane.showMessageDialog(this, "O primeiro registro ja esta selecionado.");
        }
    }//GEN-LAST:event_btnPrimeiroActionPerformed

    private void btnAlterarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAlterarMouseClicked

    }//GEN-LAST:event_btnAlterarMouseClicked

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        try {
            int id = Integer.parseInt(txtId.getText());
            Servico srv = dao.BuscarPorId(id);

            if (srv == null) {
                JOptionPane.showMessageDialog(this, "Serviço não encontrado.");
                return;
            }

            // formulário
            JPanel panel = new JPanel(new GridLayout(3, 2, 10, 10));
            panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

            JTextField descricaoField = new JTextField(srv.getDescricao(), 20);
            JTextField precoField = new JTextField(String.valueOf(srv.getPreco()), 20);
            JTextField duracaoField = new JTextField(String.valueOf(srv.getDuracaoDias()), 20);

            panel.add(new JLabel("Descrição:"));
            panel.add(descricaoField);

            panel.add(new JLabel("Preço:"));
            panel.add(precoField);

            panel.add(new JLabel("Duração (dias):"));
            panel.add(duracaoField);

            int result = JOptionPane.showConfirmDialog(
                this,
                panel,
                "Alterar Serviço (ID " + id + ")",
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.PLAIN_MESSAGE
            );

            if (result == JOptionPane.OK_OPTION) {

                // atualiza o objeto
                srv.setDescricao(descricaoField.getText().trim());
                srv.setPreco(Double.parseDouble(precoField.getText().trim()));
                srv.setDuracaoDias(Integer.parseInt(duracaoField.getText().trim()));

                // atualiza no banco
                if (dao.Alterar(srv)) {
                    JOptionPane.showMessageDialog(this, "Serviço alterado com sucesso.");
                    btnPrimeiroActionPerformed(evt);
                } else {
                    JOptionPane.showMessageDialog(this, "Erro ao alterar serviço.");
                }
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Valores inválidos! Verifique ID, preço ou duração.");
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnDeletarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeletarMouseClicked

    }//GEN-LAST:event_btnDeletarMouseClicked

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        Servico cli = CarregaServico();
        if (dao.Excluir(cli)) {
            JOptionPane.showMessageDialog(this, "Servico excluído com sucesso.");
            btnPrimeiroActionPerformed(evt);
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao excluir Servico.");
        }
    }//GEN-LAST:event_btnDeletarActionPerformed

    private void btnVisualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVisualizarMouseClicked

    }//GEN-LAST:event_btnVisualizarMouseClicked

    private void btnVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizarActionPerformed
        if (dao.ConsultarTodos()) {
            new VisualizarDados(dao.getRsdados(), "Clientes");
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao consultar clientes.");
        }
    }//GEN-LAST:event_btnVisualizarActionPerformed

    private void txtDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescricaoActionPerformed

    private void txtDuracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDuracaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDuracaoActionPerformed

    private void btnAnteriorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAnteriorMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAnteriorMouseClicked

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        if (JDBCUtil.MovAnterior(dao.getRsdados())) {
            ExibeRegistro(dao.getServico());
        } else {
            JOptionPane.showMessageDialog(this, "Nao existe registro anterior.");
        }
    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void btnNovoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNovoMouseClicked

    }//GEN-LAST:event_btnNovoMouseClicked

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        txtId.setText("");
        txtDescricao.setText("");
        txtPreco.setText("");
        txtDuracao.setText("");
        txtId.requestFocus();
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnProximoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProximoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProximoMouseClicked

    private void btnProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProximoActionPerformed
        if (JDBCUtil.MovProximo(dao.getRsdados())) {
            ExibeRegistro(dao.getServico());
        } else {
            JOptionPane.showMessageDialog(this, "Nao existe proximo elemento.");
        }
    }//GEN-LAST:event_btnProximoActionPerformed


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new JanelaServico().setVisible(true));
    }
    
    // auxiliares
    public void ExibeRegistro(Servico serv) {
        txtId.setText(String.valueOf(serv.getId()));
        txtDescricao.setText(serv.getDescricao());
        txtPreco.setText(String.valueOf(serv.getPreco()));
        txtDuracao.setText(String.valueOf(serv.getDuracaoDias()));
    }
    
    public Servico CarregaServico() {
        int id = Integer.parseInt(txtId.getText());
        String descricao = txtDescricao.getText();
        double preco = Double.parseDouble(txtPreco.getText());
        int duracao = Integer.parseInt(txtDuracao.getText());
        
        return new Servico(id, descricao, preco, duracao);
}
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbreBanco;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPrimeiro;
    private javax.swing.JButton btnProximo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnUltimo;
    private javax.swing.JButton btnVisualizar;
    private javax.swing.JButton btnVisualizarPorID;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel title;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtDuracao;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtPreco;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
}
