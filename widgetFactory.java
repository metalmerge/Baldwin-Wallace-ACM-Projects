import java.util.*;
public class widgetFactory {
  public static void main(String[] args) {
    ArrayList < Integer > arr1 = new ArrayList < Integer > ();
    arr1.add(4);
    ArrayList < Integer > arr2 = new ArrayList < Integer > ();
    arr2.add(1);
    arr2.add(5);
    ArrayList < Integer > arr3 = new ArrayList < Integer > ();
    arr3.add(2);
    arr3.add(5);
    int x = 0;
    int y = 0;
    int num = 5;
    ArrayList < Task > list = new ArrayList < Task > ();

    list.add(new Task(1, 1, 3, 0, arr1));
    list.add(new Task(2, 2, 3, 2, arr2));
    list.add(new Task(3, 3, 3, 2, arr3));
    list.add(new Task(4, 1, 2, 0));
    list.add(new Task(5, 3, 1, 0));
    int[] output = new int[num];

    for (int e = 0; e < num; e++) {

      int bestIndex = findBest(list, x, y);
      //      System.out.println(("found " + list.get(bestIndex).num));

      //chnage task to open and change x and y current cordinates
      x = list.get(bestIndex).xPos;
      //      System.out.println(x);
      y = list.get(bestIndex).yPos;
      //      System.out.println(y);

      // update open
      update(list, list.get(bestIndex).num);

      output[e] = (list.get(bestIndex).num);
      list.remove(bestIndex);

    }
    System.out.print(" Case 1: ");
    for (int i = 0; i < output.length; i++) {

      System.out.print(output[i] + " ");

    }
    System.out.println("\n Case 1: 4 1 5 2 3");
  }

  //Case 1: 4 1 5 2 3
  public static void update(ArrayList < Task > list, int taskDone) {
    //TODO
    //	  for (int e = 0; e < list.size(); e++) 
    //	  System.out.println(list.get(e).prerec.toString());
    for (int e = 0; e < list.size(); e++) {

      if (list.get(e).prerec.contains(taskDone)) {
        list.get(e).prerec.remove(new Integer(taskDone));

      }
    }
    for (int e = 0; e < list.size(); e++) {
      if (list.get(e).prerec.size() == 0 && list.get(e).open == false) {
        //    	  System.out.println("changed " + e);
        list.get(e).open = true;
      }
    }
    //    for (int e = 0; e < list.size(); e++) 
    //  	  System.out.println(list.get(e).prerec.toString());

  }
  public static int findBest(ArrayList < Task > list, int x, int y) {
    // closest and open
    int bestDis = Integer.MAX_VALUE;
    int index = 0;
    for (int i = 0; i < list.size(); i++) {
      int dis = calculateDistanceBetweenPoints(list.get(i).xPos, x, y, list.get(i).yPos);
      if (list.get(i).open == true && dis < bestDis) {
        bestDis = dis;
        index = i;
      }
    }

    return index;
  }

  public static int calculateDistanceBetweenPoints(int x1, int x2, int y1, int y2) {
    return Math.round(Math.abs(y1 - y2) + Math.abs(x1 - x2));
    // Δx + Δy = distance
  }
}

/* 
problem 4:
distance 
algorithom to see closest and aviable task
add to list then find closest one 
Δx + Δy = distance

*/