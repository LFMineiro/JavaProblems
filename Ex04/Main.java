import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        GerenciarPessoas peopleAge = new GerenciarPessoas();

        peopleAge.addPeople("Luiz", 21);
        peopleAge.addPeople("Matheus", 30);
        peopleAge.addPeople("Davi", 25); 
        peopleAge.addPeople("Kaua", 21); 

        peopleAge.consultAgeByName("Luiz");
        peopleAge.listNamesByAge(21);
        // peopleAge.listNamesByAge(30);
        // peopleAge.listNamesByAge(25);
    }
}
