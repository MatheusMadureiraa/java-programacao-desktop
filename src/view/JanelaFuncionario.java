package view;

import dao.FuncionarioDAO;
import model.Funcionario;
import util.JDBCUtil;
import javax.swing.JOptionPane;

public class JanelaFuncionario extends javax.swing.JFrame {

    FuncionarioDAO dao = new FuncionarioDAO();

    public JanelaFuncionario() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        label1 = new javax.swing.JLabel();
        label3 = new javax.swing.JLabel();
        label4 = new javax.swing.JLabel();
        label5 = new javax.swing.JLabel();
        label6 = new javax.swing.JLabel();
        btn_primeiro = new javax.swing.JButton();
        btn_anterior = new javax.swing.JButton();
        btn_proximo = new javax.swing.JButton();
        btn_ultimo = new javax.swing.JButton();
        jTF_id = new javax.swing.JTextField();
        jTF_nome = new javax.swing.JTextField();
        jTF_telefone = new javax.swing.JTextField();
        jTF_salario = new javax.swing.JTextField();
        jTF_cargo = new javax.swing.JTextField();
        btn_abrebanco = new javax.swing.JButton();
        btn_inserir = new javax.swing.JButton();
        btn_alterar = new javax.swing.JButton();
        btn_excluir = new javax.swing.JButton();
        btn_novo = new javax.swing.JButton();
        btn_fechar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gerenciamento de Funcionários");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        label1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label1.setText("Id:");

        label3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label3.setText("Nome:");

        label4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label4.setText("Telefone:");

        label5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label5.setText("Salário:");

        label6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label6.setText("Cargo:");

