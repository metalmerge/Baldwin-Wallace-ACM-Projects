import java.util.*;
public class wordPyramid {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
        String[] arr = new String[num];
//        		String[] arr = {"Wow_did_you_notice_how_nice_the_Knowlton_Center_is", "I_know_it_is_very_new_and_fancy","Wow","Wow_Wow","Wow_Wow_Wow","Wow_Wow_Wow_Wow","Wow_Wow_Wow","Wow_Wow","Wow","Could_not_say_it_better_myself"};
//    String arr[] = {
//      "There_are_so_many_new_labs_where_students_can_do_lots_of_projects",
//      "My_favorite_is_the_maker_space_but_it_is_hard_to_choose_a_favorite",
//      "Stem",
//      "Stem_Stem",
//      "Stem_Stem_Stem",
//      "Stem_Stem",
//      "Did_you_see_the_robotics_lab_I_hear_the_professor_is_really_cool",
//      "Oops_I_broke_your_pyramid"
//    };
        for (int i = 0; i < num; i++) {
          arr[i] = sc.nextLine();
        }
    String keyWord = "";
    int keyCount = 0;
    for (int i = 0; i < num; i++) {
      int count = 0;
      int index = arr[i].indexOf('_');
      String temp;
      if (index == -1)
        temp = arr[i];
      else
        temp = arr[i].substring(0, index);

      for (int j = 0; j < num; j++) {
        int in = arr[j].indexOf('_');
        String test;
        if ( in == -1)
          test = arr[j];
        else
          test = arr[j].substring(0, in );
        if (test.equals(temp))
          count++;
      }
      if (count > keyCount) {
        keyCount = count;
        keyWord = temp;
      }

    }
    //    System.out.println("\n" + keyCount);
    //    System.out.println(keyWord);

    boolean pyram = true;
    int endAmount = -1;
    // loop through and check
    //			
    for (int i = 1; i <= num; i++) {
      String t = StringBuild(keyWord, i);
      if ((contains(arr, t)))
        endAmount = i;
    }

    //      System.out.println("Max " + endAmount);

    for (int i = endAmount - 1; i > 0; i--) {
      String u = StringBuild(keyWord, i);
      //    	  System.out.println("test " + u);
      //    	  System.out.println("test " + countOccurrences(arr, arr.length, u));
      if (countOccurrences(arr, arr.length, u) != 2)
        pyram = false;
    }
    //      System.out.println("ans: " + pyram);

    if (pyram && endAmount >= 3) {

      System.out.print("\nCase 1: PYRAMID");

    } else
      System.out.print("\nCase 2: NO PYRAMID");

    sc.close();
  }
  static int countOccurrences(String arr[], int n, String x) {
    int res = 0;
    for (int i = 0; i < n; i++)
      if (x.equals(arr[i]))
        res++;
    return res;
  }
  public static boolean contains(String[] arr, String targetValue) {
 
    for (String s: arr) {
      if (s.equals(targetValue))
        return true;
    }
    return false;
  }
  public static String StringBuild(String str, int n) {
    String string = "";
    for (int i = 0; i < n; i++) {
      string += str + "_";
    }
    return string.substring(0, string.length() - 1);
  }
  public static int countOccurrences(int arr[], int x) {
    int res = 0;
    for (int i = 0; i < arr.length; i++)
      if (x == arr[i])
        res++;
    return res;
  }
}