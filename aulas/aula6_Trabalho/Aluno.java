package aulas.aula6_Trabalho;

public class Aluno {
    String nome, curso, sexo;
    int anoIngresso;

    public Aluno(String nome, String curso, String sexo, int anoIngresso) {
        this.nome = nome;
        this.curso = curso;
        this.sexo = sexo;
        this.anoIngresso = anoIngresso;
    }

    public void exibir() {
        System.out.println("  Nome: " + nome);
        System.out.println("  Curso: " + curso);
        System.out.println("  Sexo: " + sexo);
        System.out.println("  Ano de Ingresso: " + anoIngresso);
    }
}