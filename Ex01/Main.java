package Ex01;

import java.util.Scanner;

public class Main {

    public static int countVowels(String s) {
        int count = 0;
        for(int i=0; i< s.length(); i++) {
            char c = s.charAt(i);
            if(c == 'A' || c =='E'|| c=='I' || c=='O' || c=='U') {
                count++;
            }
        }
        return count;
    }

    public static String invertString(String s) {
        String inverse = "";
        for(int i=s.length()-1; i>=0; i--) {
            inverse += s.charAt(i);
        }
        return inverse;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Escreva uma frase: ");
        String frase = in.nextLine();
        
        String fraseUpperCase = frase.toUpperCase();
        int numVogais = countVowels(fraseUpperCase);

        String invertFraseString = invertString(frase);
        
        System.out.println(fraseUpperCase);
        System.out.printf("A frase tem %d vogais\n", numVogais);
        System.out.println(invertFraseString);

    }
}