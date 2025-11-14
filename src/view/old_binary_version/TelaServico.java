
package view;

/**
 *
 * @author matheus
 */

import controller.ControllerServicoBinario;
import model.Servico;
import javax.swing.*;
import java.util.ArrayList;

public class TelaServico extends javax.swing.JFrame {
    private final ControllerServicoBinario controller = new ControllerServicoBinario();
    

    public TelaServico() {
        initComponents();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void limparCampos() {
        txtDescricao.setText("");
        txtValor.setText("");
        txtDuracao.setText("");
        txtDescricao.requestFocus();
    }

    private Servico criarServico() {
        try {
            String descricao = txtDescricao.getText();
            double valor = Double.parseDouble(txtValor.getText().trim());
            int duracao = Integer.parseInt(txtDuracao.getText().trim());
            return new Servico(descricao, valor, duracao);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "O valor e a duração devem ser números válidos!", "Erro", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtDescricao = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDuracao = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();
        btnVisualizar = new javax.swing.JButton();
        voltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        title.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        title.setText("TELA DE SERVIÇO");
        title.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Descrição");

        txtDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescricaoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Valor");

        txtValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Duração (min)");

        txtDuracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDuracaoActionPerformed(evt);
            }
        });

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

        btnAtualizar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAtualizar.setText("Atualizar");
        btnAtualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAtualizarMouseClicked(evt);
            }
        });
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        btnDeletar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDeletar.setText("Deletar");
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

        voltar.setText("Home");
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(voltar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(title)
                                .addGap(121, 121, 121))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDuracao, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(105, 105, 105))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(170, 170, 170))))))
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVisualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 86, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jLabel3)))
                .addGap(100, 100, 100))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDuracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAtualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDeletar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVisualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(voltar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescricaoActionPerformed

    private void txtValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorActionPerformed

    private void txtDuracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDuracaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDuracaoActionPerformed

    private void btnSalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalvarMouseClicked
        Servico s = criarServico();
        
        // verifica se teve retorno
        if (s != null) {
            controller.adicionarServico(s);
            JOptionPane.showMessageDialog(this, "Serviço cadastrado com sucesso!");
            limparCampos();
        }
    }//GEN-LAST:event_btnSalvarMouseClicked

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnAtualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAtualizarMouseClicked
        String descricao = txtDescricao.getText().trim();
        String valorStr = txtValor.getText().trim();
        String duracaoStr = txtDuracao.getText().trim();

        if (descricao.isEmpty() || valorStr.isEmpty() || duracaoStr.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Preencha todos os campos para atualizar!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            double valor = Double.parseDouble(valorStr);
            int duracao = Integer.parseInt(duracaoStr);
            ArrayList<Servico> lista = controller.listarServicos();
            boolean encontrado = false;

            for (int i = 0; i < lista.size(); i++) {
                Servico s = lista.get(i);
                if (s.getDescricao().equals(descricao) && s.getPreco() == valor && s.getDuracaoMinutos() == duracao) {
                    try {
                        String novaDescricao = JOptionPane.showInputDialog(this, "Nova descrição:", s.getDescricao());
                        double novoValor = Double.parseDouble(JOptionPane.showInputDialog(this, "Novo valor:", s.getPreco()));
                        int novaDuracao = Integer.parseInt(JOptionPane.showInputDialog(this, "Nova duração (min):", s.getDuracaoMinutos()));

                        if (novaDescricao.isEmpty()) {
                            throw new IllegalArgumentException("A descrição não pode ficar vazia!");
                        }

                        controller.atualizarServico(i, new Servico(novaDescricao, novoValor, novaDuracao));
                        JOptionPane.showMessageDialog(this, "Serviço atualizado com sucesso!");
                        encontrado = true;
                        break;
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(this, "O valor deve ser um número decimal!", "Erro", JOptionPane.ERROR_MESSAGE);
                    } catch (IllegalArgumentException e) {
                        JOptionPane.showMessageDialog(this, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }

            if (!encontrado) {
                JOptionPane.showMessageDialog(this, "Serviço não encontrado!", "Erro", JOptionPane.ERROR_MESSAGE);
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "O valor deve ser um número decimal!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAtualizarMouseClicked

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnDeletarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeletarMouseClicked
        String descricao = txtDescricao.getText().trim();
        String valorStr = txtValor.getText().trim();
        String duracaoStr = txtDuracao.getText().trim();

        if (descricao.isEmpty() || valorStr.isEmpty() || duracaoStr.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Preencha todos os campos para excluir!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            double valor = Double.parseDouble(valorStr);
            int duracao = Integer.parseInt(duracaoStr);
            ArrayList<Servico> lista = controller.listarServicos();
            boolean encontrado = false;

            for (int i = 0; i < lista.size(); i++) {
                Servico s = lista.get(i);
                if (s.getDescricao().equals(descricao) && s.getPreco() == valor && s.getDuracaoMinutos() == duracao) {
                    controller.excluirServico(i);
                    JOptionPane.showMessageDialog(this, "Serviço removido com sucesso!");
                    limparCampos(); // limpa depois de excluir
                    encontrado = true;
                    break;
                }
            }

            if (!encontrado) {
                JOptionPane.showMessageDialog(this, "Serviço não encontrado!", "Erro", JOptionPane.ERROR_MESSAGE);
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "O valor deve ser um número decimal!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnDeletarMouseClicked

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeletarActionPerformed

    private void btnVisualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVisualizarMouseClicked
        ArrayList<Servico> lista = controller.listarServicos();
        if (lista.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nenhum serviço cadastrado!");
            return;
        }

        StringBuilder sb = new StringBuilder("Serviços cadastrados:\n\n");
        for (Servico s : lista) {
            sb.append("Descrição: ").append(s.getDescricao())
              .append("\nValor: R$ ").append(s.getPreco())
              .append("\nDuração: ").append(s.getDuracaoMinutos()).append(" min")
              .append("\n==========\n");
        }

        JOptionPane.showMessageDialog(this, sb.toString());
    }//GEN-LAST:event_btnVisualizarMouseClicked

    private void btnVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVisualizarActionPerformed

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
        new telaInicial();
        this.dispose();
    }//GEN-LAST:event_voltarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new TelaServico().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnVisualizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel title;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtDuracao;
    private javax.swing.JTextField txtValor;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
}
