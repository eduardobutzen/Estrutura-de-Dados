package aulas.aula3.glicemia_java;

import java.util.Scanner;
import java.util.ArrayList;

public class principal {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        
        ArrayList<glicemia> lista = new ArrayList<>();
        
        //inserir na lista - alternativa 1
         glicemia obj = new glicemia(191, "11/03/2026", "08:00");
         lista.add(obj);

        //inserir na lista - alternativa 2
        lista.add (new glicemia(191, "11/03/2026", "08:00"));

        //inserir na lista - alternativa 3
        int valor;
        String data, hora;
        for (int i = 0; i < 3; i++) {
            System.out.print("Digite o valor da glicemia: ");
            valor = teclado.nextInt();
            teclado.nextLine(); 
            System.out.print("Digite a data: [dd/mm/aaaa] ");
            data = teclado.nextLine();
            System.out.print("Digite a hora: [hh:mm] ");
            hora = teclado.nextLine();
            lista.add(new glicemia(valor, data, hora));
        }
    
        //exibit lista - alternativa 1
        for(int i = 0; i < lista.size(); i++) {
        
            System.out.println(lista.get(i).valor + " - " + lista.get(i).data + " - " + lista.get(i).hora);

        }

        //exibit lista - alternativa 2
        for(glicemia item : lista) {
            System.out.println(item.valor + " - " + item.data + " - " + item.hora);
        }
        

        teclado.close();
    }
    
}
