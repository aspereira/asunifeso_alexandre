package br.com.biblioteca.view;

import br.com.biblioteca.model.*;
import java.util.*;

public class ViewConsole {
    
    public static void main(String args[]){
        
            Biblioteca objBiblioteca = new Biblioteca();
            objBiblioteca.setNome("Biblioteca ABC");
            
            Aluno objAluno = new Aluno();
            objAluno.setNome("Aluno A");
            objAluno.setMatricula("123456");
            
            Funcionario objFuncionario = new Funcionario();
            objFuncionario.setNome("Funcionario A");
            objFuncionario.setCpf("123456789");
            
            Editora objEditora = new Editora();
            objEditora.setNome("Editora A");
            
            Livro objLivro = new Livro(objEditora);
            objLivro.setCodigo("123");
            objLivro.setNome("Java! Como Programar.");
            
            Emprestimo objEmprestimo = new Emprestimo();
            objEmprestimo.setDataEntrega("15/11/2015");
            objEmprestimo.setFuncionario(objFuncionario);
            objEmprestimo.setAluno(objAluno);
            objEmprestimo.setLivro(objLivro);
            
            Emprestimo objEmprestimo2 = new Emprestimo();
            objEmprestimo2.setDataEntrega("20/11/2015");
            objEmprestimo2.setFuncionario(objFuncionario);
            objEmprestimo2.setAluno(objAluno);
            objEmprestimo2.setLivro(objLivro);
            
            List<Emprestimo> emprestimos = new ArrayList<Emprestimo>();
            emprestimos.add(objEmprestimo);
            emprestimos.add(objEmprestimo2);
            
            for(Emprestimo emp : emprestimos){
                System.out.println("Data de entrega: " + emp.getDataEntrega());
            }
            
            //System.out.println(objEmprestimo.getAluno().getNome());
    }
}
