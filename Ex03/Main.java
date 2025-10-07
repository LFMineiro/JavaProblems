import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<String>();

        names.add("Ana");
        names.add("Bruno");
        names.add("Carlos");

        System.out.println("Lista inicial: " + names);

        names.remove("Bruno");

        System.out.println("Nomes restantes: ");
        for (String nome : names) {
            System.out.println(nome);
        }
    }
}
