package br.com.biblioteca.model;

public class Usuario {
    private String nome;
    private String data;

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
    public String getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(String data) {
        this.data = data;
    }
    
    public int pegarAno() {
        String dataQueb[] = data.split("/");
        return Integer.parseInt(dataQueb[2]);
    }
}
