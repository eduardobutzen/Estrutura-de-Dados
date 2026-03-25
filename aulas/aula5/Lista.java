package aulas.aula5;

import java.util.ArrayList;
import java.util.Iterator;


public class Lista {

    public static void main(String[] args) {

        ArrayList<Integer> lista = new ArrayList<>();
        
        lista.add(45);
        lista.add(2);
        lista.add(42);
        lista.add(23);

        // percorrer via índice
        for (int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i));
        }

        // percorrer via for-each
        for (Integer num : lista){
            System.out.println(num);
        }

        //percorrer via iterador
        Iterator<Integer> it = lista.iterator();
        while (it.hasNext()){
            int num = it.next ();
            System.out.println(num);
        }
    }

}