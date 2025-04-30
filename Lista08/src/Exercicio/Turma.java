package Exercicio;

import java.util.ArrayList;

public class Turma {

    /**
     * @return the disciplina
     */
    public String getDisciplina() {
        return disciplina;
    }

    /**
     * @param disciplina the disciplina to set
     */
    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    /**
     * @return the professor
     */
    public Professor getProfessor() {
        return professor;
    }

    /**
     * @param professor the professor to set
     */
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    /**
     * @return the turno
     */
    public Turno getTurno() {
        return turno;
    }

    /**
     * @param turno the turno to set
     */
    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    private String disciplina;
    private Professor professor;
    private Turno turno;
    private ArrayList<Aluno> alunos = new ArrayList<>();

    public Turma(String disciplina, Professor professor, Turno turno) {
        setDisciplina(disciplina);
        setProfessor(professor);
        setTurno(turno);
    }

    public void incluirAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void removerAluno(Aluno aluno) {
        alunos.remove(aluno);
    }

    public Aluno obterAlunoMelhorNotaEnem() {
        Aluno alunoMaior = alunos.get(0);
        for (Aluno aluno : alunos) {
            if (aluno.getNotaEnem() > alunoMaior.getNotaEnem()) {
                alunoMaior = aluno;
            }
        }
        return alunoMaior;
    }

}
