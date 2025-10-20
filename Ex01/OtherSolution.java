package Ex01;

public class OtherSolution {
  public static void main(String[] args) { 
    String text = "Hello Java";
    int count = 0;

    for (char c : text.toLowerCase().toCharArray()) {
      if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
        count++;
    }
  }

  System.out.println("Vowels: " + count);
  }
}
