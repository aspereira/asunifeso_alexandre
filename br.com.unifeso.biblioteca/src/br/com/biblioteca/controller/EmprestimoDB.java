package br.com.biblioteca.controller;
import br.com.biblioteca.model.Emprestimo;
import java.util.*;

public class EmprestimoDB implements LogAplicacao{
    
    private List<Emprestimo> emprestimos;
    
    public EmprestimoDB(){
        emprestimos = new ArrayList<>();
    }
    
    public void inserirEmprestimo(Emprestimo emprestimo){
        this.emprestimos.add(emprestimo);
        gravarLog(emprestimo.getDataEntrega());
    }
    
    public List<Emprestimo> retornarEmprestimos(){
        return emprestimos;
    }

    @Override
    public void gravarLog(String log) {
        System.out.println("Novo emprestimo efetuado em: " + log);
    }
}