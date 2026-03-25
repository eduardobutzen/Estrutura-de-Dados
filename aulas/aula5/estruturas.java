package aulas.aula5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class estruturas {

    public static void exibirProcessos(ArrayList<Processo> lista){

        System.out.println("Quantidade de processos: " + lista.size());

        lista.sort((p1, p2) -> p1.descricao.compareTo(p2.descricao));

        for (Processo p : lista) {
            System.out.println(p);
        }
    }

    public static void gerarProcessos(ArrayList<Processo> lista, Scanner teclado){

        int id;
        String descricao;

        Random gerador = new Random();

        while (true) {

            id = gerador.nextInt(500);
            System.out.print("Descrição do processo: ");
            descricao = teclado.nextLine().toUpperCase();

            if (descricao.equals("SAIR"))
                break;

            Processo tmp = new Processo(id, descricao);

            if (!lista.contains(tmp))
                lista.add(tmp);
        }
    }

    public static void localizarProcesso(ArrayList<Processo> lista, Scanner teclado){

        System.out.print("Digite palavra ou expressão que deseja localizar: ");
        String descricao = teclado.nextLine().toUpperCase();

        for (Processo p : lista) {
            if (p.descricao.contains(descricao)) {
                System.out.println(p);
            }
        }
    }

    public static void removerProcesso (ArrayList<Processo> lista, Scanner teclado) {

        String descricao;
        // Scanner teclado =  new Scanner (System.in);
        System.out.println("Digite palavra ou expressao que deseja remover: ");
        descricao = teclado.nextLine().toUpperCase();

        Iterator<Processo> it = lista.iterator();
        while (it.hasNext()){

            Processo p = it.next();
            if (p.descricao.contains(descricao)){

                it.remove();
            }

        }


    }

    public static void main(String[] args) {

        ArrayList<Processo> lista = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);

        gerarProcessos(lista, teclado);
        exibirProcessos(lista);
        localizarProcesso(lista, teclado);
        removerProcesso(lista, teclado);
        exibirProcessos(lista);

        teclado.close();
    }
}