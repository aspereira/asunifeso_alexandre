package br.com.biblioteca.controller;
import br.com.biblioteca.model.Livro;
import java.util.*;

public class LivroDB implements LogAplicacao{
    
    private List<Livro> livros;
    
    public LivroDB(){
        livros = new ArrayList<>();
    }
    
    public void inserirLivro(Livro livro){
        this.livros.add(livro);
        gravarLog(livro.toString());
    }
    
    public List<Livro> retornarLivros(){
        return livros;
    }

    @Override
    public void gravarLog(String log) {
        System.out.println("Novo livro inserido: " + log);
    }
}