import java.util.ArrayList;

public class main {
    
    public static void main(String[] args) {

        ArrayList<chuva> lista = new ArrayList<>();

        //simular que estamos lendo linha a linha do arquivo
        String linha = "2020,Janeiro,Quente,Muita";
        String dadoslinha[] = linha.split(",");
        chuva objChuva = new chuva(dadoslinha[0], dadoslinha[1], dadoslinha[2], dadoslinha[3]);

        linha = "2020,Janeiro,Frio,pouca";
        dadoslinha = linha.split(",");
        objChuva = new chuva(dadoslinha[0], dadoslinha[1], dadoslinha[2], dadoslinha[3]);


        if (!lista.contains(objChuva))
            lista.add(objChuva);

        for(chuva c : lista){

            System.out.println(c);

        }

    }

}
