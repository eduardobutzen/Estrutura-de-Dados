package aulas.aula5;

public class Processo {

    public int id;
    public String descricao;

    public Processo(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "ID: " + id + " | Descrição: " + descricao;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Processo)) return false;

        Processo outro = (Processo) obj;
        return this.descricao.equals(outro.descricao);
    }

    @Override
    public int hashCode() {
        return descricao.hashCode();
    }
}