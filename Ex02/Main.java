import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    int temp;
    
    public static ArrayList<Integer> bubbleSort(ArrayList<Integer> list) {
        for(int i = 0;  i < list.size() - 1; i++) {
            for(int j=1; j<list.size() - i - 1;j++) {
                if(list.get(j) > list.get(j+1)) {
                    int temp = list.get(j+1);
                    list.set(j+1, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int sum = 0;
        int prod = 1;
        float MA, MG;
        
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> numList = new ArrayList<Integer>();
        
        for(int i=0; i<5; i++) {
            int num = in.nextInt();
            numList.add(num);
        }

        int n = numList.size();
        
        for(int i =0; i<n; i++) {
            sum += numList.get(i);
            prod *= numList.get(i);
        }
        MA = sum/n;
        // System.out.println(numList);
        ArrayList<Integer> ordernedList = bubbleSort(numList);
        System.out.println("Media: " + MA); 
        System.out.println("Menor numero: " + ordernedList.get((0))); 
        System.out.println("Maior numero: " + ordernedList.get(n -1)); 

    }
}
