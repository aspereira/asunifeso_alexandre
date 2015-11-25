package br.com.biblioteca.controller;
import br.com.biblioteca.model.Aluno;
import java.util.*;

public class AlunoDB implements LogAplicacao{
    
    private List<Aluno> alunos;
    
    public AlunoDB(){
        alunos = new ArrayList<>();
    }
    
    public void inserirAluno(Aluno aluno){
        this.alunos.add(aluno);
        gravarLog(aluno.toString());
    }
    
    public List<Aluno> retornarAlunos(){
        return alunos;
    }

    @Override
    public void gravarLog(String log) {
        System.out.println("Novo aluno inserido: " + log);
    }
}
