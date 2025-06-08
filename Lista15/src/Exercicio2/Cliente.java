package Exercicio2;

public class Cliente {

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    private String nome;
    private String endereco;
    
    public Cliente(String nome, String endereco){
        setNome(nome);
        setEndereco(endereco);
    }
}
