package br.com.biblioteca.view;

import br.com.biblioteca.model.*;
import br.com.biblioteca.controller.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ViewWindows extends javax.swing.JFrame {

    AlunoDB alunos;
    EditoraDB editoras;
    FuncionarioDB funcionarios;
    LivroDB livros;
    EmprestimoDB emprestimos;
    
    public ViewWindows() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        alunos = new AlunoDB();
        editoras = new EditoraDB();
        funcionarios = new FuncionarioDB();
        livros = new LivroDB();
        emprestimos = new EmprestimoDB();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        txtDataAluno = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNomeAluno = new javax.swing.JTextField();
        btnGravarAluno = new javax.swing.JButton();
        txtMatricula = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAlunos = new javax.swing.JTextArea();
        btnLocalizarAlunos = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtDataNascAluno = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtCodigoEditora = new javax.swing.JTextField();
        txtNomeEditora = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btnGravarEditora = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtEditoras = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        btnLocalizarEditoras = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cbEditorasLivro = new javax.swing.JComboBox();
        btnCarregarEditoras = new javax.swing.JButton();
        btnGravarLivro = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtNomeLivro = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtLivros = new javax.swing.JTextArea();
        btnLocalizarLivros = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        txtCodigoLivro = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtCPFFuncionario = new javax.swing.JTextField();
        txtNomeFuncionario = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        btnGravarFuncionario = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtFuncionarios = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        btnLocalizarFuncionarios = new javax.swing.JButton();
        txtDataNascFuncionario = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        cbLivrosEmprestimo = new javax.swing.JComboBox();
        cbAlunosEmprestimo = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtDataEntregaEmprestimo = new javax.swing.JTextField();
        cbFuncionariosEmprestimo = new javax.swing.JComboBox();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtEmprestimos = new javax.swing.JTextArea();
        btnLocalizarEmprestimos = new javax.swing.JButton();
        btnGravarEmprestimo = new javax.swing.JButton();
        btnCarregarFuncionarios = new javax.swing.JButton();
        btnCarregarLivros = new javax.swing.JButton();
        btnCarregarAlunos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema Locadora");

        jLabel1.setText("Nome:");

        btnGravarAluno.setText("Gravar");
        btnGravarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGravarAlunoActionPerformed(evt);
            }
        });

        jLabel4.setText("Matrícula:");

        txtAlunos.setColumns(20);
        txtAlunos.setRows(5);
        jScrollPane1.setViewportView(txtAlunos);

        btnLocalizarAlunos.setText("Localizar todos");
        btnLocalizarAlunos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLocalizarAlunosActionPerformed(evt);
            }
        });

        jLabel5.setText("Alunos cadastrados:");

        jLabel19.setText("Data de Nascimento:");

        javax.swing.GroupLayout txtDataAlunoLayout = new javax.swing.GroupLayout(txtDataAluno);
        txtDataAluno.setLayout(txtDataAlunoLayout);
        txtDataAlunoLayout.setHorizontalGroup(
            txtDataAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtDataAlunoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(txtDataAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(txtDataAlunoLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, txtDataAlunoLayout.createSequentialGroup()
                        .addGroup(txtDataAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1)
                            .addGroup(txtDataAlunoLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnLocalizarAlunos)))
                        .addGap(30, 30, 30))
                    .addGroup(txtDataAlunoLayout.createSequentialGroup()
                        .addGroup(txtDataAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnGravarAluno)
                            .addGroup(txtDataAlunoLayout.createSequentialGroup()
                                .addGroup(txtDataAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(txtDataAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(txtDataAlunoLayout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDataNascAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 30, Short.MAX_VALUE))))
        );
        txtDataAlunoLayout.setVerticalGroup(
            txtDataAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtDataAlunoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(txtDataAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(txtDataAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtNomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(txtDataAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDataNascAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGravarAluno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLocalizarAlunos)
                .addGap(23, 23, 23))
        );

        txtNomeAluno.getAccessibleContext().setAccessibleName("txtNomeLocadora");

        jTabbedPane1.addTab("Aluno", txtDataAluno);

        jLabel7.setText("Código:");

        jLabel8.setText("Nome:");

        btnGravarEditora.setText("Gravar");
        btnGravarEditora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGravarEditoraActionPerformed(evt);
            }
        });

        txtEditoras.setColumns(20);
        txtEditoras.setRows(5);
        jScrollPane3.setViewportView(txtEditoras);

        jLabel9.setText("Editoras cadastradas:");

        btnLocalizarEditoras.setText("Localizar todas");
        btnLocalizarEditoras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLocalizarEditorasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtCodigoEditora, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNomeEditora, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btnGravarEditora)
                            .addComponent(btnLocalizarEditoras))))
                .addGap(0, 44, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigoEditora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(txtNomeEditora, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGravarEditora)
                .addGap(49, 49, 49)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLocalizarEditoras)
                .addGap(22, 22, 22))
        );

        jTabbedPane1.addTab("Editora", jPanel3);

        jLabel2.setText("Editora:");

        btnCarregarEditoras.setText("...");
        btnCarregarEditoras.setToolTipText("Carregar locadoras");
        btnCarregarEditoras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarregarEditorasActionPerformed(evt);
            }
        });

        btnGravarLivro.setText("Gravar");
        btnGravarLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGravarLivroActionPerformed(evt);
            }
        });

        jLabel3.setText("Nome:");

        jLabel6.setText("Livros cadastrados:");
        jLabel6.setToolTipText("");

        txtLivros.setColumns(20);
        txtLivros.setRows(5);
        jScrollPane2.setViewportView(txtLivros);

        btnLocalizarLivros.setText("Localizar todas");
        btnLocalizarLivros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLocalizarLivrosActionPerformed(evt);
            }
        });

        jLabel18.setText("Código:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnLocalizarLivros)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnGravarLivro)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbEditorasLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnCarregarEditoras)))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel18)
                                .addComponent(jLabel3))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtNomeLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtCodigoLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbEditorasLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCarregarEditoras))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigoLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNomeLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGravarLivro)
                .addGap(1, 1, 1)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLocalizarLivros)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Livro", jPanel2);

        jLabel10.setText("CPF:");

        jLabel11.setText("Nome:");

        btnGravarFuncionario.setText("Gravar");
        btnGravarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGravarFuncionarioActionPerformed(evt);
            }
        });

        txtFuncionarios.setColumns(20);
        txtFuncionarios.setRows(5);
        jScrollPane4.setViewportView(txtFuncionarios);

        jLabel12.setText("Funcionários cadastrados:");

        btnLocalizarFuncionarios.setText("Localizar todas");
        btnLocalizarFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLocalizarFuncionariosActionPerformed(evt);
            }
        });

        jLabel20.setText("Data de Nascimento:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnLocalizarFuncionarios)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnGravarFuncionario)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtCPFFuncionario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNomeFuncionario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDataNascFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCPFFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtNomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDataNascFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGravarFuncionario)
                .addGap(1, 1, 1)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLocalizarFuncionarios)
                .addGap(23, 23, 23))
        );

        jTabbedPane1.addTab("Funcionário", jPanel4);

        jLabel13.setText("Livro:");

        jLabel14.setText("Aluno:");

        jLabel15.setText("Funcionário:");

        jLabel16.setText("Data de Entrega:");

        cbFuncionariosEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbFuncionariosEmprestimoActionPerformed(evt);
            }
        });

        jLabel17.setText("Empréstimos realizados:");

        txtEmprestimos.setColumns(20);
        txtEmprestimos.setRows(5);
        jScrollPane5.setViewportView(txtEmprestimos);

        btnLocalizarEmprestimos.setText("Localizar todas");
        btnLocalizarEmprestimos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLocalizarEmprestimosActionPerformed(evt);
            }
        });

        btnGravarEmprestimo.setText("Gravar");
        btnGravarEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGravarEmprestimoActionPerformed(evt);
            }
        });

        btnCarregarFuncionarios.setText("...");
        btnCarregarFuncionarios.setToolTipText("Carregar locadoras");
        btnCarregarFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarregarFuncionariosActionPerformed(evt);
            }
        });

        btnCarregarLivros.setText("...");
        btnCarregarLivros.setToolTipText("Carregar locadoras");
        btnCarregarLivros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarregarLivrosActionPerformed(evt);
            }
        });

        btnCarregarAlunos.setText("...");
        btnCarregarAlunos.setToolTipText("Carregar locadoras");
        btnCarregarAlunos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarregarAlunosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnLocalizarEmprestimos)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
                            .addComponent(btnGravarEmprestimo)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel15))
                                .addGap(10, 10, 10)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(cbAlunosEmprestimo, javax.swing.GroupLayout.Alignment.LEADING, 0, 204, Short.MAX_VALUE)
                                            .addComponent(cbLivrosEmprestimo, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(cbFuncionariosEmprestimo, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnCarregarFuncionarios)
                                            .addComponent(btnCarregarLivros)
                                            .addComponent(btnCarregarAlunos)))
                                    .addComponent(txtDataEntregaEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtDataEntregaEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(btnCarregarLivros))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(cbLivrosEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14)
                        .addComponent(btnCarregarAlunos))
                    .addComponent(cbAlunosEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(cbFuncionariosEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCarregarFuncionarios))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGravarEmprestimo)
                .addGap(1, 1, 1)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLocalizarEmprestimos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Empréstimo", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLocalizarEditorasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLocalizarEditorasActionPerformed
        txtEditoras.setText("");
        for (Editora e : editoras.retornarEditoras()){
            txtEditoras.append("Código: " + e.getCodigo() + "\n");
            txtEditoras.append("Nome: " + e.getNome() + "\n");
            txtEditoras.append("------------------------\n");
        }
    }//GEN-LAST:event_btnLocalizarEditorasActionPerformed

    private void btnGravarEditoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravarEditoraActionPerformed
        Editora editora = new Editora();
        editora.setCodigo(txtCodigoEditora.getText());
        editora.setNome(txtNomeEditora.getText());
        
        editoras.inserirEditora(editora);
        
        JOptionPane.showMessageDialog(rootPane, "Editora incluída com sucesso!");
        
        txtCodigoEditora.setText("");
        txtNomeEditora.setText("");
    }//GEN-LAST:event_btnGravarEditoraActionPerformed

    private void btnLocalizarLivrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLocalizarLivrosActionPerformed
        txtLivros.setText("");
        for (Livro l : livros.retornarLivros()){
            txtLivros.append("Código: " + l.getCodigo() + "\n");
            txtLivros.append("Nome: " + l.getNome() + "\n");
            txtLivros.append("------------------------\n");
        }
    }//GEN-LAST:event_btnLocalizarLivrosActionPerformed

    private void btnGravarLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravarLivroActionPerformed
        Livro livro = new Livro((Editora) cbEditorasLivro.getSelectedItem());
        livro.setCodigo(txtCodigoLivro.getText());
        livro.setNome(txtNomeLivro.getText());
        
        livros.inserirLivro(livro);
        
        JOptionPane.showMessageDialog(rootPane, "Livro incluído com sucesso!");
        
        txtCodigoLivro.setText("");
        txtNomeLivro.setText("");
    }//GEN-LAST:event_btnGravarLivroActionPerformed

    private void btnCarregarEditorasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarregarEditorasActionPerformed
        cbEditorasLivro.removeAllItems();
        for (Editora e : editoras.retornarEditoras()){
            cbEditorasLivro.addItem(e);
        }
    }//GEN-LAST:event_btnCarregarEditorasActionPerformed

    private void btnLocalizarAlunosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLocalizarAlunosActionPerformed
        txtAlunos.setText("");
        for (Aluno a : alunos.retornarAlunos()){
            txtAlunos.append("Matrícula: " + a.getMatricula() + "\n");
            txtAlunos.append("Nome: " + a.getNome() + "\n");
            txtAlunos.append("Data de Nasc.: " + a.getData() + "\n");
            txtAlunos.append("------------------------\n");
        }
    }//GEN-LAST:event_btnLocalizarAlunosActionPerformed

    private void btnGravarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravarAlunoActionPerformed
        Aluno aluno = new Aluno();
        aluno.setMatricula(txtMatricula.getText());
        aluno.setNome(txtNomeAluno.getText());
        aluno.setData(txtDataNascAluno.getText());
        
        int ano = aluno.pegarAno();
        
        if (2015 - ano < 18) {
            JOptionPane.showMessageDialog(rootPane, "Aluno não pode ser cadastrado!");
        }            
        else {
            alunos.inserirAluno(aluno);
            JOptionPane.showMessageDialog(rootPane, "Aluno incluído com sucesso!");
        }
            
        txtMatricula.setText("");
        txtNomeAluno.setText("");
        txtDataNascAluno.setText("");
    }//GEN-LAST:event_btnGravarAlunoActionPerformed

    private void btnGravarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravarFuncionarioActionPerformed
        Funcionario funcionario = new Funcionario();
        funcionario.setCpf(txtCPFFuncionario.getText());
        funcionario.setNome(txtNomeFuncionario.getText());
        funcionario.setData(txtDataNascFuncionario.getText());
        
        int ano = funcionario.pegarAno();
        
        if (2015 - ano < 18) {
            JOptionPane.showMessageDialog(rootPane, "Funcionário não pode ser cadastrado!");
        }            
        else {
            funcionarios.inserirFuncionario(funcionario);
            JOptionPane.showMessageDialog(rootPane, "Funcionário incluído com sucesso!");
        }
        
        txtCPFFuncionario.setText("");
        txtNomeFuncionario.setText("");
        txtDataNascFuncionario.setText("");
    }//GEN-LAST:event_btnGravarFuncionarioActionPerformed

    private void btnLocalizarFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLocalizarFuncionariosActionPerformed
        txtFuncionarios.setText("");
        for (Funcionario f : funcionarios.retornarFuncionarios()){
            txtFuncionarios.append("CPF: " + f.getCpf() + "\n");
            txtFuncionarios.append("Nome: " + f.getNome() + "\n");
            txtFuncionarios.append("Data de Nasc.: " + f.getData() + "\n");
            txtFuncionarios.append("------------------------\n");
        }
    }//GEN-LAST:event_btnLocalizarFuncionariosActionPerformed

    private void cbFuncionariosEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbFuncionariosEmprestimoActionPerformed
        
    }//GEN-LAST:event_cbFuncionariosEmprestimoActionPerformed

    private void btnLocalizarEmprestimosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLocalizarEmprestimosActionPerformed
        txtEmprestimos.setText("");
        for (Emprestimo emp : emprestimos.retornarEmprestimos()){
            txtEmprestimos.append(emp.toString());
            txtEmprestimos.append("\n------------------------\n");
        }
    }//GEN-LAST:event_btnLocalizarEmprestimosActionPerformed

    private void btnGravarEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravarEmprestimoActionPerformed
        Emprestimo emprestimo = new Emprestimo();
        emprestimo.setDataEntrega(txtDataEntregaEmprestimo.getText());
        emprestimo.setLivro((Livro) cbLivrosEmprestimo.getSelectedItem());
        emprestimo.setAluno((Aluno) cbAlunosEmprestimo.getSelectedItem());
        emprestimo.setFuncionario((Funcionario) cbFuncionariosEmprestimo.getSelectedItem());      
        
        emprestimos.inserirEmprestimo(emprestimo);
        
        JOptionPane.showMessageDialog(rootPane, "Empréstimo efetuado com sucesso!");
        
        txtDataEntregaEmprestimo.setText("");
        cbLivrosEmprestimo.setSelectedIndex(-1);
        cbAlunosEmprestimo.setSelectedIndex(-1);
        cbFuncionariosEmprestimo.setSelectedIndex(-1);
    }//GEN-LAST:event_btnGravarEmprestimoActionPerformed

    private void btnCarregarFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarregarFuncionariosActionPerformed
        cbFuncionariosEmprestimo.removeAllItems();
        for (Funcionario f : funcionarios.retornarFuncionarios()){
            cbFuncionariosEmprestimo.addItem(f);
        }
    }//GEN-LAST:event_btnCarregarFuncionariosActionPerformed

    private void btnCarregarLivrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarregarLivrosActionPerformed
        cbLivrosEmprestimo.removeAllItems();
        for (Livro l : livros.retornarLivros()){
            cbLivrosEmprestimo.addItem(l);
        }
    }//GEN-LAST:event_btnCarregarLivrosActionPerformed

    private void btnCarregarAlunosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarregarAlunosActionPerformed
        cbAlunosEmprestimo.removeAllItems();
        for (Aluno a : alunos.retornarAlunos()){
            cbAlunosEmprestimo.addItem(a);
        }
    }//GEN-LAST:event_btnCarregarAlunosActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewWindows.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewWindows.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewWindows.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewWindows.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewWindows().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCarregarAlunos;
    private javax.swing.JButton btnCarregarEditoras;
    private javax.swing.JButton btnCarregarFuncionarios;
    private javax.swing.JButton btnCarregarLivros;
    private javax.swing.JButton btnGravarAluno;
    private javax.swing.JButton btnGravarEditora;
    private javax.swing.JButton btnGravarEmprestimo;
    private javax.swing.JButton btnGravarFuncionario;
    private javax.swing.JButton btnGravarLivro;
    private javax.swing.JButton btnLocalizarAlunos;
    private javax.swing.JButton btnLocalizarEditoras;
    private javax.swing.JButton btnLocalizarEmprestimos;
    private javax.swing.JButton btnLocalizarFuncionarios;
    private javax.swing.JButton btnLocalizarLivros;
    private javax.swing.JComboBox cbAlunosEmprestimo;
    private javax.swing.JComboBox cbEditorasLivro;
    private javax.swing.JComboBox cbFuncionariosEmprestimo;
    private javax.swing.JComboBox cbLivrosEmprestimo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea txtAlunos;
    private javax.swing.JTextField txtCPFFuncionario;
    private javax.swing.JTextField txtCodigoEditora;
    private javax.swing.JTextField txtCodigoLivro;
    private javax.swing.JPanel txtDataAluno;
    private javax.swing.JTextField txtDataEntregaEmprestimo;
    private javax.swing.JTextField txtDataNascAluno;
    private javax.swing.JTextField txtDataNascFuncionario;
    private javax.swing.JTextArea txtEditoras;
    private javax.swing.JTextArea txtEmprestimos;
    private javax.swing.JTextArea txtFuncionarios;
    private javax.swing.JTextArea txtLivros;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JTextField txtNomeAluno;
    private javax.swing.JTextField txtNomeEditora;
    private javax.swing.JTextField txtNomeFuncionario;
    private javax.swing.JTextField txtNomeLivro;
    // End of variables declaration//GEN-END:variables
}
