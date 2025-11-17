/*generalização das tabelas de ver todos os dados*/
package view;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.SQLException;

public class VisualizarDados extends JFrame {

    private JTable tabela;
    private JScrollPane scroll;

    public VisualizarDados(ResultSet rs, String titulo) {
        setTitle("Visualização - " + titulo);
        setSize(600, 400);
        setLocationRelativeTo(null);

        tabela = new JTable();
        scroll = new JScrollPane(tabela);
        add(scroll);

        preencherTabela(rs);
        setVisible(true);
    }

    private void preencherTabela(ResultSet rs) {
        try {
            var meta = rs.getMetaData();
            int colunas = meta.getColumnCount();

            // cria tabela
            DefaultTableModel modelo = new DefaultTableModel();

            // adiciona nomes das colunas
            for (int i = 1; i <= colunas; i++) {
                modelo.addColumn(meta.getColumnName(i));
            }

            // linhas
            while (rs.next()) {
                Object[] linha = new Object[colunas];
                for (int i = 1; i <= colunas; i++) {
                    linha[i - 1] = rs.getObject(i);
                }
                modelo.addRow(linha);
            }

            tabela.setModel(modelo);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Erro ao montar tabela: " + e.getMessage());
        }
    }
}
