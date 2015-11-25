package br.com.biblioteca.controller;
import br.com.biblioteca.model.Editora;
import java.util.*;

public class EditoraDB implements LogAplicacao{
    
    private List<Editora> editoras;
    
    public EditoraDB(){
        editoras = new ArrayList<>();
    }
    
    public void inserirEditora(Editora editora){
        this.editoras.add(editora);
        gravarLog(editora.toString());
    }
    
    public List<Editora> retornarEditoras(){
        return editoras;
    }

    @Override
    public void gravarLog(String log) {
        System.out.println("Nova editora inserida: " + log);
    }
}
