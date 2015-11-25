package br.com.biblioteca.controller;
import br.com.biblioteca.model.Funcionario;
import java.util.*;

public class FuncionarioDB implements LogAplicacao{
    
    private List<Funcionario> funcionarios;
    
    public FuncionarioDB(){
        funcionarios = new ArrayList<>();
    }
    
    public void inserirFuncionario(Funcionario funcionario){
        this.funcionarios.add(funcionario);
        gravarLog(funcionario.toString());
    }
    
    public List<Funcionario> retornarFuncionarios(){
        return funcionarios;
    }

    @Override
    public void gravarLog(String log) {
        System.out.println("Novo funcionário inserido: " + log);
    }
}
