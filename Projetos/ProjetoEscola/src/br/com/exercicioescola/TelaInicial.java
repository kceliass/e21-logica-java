package br.com.exercicioescola;

import br.com.escolaclasses.Aluno;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JOptionPane;

public class TelaInicial extends javax.swing.JFrame {
    
    public ArrayList<Aluno> arrayListAlunos = new ArrayList<Aluno>();
    
    public String CONST_TURMA = "JAVA/ANGULAR";
    
    public TelaInicial() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtMateria = new javax.swing.JTextField();
        txtNota = new javax.swing.JTextField();
        btnInserir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListAlunos = new javax.swing.JList<>();
        btnExcluirRegistro = new javax.swing.JButton();
        btnLimparLista = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Formulário");

        jLabel2.setText("Nome");

        jLabel3.setText("Matéria");

        jLabel4.setText("Nota");

        btnInserir.setText("Inserir");
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });

        jListAlunos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListAlunosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jListAlunos);

        btnExcluirRegistro.setText("Excluir Registro");
        btnExcluirRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirRegistroActionPerformed(evt);
            }
        });

        btnLimparLista.setText("Limpar Lista");
        btnLimparLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparListaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(35, 35, 35)
                                .addComponent(txtNota, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txtMateria))
                    .addComponent(btnInserir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnExcluirRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                    .addComponent(btnLimparLista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtNota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addComponent(btnInserir))
                    .addComponent(jScrollPane2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnExcluirRegistro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLimparLista)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        if(!"".equals(txtNome.getText()) &&
           !"".equals(txtMateria.getText()) &&
           !"".equals(txtNota.getText().replace(",","."))) {
            double nota;
            nota = Double.parseDouble(txtNota.getText());
            Aluno aluno = new Aluno(txtNome.getText(), CONST_TURMA,txtMateria.getText(), txtNota.getText());
            arrayListAlunos.add(aluno);
            atualizaListaAlunos();
        } else {
            JOptionPane.showMessageDialog(this, "Favor preencher todos os campos","Campos em branco", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnInserirActionPerformed

    private void btnExcluirRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirRegistroActionPerformed
            if(jListAlunos.getSelectedIndex() > -1) {
                int indiceSelecionado = jListAlunos.getSelectedIndex();
                arrayListAlunos.remove(indiceSelecionado);
                atualizaListaAlunos();
            } else {
                JOptionPane.showMessageDialog(this, "Selecione um registro","Atenção", JOptionPane.ERROR_MESSAGE);
            }
    }//GEN-LAST:event_btnExcluirRegistroActionPerformed
    
    public void populaListaAlunos() {
        String[] nomes = {"Mateus", "Suy", "Yuri", "Liandra", "Jefferson"};
        
        for (int i = 0; i < nomes.length;i++) {
            int nota = ThreadLocalRandom.current().nextInt();
        }
    }
    private void btnLimparListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparListaActionPerformed
        String[] vetorString = {""};
        jListAlunos.setListData(vetorString);
        
        arrayListAlunos.removeAll(arrayListAlunos);
    }//GEN-LAST:event_btnLimparListaActionPerformed

    private void jListAlunosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListAlunosMouseClicked
        Aluno alunoSelecionado = getAluno(jListAlunos.getSelectedIndex());
    }//GEN-LAST:event_jListAlunosMouseClicked

    public void atualizaListaAlunos() {
        String[] textoLista = new String[arrayListAlunos.size()];
        for (int i = 0; i < arrayListAlunos.size(); i++) {
            Aluno aluno = getAluno(i);
            textoLista[i] = (i+1) + " - " + aluno.getNome();
            textoLista[i] += " - " + aluno.getMateria();
            textoLista[i] += " - " + aluno.getNota();
        }
        jListAlunos.setListData(textoLista);
        limparCampos();
    }
    
    public Aluno getAluno(int indice) {
        return arrayListAlunos.get(indice);
    }
    
    public void limparCampos() {
        txtNome.setText("");
        txtMateria.setText("");
        txtNota.setText("");
    }
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
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExcluirRegistro;
    private javax.swing.JButton btnInserir;
    private javax.swing.JButton btnLimparLista;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList<String> jListAlunos;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtMateria;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNota;
    // End of variables declaration//GEN-END:variables
}
