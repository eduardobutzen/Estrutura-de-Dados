package aulas.aula6_Trabalho;

import java.io.*;
import java.util.*;

public class Main {

    static List<Aluno> alunos = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    static final String SEP = "----------------------------------------";

    public static void main(String[] args) throws Exception {
        carregarCSV("alunos.csv");

        while (true) {
            System.out.println("\n" + SEP);
            System.out.println("  MENU");
            System.out.println(SEP);
            System.out.println("  [1] Listar por Ano");
            System.out.println("  [2] Listar por Nome");
            System.out.println("  [3] Buscar aluno");
            System.out.println("  [4] Adicionar aluno");
            System.out.println("  [5] Remover aluno");
            System.out.println("  [6] Relatorio por ano");
            System.out.println("  [0] Sair");
            System.out.println(SEP);
            System.out.print("\n  Opcao: ");
            String opcao = sc.nextLine().trim();

            switch (opcao) {
                case "1" -> exibirLista(ordenarPorAno(), "Ordenado por Ano");
                case "2" -> exibirLista(ordenarPorNome(), "Ordenado por Nome");
                case "3" -> buscarAluno();
                case "4" -> adicionarAluno();
                case "5" -> removerAluno();
                case "6" -> relatorioPorAno();
                case "0" -> { return; }
            }
        }
    }

    static void carregarCSV(String caminho) throws Exception {
        caminho = "aulas/aula6_Trabalho/" + caminho;
        BufferedReader br = new BufferedReader(new FileReader(caminho));
        br.readLine();
        String linha;
        while ((linha = br.readLine()) != null) {
            String[] p = linha.split(",");
            alunos.add(new Aluno(p[0].trim(), p[1].trim(), p[2].trim(), Integer.parseInt(p[3].trim())));
        }
        br.close();
    }

    static List<Aluno> ordenarPorAno() {
        List<Aluno> lista = new ArrayList<>(alunos);
        lista.sort(Comparator.comparingInt(a -> a.anoIngresso));
        return lista;
    }

    static List<Aluno> ordenarPorNome() {
        List<Aluno> lista = new ArrayList<>(alunos);
        lista.sort(Comparator.comparing(a -> a.nome.toLowerCase()));
        return lista;
    }

    static Aluno buscarPorNome(String nome) {
        for (Aluno a : alunos)
            if (a.nome.equalsIgnoreCase(nome)) return a;
        return null;
    }

    static void exibirLista(List<Aluno> lista, String titulo) {
        System.out.println("\n" + SEP);
        System.out.println("  " + titulo + " (" + lista.size() + " alunos)");
        System.out.println(SEP);
        for (Aluno a : lista) {
            System.out.println();
            a.exibir();
        }
        System.out.println("\n" + SEP);
    }

    static void buscarAluno() {
        System.out.println("\n" + SEP + "\n  Buscar Aluno\n" + SEP);
        while (true) {
            System.out.print("\n  Nome (sair para voltar): ");
            String nome = sc.nextLine().trim();
            if (nome.equalsIgnoreCase("sair")) break;
            Aluno a = buscarPorNome(nome);
            if (a != null) { System.out.println(); a.exibir(); }
            else System.out.println("  Nao encontrado.");
        }
    }

    static void adicionarAluno() {
        System.out.println("\n" + SEP + "\n  Adicionar Aluno\n" + SEP);
        System.out.print("  Nome: ");            String nome  = sc.nextLine().trim();
        System.out.print("  Curso: ");           String curso = sc.nextLine().trim();
        System.out.print("  Sexo: ");            String sexo  = sc.nextLine().trim();
        System.out.print("  Ano de Ingresso: "); int ano      = Integer.parseInt(sc.nextLine().trim());
        alunos.add(new Aluno(nome, curso, sexo, ano));
        System.out.println("  Aluno '" + nome + "' adicionado!");
    }

    static void removerAluno() {
        System.out.println("\n" + SEP + "\n  Remover Aluno\n" + SEP);
        System.out.print("  Nome: ");
        String nome = sc.nextLine().trim();
        Aluno a = buscarPorNome(nome);
        if (a == null) { System.out.println("  Nao encontrado."); return; }
        a.exibir();
        System.out.print("\n  Confirmar remocao? (s/n): ");
        if (sc.nextLine().trim().equalsIgnoreCase("s")) {
            alunos.remove(a);
            System.out.println("  Aluno removido!");
        }
    }

    static void relatorioPorAno() {
        Map<Integer, Integer> contagem = new TreeMap<>();
        for (Aluno a : alunos)
            contagem.merge(a.anoIngresso, 1, Integer::sum);
        System.out.println("\n" + SEP + "\n  Ingressantes por Ano\n" + SEP);
        for (Map.Entry<Integer, Integer> e : contagem.entrySet())
            System.out.printf("  %d:  %d alunos  (%.1f%%)%n",
                e.getKey(), e.getValue(), e.getValue() * 100.0 / alunos.size());
        System.out.println("\n  Total: " + alunos.size());
        System.out.println(SEP);
    }
}