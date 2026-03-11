package aulas.aula3.glicemia_java;

import java.util.ArrayList;

public class splitar {
    
    public static void main(String[] args) {

        ArrayList<glicemia> lista = new ArrayList<>();
        
        //ler a linnha
        String linha = "120,11/03/2026,09:00";

        //splitar a linha
        linha.split(",");
        String vetorLinha[] = linha.split(",");

        //criar obj de glicemia
        glicemia obj = new glicemia(Integer.parseInt(vetorLinha[0]), vetorLinha[1], vetorLinha[2]);
        System.out.println(obj.valor + " - " + obj.data + " - " + obj.hora);

        //adicionar o obj na lista
        if(lista.contains(obj)){

            lista.add(obj);
            
        }

        //exibir a lista
        for(glicemia item : lista) {
            System.out.println(item.valor + " - " + item.data + " - " + item.hora);
        }
    }

}
