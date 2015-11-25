package br.com.biblioteca.model;

public class Funcionario extends Usuario {
    
    private String cpf;

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    @Override
    public String toString(){
        return cpf + " - " + super.getNome();
    }
}
