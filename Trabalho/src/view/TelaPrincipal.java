package view;

import java.io.IOException;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.*;

/**
 *
 * @author Vítor Hugo Trierveiler e João Bernardo Porto
 */
public class TelaPrincipal extends javax.swing.JFrame {

    private final GerenciadorFinanceiro gerenciador;

    public GerenciadorFinanceiro getGerenciador() {
        return gerenciador;
    }

    /**
     * Creates new form TelaPrincipal
     *
     * @param gerenciador
     */
    public TelaPrincipal(GerenciadorFinanceiro gerenciador) {
        this.gerenciador = gerenciador;
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

        btIncluirReceitas = new javax.swing.JButton();
        btIncluirDespesas = new javax.swing.JButton();
        btConsultarSaldoAtual = new javax.swing.JButton();
        btConsultarSaldoReal = new javax.swing.JButton();
        btListarReceitas = new javax.swing.JButton();
        btListarDespesas = new javax.swing.JButton();
        btListarLancamentos = new javax.swing.JButton();
        btApagarDados = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btIncluirReceitas.setText("Incluir Receitas");
        btIncluirReceitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btIncluirReceitasActionPerformed(evt);
            }
        });

        btIncluirDespesas.setText("Incluir Despesas");
        btIncluirDespesas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btIncluirDespesasActionPerformed(evt);
            }
        });

        btConsultarSaldoAtual.setText("Consultar Saldo Atual");
        btConsultarSaldoAtual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarSaldoAtualActionPerformed(evt);
            }
        });

        btConsultarSaldoReal.setText("Consultar Saldo Real");
        btConsultarSaldoReal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarSaldoRealActionPerformed(evt);
            }
        });

        btListarReceitas.setText("Listar Receitas");
        btListarReceitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btListarReceitasActionPerformed(evt);
            }
        });

        btListarDespesas.setText("Listar Despesas");
        btListarDespesas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btListarDespesasActionPerformed(evt);
            }
        });

        btListarLancamentos.setText("Listar Lançamentos");
        btListarLancamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btListarLancamentosActionPerformed(evt);
            }
        });

        btApagarDados.setText("Apagar Dados Salvos");
        btApagarDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btApagarDadosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btIncluirReceitas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btIncluirDespesas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btConsultarSaldoAtual)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btConsultarSaldoReal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btListarReceitas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btListarDespesas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btListarLancamentos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btApagarDados)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btIncluirReceitas)
                    .addComponent(btIncluirDespesas)
                    .addComponent(btConsultarSaldoAtual)
                    .addComponent(btConsultarSaldoReal)
                    .addComponent(btListarReceitas)
                    .addComponent(btListarDespesas)
                    .addComponent(btListarLancamentos)
                    .addComponent(btApagarDados))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btIncluirReceitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btIncluirReceitasActionPerformed
        TelaIncluirReceitas tlIR = new TelaIncluirReceitas(this, true, gerenciador);
        tlIR.setVisible(true);
    }//GEN-LAST:event_btIncluirReceitasActionPerformed

    private void btIncluirDespesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btIncluirDespesasActionPerformed
        TelaIncluirDespesas tlID = new TelaIncluirDespesas(this, true, gerenciador);
        tlID.setVisible(true);
    }//GEN-LAST:event_btIncluirDespesasActionPerformed

    private void btConsultarSaldoAtualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarSaldoAtualActionPerformed
        JOptionPane.showMessageDialog(this, "Seu saldo atual é: R$" + gerenciador.getSaldoAtual(LocalDate.now()));
    }//GEN-LAST:event_btConsultarSaldoAtualActionPerformed

    private void btConsultarSaldoRealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarSaldoRealActionPerformed
        JOptionPane.showMessageDialog(this, "Seu saldo real é: R$" + gerenciador.getSaldoTotal());
    }//GEN-LAST:event_btConsultarSaldoRealActionPerformed

    private void btListarReceitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btListarReceitasActionPerformed
        if (gerenciador.getReceitas().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nenhuma receita cadastrada");
            return;
        }

        TelaListaReceitas tlr = new TelaListaReceitas(this, true, gerenciador);
        tlr.setVisible(true);
    }//GEN-LAST:event_btListarReceitasActionPerformed

    private void btListarDespesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btListarDespesasActionPerformed
        if (gerenciador.getDespesas().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nenhuma despesa cadastrada");
            return;
        }

        TelaListaDespesas tld = new TelaListaDespesas(this, true, gerenciador);
        tld.setVisible(true);
    }//GEN-LAST:event_btListarDespesasActionPerformed

    private void btListarLancamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btListarLancamentosActionPerformed
        if (gerenciador.listarLancamentosOrdenados().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nenhum lançamento cadastrado");
            return;
        }

        TelaListaLancamentos tll = new TelaListaLancamentos(this, true, gerenciador);
        tll.setVisible(true);
    }//GEN-LAST:event_btListarLancamentosActionPerformed

    private void btApagarDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btApagarDadosActionPerformed
        if (gerenciador.listarLancamentosOrdenados().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Não há dados cadastrados.");
            return;
        }

        if (JOptionPane.showConfirmDialog(this, "Tem Certeza?", "Apagar dados", 2) == 0) {
            try {
                ArquivoCSV.apagarDados("src\\model\\despesas.csv");
                ArquivoCSV.apagarDados("src\\model\\receitas.csv");
                gerenciador.getDespesas().clear();
                gerenciador.getReceitas().clear();
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Erro ao apagar arquivo");
            }
        }
    }//GEN-LAST:event_btApagarDadosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                GerenciadorFinanceiro gerenciador = new GerenciadorFinanceiro();
                try {
                    for (Receita r : ArquivoCSV.carregarReceitas("src\\model\\receitas.csv")) {
                        gerenciador.adicionarReceita(r);
                    }
                } catch (IOException ex) {
                    Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    for (Despesa d : ArquivoCSV.carregarDespesas("src\\model\\despesas.csv")) {
                        gerenciador.adicionarDespesa(d);
                    }
                } catch (IOException ex) {
                    Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }
                new TelaPrincipal(gerenciador).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btApagarDados;
    private javax.swing.JButton btConsultarSaldoAtual;
    private javax.swing.JButton btConsultarSaldoReal;
    private javax.swing.JButton btIncluirDespesas;
    private javax.swing.JButton btIncluirReceitas;
    private javax.swing.JButton btListarDespesas;
    private javax.swing.JButton btListarLancamentos;
    private javax.swing.JButton btListarReceitas;
    // End of variables declaration//GEN-END:variables
}
