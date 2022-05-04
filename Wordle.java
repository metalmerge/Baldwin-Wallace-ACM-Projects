import java.util.*;
public class Wordle {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] answers = {
      "THROUGH",
      "GORILLA",
      "BALDWIN",
      "BBBAAAA"
    };
    String[] guesses = {
      "PARTNER",
      "LANOLIN",
      "WALLACE",
      "AAAAAAA"
    };
    for (int e = 0; e < 4; e++) {
      String str = answers[e];
      char[] charAns = str.toCharArray();
      String guess = guesses[e];
      char[] charGuess = guess.toCharArray();
      char[] output = new char[7];

      for (int i = 0; i < 7; i++) {

        if (charGuess[i] == charAns[i]) {
          output[i] = charGuess[i];
          charAns[i] = '1';
        }

      }

      for (int i = 0; i < 7; i++) {
        if (charAns[i] != '1') {
          if (!(contains(charAns, charGuess[i]))) {
            output[i] = '*';
          } else if (contains(charAns, charGuess[i])) {
            output[i] = Character.toLowerCase(charGuess[i]);

          } else {
            output[i] = '*';
          }
        }
      }

      System.out.println("Case " + (e + 1) + ": " + String.valueOf(output));
    }
    System.out.println("\nCase 1: **Rt***");
    System.out.println("Case 2: la*oLi*");
    System.out.println("Case 3: wAL****");
    System.out.println("Case 4: ***AAAA");

    sc.close();
  }
  public static boolean contains(char[] arr, char targetValue) {

    for (char s: arr) {
      if (s == targetValue)
        return true;
    }
    return false;
  }
}