        btn_primeiro.setText("Primeiro");
        btn_primeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_primeiroActionPerformed(evt);
            }
        });

        btn_anterior.setText("Anterior");
        btn_anterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_anteriorActionPerformed(evt);
            }
        });

        btn_proximo.setText("Próximo");
        btn_proximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_proximoActionPerformed(evt);
            }
        });

        btn_ultimo.setText("Último");
        btn_ultimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ultimoActionPerformed(evt);
            }
        });

        btn_abrebanco.setText("Abre BD");
        btn_abrebanco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_abrebancoActionPerformed(evt);
            }
        });

        btn_inserir.setText("Inserir");
        btn_inserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inserirActionPerformed(evt);
            }
        });

        btn_alterar.setText("Alterar");
        btn_alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_alterarActionPerformed(evt);
            }
        });

        btn_excluir.setText("Excluir");
        btn_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_excluirActionPerformed(evt);
            }
        });

        btn_novo.setText("Novo");
        btn_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_novoActionPerformed(evt);
            }
        });

        btn_fechar.setText("Fechar");
        btn_fechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_fecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTF_nome)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTF_id, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTF_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTF_salario, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTF_cargo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(btn_primeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btn_anterior, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btn_proximo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btn_ultimo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_abrebanco, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_novo, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_inserir, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_alterar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_fechar, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_primeiro)
                    .addComponent(btn_anterior)
                    .addComponent(btn_proximo)
                    .addComponent(btn_ultimo))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTF_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTF_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTF_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTF_salario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTF_cargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_abrebanco)
                    .addComponent(btn_inserir)
                    .addComponent(btn_alterar)
                    .addComponent(btn_excluir)
                    .addComponent(btn_novo)
                    .addComponent(btn_fechar))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>

    private void btn_primeiroActionPerformed(java.awt.event.ActionEvent evt) {
        if (JDBCUtil.MovPrimeiro(dao.getRsdados())) {
            ExibeRegistro(dao.getFuncionario());
        } else {
            JOptionPane.showMessageDialog(this, "O primeiro registro ja esta selecionado.");
        }
    }

    private void btn_anteriorActionPerformed(java.awt.event.ActionEvent evt) {
        if (JDBCUtil.MovAnterior(dao.getRsdados())) {
            ExibeRegistro(dao.getFuncionario());
        } else {
            JOptionPane.showMessageDialog(this, "Nao existe registro anterior.");
        }
    }

    private void btn_proximoActionPerformed(java.awt.event.ActionEvent evt) {
        if (JDBCUtil.MovProximo(dao.getRsdados())) {
            ExibeRegistro(dao.getFuncionario());
        } else {
            JOptionPane.showMessageDialog(this, "Nao existe proximo elemento.");
        }
    }

    private void btn_ultimoActionPerformed(java.awt.event.ActionEvent evt) {
        if (JDBCUtil.MovUltimo(dao.getRsdados())) {
            ExibeRegistro(dao.getFuncionario());
        } else {
            JOptionPane.showMessageDialog(this, "O ultimo registro ja esta selecionado.");
        }
    }

    private void btn_abrebancoActionPerformed(java.awt.event.ActionEvent evt) {
        if (dao.CriaConexao()) {
            if (dao.ConsultarTodos()) {
                if (JDBCUtil.MovPrimeiro(dao.getRsdados())) {
                    ExibeRegistro(dao.getFuncionario());
                }
            }
        }
    }

    private void btn_inserirActionPerformed(java.awt.event.ActionEvent evt) {
        Funcionario func = CarregaFuncionario();
        if (dao.Inserir(func)) {
            JOptionPane.showMessageDialog(this, "Funcionário inserido com sucesso.");
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao inserir funcionário.");
        }
    }

    private void btn_novoActionPerformed(java.awt.event.ActionEvent evt) {
        jTF_id.setText("");
        jTF_nome.setText("");
        jTF_telefone.setText("");
        jTF_salario.setText("");
        jTF_cargo.setText("");
        jTF_id.requestFocus();
    }

    private void formWindowClosing(java.awt.event.WindowEvent evt) {
        dao.FechaConexao();
    }

    private void btn_alterarActionPerformed(java.awt.event.ActionEvent evt) {
        Funcionario func = CarregaFuncionario();
        if (dao.Alterar(func)) {
            JOptionPane.showMessageDialog(this, "Funcionário alterado com sucesso.");
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao alterar funcionário.");
        }
    }

    private void btn_excluirActionPerformed(java.awt.event.ActionEvent evt) {
        Funcionario func = CarregaFuncionario();
        if (dao.Excluir(func)) {
            JOptionPane.showMessageDialog(this, "Funcionário excluído com sucesso.");
            btn_primeiroActionPerformed(evt);
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao excluir funcionário.");
        }
    }

    private void btn_fecharActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
    }

    public void ExibeRegistro(Funcionario func) {
        jTF_id.setText(String.valueOf(func.getId()));
        jTF_nome.setText(func.getNome());
        jTF_telefone.setText(func.getTelefone());
        jTF_salario.setText(String.valueOf(func.getSalario()));
        jTF_cargo.setText(func.getCargo());
    }

    public Funcionario CarregaFuncionario() {
        int id = Integer.valueOf(jTF_id.getText());
        String nome = jTF_nome.getText();
        String telefone = jTF_telefone.getText();
        double salario = Double.valueOf(jTF_salario.getText());
        String cargo = jTF_cargo.getText();
        return new Funcionario(id, nome, telefone, salario, cargo);
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton btn_abrebanco;
    private javax.swing.JButton btn_alterar;
    private javax.swing.JButton btn_anterior;
    private javax.swing.JButton btn_excluir;
    private javax.swing.JButton btn_fechar;
    private javax.swing.JButton btn_inserir;
    private javax.swing.JButton btn_novo;
    private javax.swing.JButton btn_primeiro;
    private javax.swing.JButton btn_proximo;
    private javax.swing.JButton btn_ultimo;
    private javax.swing.JTextField jTF_cargo;
    private javax.swing.JTextField jTF_id;
    private javax.swing.JTextField jTF_nome;
    private javax.swing.JTextField jTF_salario;
    private javax.swing.JTextField jTF_telefone;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel label4;
    private javax.swing.JLabel label5;
    private javax.swing.JLabel label6;
    // End of variables declaration
}
