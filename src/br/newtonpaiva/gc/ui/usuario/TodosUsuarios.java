/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.newtonpaiva.gc.ui;

import static br.newtonpaiva.util.Mensagens.*;
import br.newtowpaiva.modelo.Usuario;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Guilherme
 */
public class TodosUsuarios extends javax.swing.JDialog {

    private Usuario usuarioSelecionado;

    /**
     * Creates new form TodosUsuarios
     * @param parent
     * @param modal
     */
    public TodosUsuarios(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        /*
        * posiciona a tela no centro da tela
         */
        setLocationRelativeTo(parent);
        /*
        * Atualiza a tabela
         */
        atualizarTabela();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabUsuarios = new javax.swing.JTable();
        panBuscar = new javax.swing.JPanel();
        edtNome = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        edtLogin = new javax.swing.JTextField();
        lblLogin = new javax.swing.JLabel();
        edtEmail = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        imgLogo = new javax.swing.JLabel();
        btnNovo = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnAlterarSenha = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Todos usuários");
        setResizable(false);

        tabUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabUsuarios);

        panBuscar.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisar"));

        lblNome.setText("Nome");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        lblLogin.setText("Login");

        lblEmail.setText("E-mail");

        javax.swing.GroupLayout panBuscarLayout = new javax.swing.GroupLayout(panBuscar);
        panBuscar.setLayout(panBuscarLayout);
        panBuscarLayout.setHorizontalGroup(
            panBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBuscarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNome)
                    .addComponent(edtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 186, Short.MAX_VALUE)
                .addGroup(panBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLogin)
                    .addComponent(edtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(166, 166, 166)
                .addGroup(panBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEmail)
                    .addComponent(edtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panBuscarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBuscar)
                .addGap(479, 479, 479))
        );
        panBuscarLayout.setVerticalGroup(
            panBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBuscarLayout.createSequentialGroup()
                .addGroup(panBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panBuscarLayout.createSequentialGroup()
                        .addComponent(lblNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panBuscarLayout.createSequentialGroup()
                        .addComponent(lblLogin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panBuscarLayout.createSequentialGroup()
                        .addComponent(lblEmail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBuscar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        imgLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo.png"))); // NOI18N

        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnAlterarSenha.setText("Alterar Senha");
        btnAlterarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarSenhaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(444, 444, 444)
                .addComponent(imgLogo)
                .addContainerGap(433, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnNovo)
                .addGap(386, 386, 386)
                .addComponent(btnAlterar)
                .addGap(69, 69, 69)
                .addComponent(btnAlterarSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnExcluir))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(imgLogo)
                .addGap(31, 31, 31)
                .addComponent(panBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo)
                    .addComponent(btnAlterar)
                    .addComponent(btnExcluir)
                    .addComponent(btnAlterarSenha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        /*
        * Atualiza a tabela
         */
        atualizarTabela();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int retorno = LinhaSelecionadas();

        if (retorno == -1) {
            JOptionPane.showMessageDialog(null, "Deve selecionar uma linha da grade !");
            return;
        }

        String message = USUARIO_PERGUNTA_EXCLUSAO;
        String title = "Confirmação";
        //Exibe caixa de dialogo (veja figura) solicitando confirmação ou não. 
        //Se o usuário clicar em "Sim" retorna 0 pra variavel reply, se informado não retorna 1
        int reply = JOptionPane.showConfirmDialog(null, message, title, JOptionPane.YES_NO_OPTION);
        if (reply != JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, USUARIO_NAO_EXCLUIDO);
            return;
        }

        /*
         * Chama a classe do usuario
         */
        Usuario u = new Usuario();

        try {
            u = Usuario.buscarPorId(retorno);
            if (u == null) {
                JOptionPane.showMessageDialog(null, USUARIO_NAO_EXISTE);
                return;
            }

        } catch (SQLException ex) {
            Logger.getLogger(TodosUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ERRO_CONEXAO_BANCO);
        }

        try {
            u.excluir(retorno);
            JOptionPane.showMessageDialog(null, USUARIO_EXCLUIDO);
        } catch (SQLException ex) {
            Logger.getLogger(TodosUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ERRO_CONEXAO_BANCO);
        }
        /*
        * Atualiza a tabela
         */
        atualizarTabela();

    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        int retorno = LinhaSelecionadas();

        if (retorno == -1) {
            JOptionPane.showMessageDialog(null, "Deve selecionar uma linha da grade !");
            return;
        }

        /*
        * Chama a tela de Usuarios com o modal
         */
        TelaUsuario Tela = new TelaUsuario(null, true);
        Tela.setTitle(USUARIO_ALTERAR);

        try {

            usuarioSelecionado = Usuario.buscarPorId(retorno);

            if (usuarioSelecionado == null) {
                JOptionPane.showMessageDialog(null, USUARIO_NAO_EXISTE);
                return;
            } else {

                Tela.exibirDados(usuarioSelecionado);

                Tela.setVisible(true);
                /*
                * Atualiza a tabela
                 */
                atualizarTabela();

                JOptionPane.showMessageDialog(null, GERAL_GRADE_ATUALIZADA);
            }
        } catch (SQLException ex) {
            Logger.getLogger(TodosUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ERRO_CONEXAO_BANCO);
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        /*
        * Chama a tela de Contrato com o modal
         */
        TelaUsuario Tela = new TelaUsuario(null, true);
        Tela.setTitle(USUARIO_INCLUIR);
        /*
        * Tela de Contrato visivel
         */
        Tela.setVisible(true);
        /*
        * Atualiza a tabela
         */
        atualizarTabela();

        JOptionPane.showMessageDialog(null, GERAL_GRADE_ATUALIZADA);
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnAlterarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarSenhaActionPerformed
        int retorno = LinhaSelecionadas();

        if (retorno == -1) {
            JOptionPane.showMessageDialog(null, "Deve selecionar uma linha da grade !");
            return;
        }

        try {
            usuarioSelecionado = Usuario.buscarPorId(retorno);

            if (usuarioSelecionado == null) {
                JOptionPane.showMessageDialog(null, USUARIO_NAO_EXISTE);
                return;
            } else {
                /*
                * Chama a tela de Usuarios com o modal
                 */
                TelaAlterarSenha Tela = new TelaAlterarSenha(null, true);

                Tela.exibirDados(usuarioSelecionado);

                Tela.setVisible(true);
            }

        } catch (SQLException ex) {
            Logger.getLogger(TodosUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ERRO_CONEXAO_BANCO);
        }
    }//GEN-LAST:event_btnAlterarSenhaActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TodosUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                TodosUsuarios dialog = new TodosUsuarios(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnAlterarSenha;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JTextField edtEmail;
    private javax.swing.JTextField edtLogin;
    private javax.swing.JTextField edtNome;
    private javax.swing.JLabel imgLogo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblNome;
    private javax.swing.JPanel panBuscar;
    private javax.swing.JTable tabUsuarios;
    // End of variables declaration//GEN-END:variables

    private int LinhaSelecionadas() {
        Integer linhaSelecionada = tabUsuarios.getSelectedRow();
        if (linhaSelecionada >= 0) {
            return (int) tabUsuarios.getValueAt(linhaSelecionada, 0);
        } else {
            return -1;
        }
    }

    private void atualizarTabela() {

        try {

            DefaultTableModel tableModel = new DefaultTableModel() {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };
            tableModel.addColumn(GERAL_ID);
            tableModel.addColumn(GERAL_NOME);
            tableModel.addColumn(USUARIO_GRADE_LOGIN);
            tableModel.addColumn(GERAL_EMAIL);
            tableModel.setRowCount(0);

            String Nome;

            if (edtNome.getText().equals("")) {
                Nome = "";
            } else {
                Nome = edtNome.getText();
            }

            String Login;

            if (edtLogin.getText().equals("")) {
                Login = "";
            } else {
                Login = edtLogin.getText();
            }

            String Email;

            if (edtEmail.getText().equals("")) {
                Email = "";
            } else {
                Email = edtEmail.getText();
            }

            List<Usuario> lista = Usuario.buscarTodos(Nome, Login, Email);

            lista.forEach(usuarios -> {
                Object[] row = {usuarios.getId(), usuarios.getNome(), usuarios.getLogin(), usuarios.getEmail()};
                tableModel.addRow(row);
            });

            tabUsuarios.setModel(tableModel);

        } catch (SQLException ex) {
            Logger.getLogger(TodosUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ERRO_CONEXAO_BANCO);
        }
    }
}
