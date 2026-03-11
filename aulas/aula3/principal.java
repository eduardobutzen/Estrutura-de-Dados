package aulas.aula3;

import java.util.Scanner;
import java.util.ArrayList;

public class principal {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        
        ArrayList<glicemia> lista = new ArrayList<>();
       

        //alternativa 1
         glicemia obj = new glicemia(191, "11/03/2026", "08:00");
         lista.add(obj);

         //alternativa 2
         lista.add (new glicemia(191, "11/03/2026", "08:00"));

        //alternativa 3
        int valor;
        String data, hora;
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o valor da glicemia: ");
            valor = teclado.nextInt();
            System.out.print("Digite a data: ");
            data = teclado.next();
            System.out.print("Digite a hora: ");
            hora = teclado.next();
            lista.add(new glicemia(valor, data, hora));
        }

        teclado.close();
    }
    
}
