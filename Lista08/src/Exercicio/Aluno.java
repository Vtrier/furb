package Exercicio;

public class Aluno {

    /**
     * @return the matricula
     */
    public int getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

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
     * @return the notaEnem
     */
    public double getNotaEnem() {
        return notaEnem;
    }

    /**
     * @param notaEnem the notaEnem to set
     */
    public void setNotaEnem(double notaEnem) {
        this.notaEnem = notaEnem;
    }
    private int matricula;
    private String nome;
    private double notaEnem;
    
    public Aluno(int matricula, String nome, double notaEnem){
        setMatricula(matricula);
        setNome(nome);
        setNotaEnem(notaEnem);
        
    }
}
