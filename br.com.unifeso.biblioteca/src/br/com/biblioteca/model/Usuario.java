package br.com.biblioteca.model;

public class Usuario {
    private String nome;
    private String dataNasc;

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the data
     */
    public String getDataNasc() {
        return dataNasc;
    }

    /**
     * @param data the data to set
     */
    public void setDataNasc(String data) {
        this.dataNasc = data;
    }
    
    public int pegarAno() {
        String dataQueb[] = dataNasc.split("/");
        return Integer.parseInt(dataQueb[2]);
    }
}
