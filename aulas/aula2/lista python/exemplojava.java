import java.util.ArrayList;

public class exemplojava {

    public static void main(String[] args) {

        ArrayList<String> listnomes = new ArrayList<>();

        listnomes.add("João");
        listnomes.add("Maria");
        listnomes.add("Pedro");

        System.out.println("Nomes na lista:");

        for (String nome : listnomes) {
            System.out.println(nome);
        }
    }
}