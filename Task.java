import java.util.ArrayList;

public class Task {
  public int xPos;
  public int yPos;
  public int amount;
  public boolean open;
  public int num;
  public ArrayList<Integer> prerec;

  public Task(int n, int x, int y, int a, ArrayList<Integer> pre) {
	num = n;
    xPos = x;
    yPos = y;
    amount = a;
    open = false;
    prerec = pre;
  }
  public Task(int n, int x, int y, int a) {
	  num = n;
    xPos = x;
    yPos = y;
    amount = a;
    open = true;
    prerec = new ArrayList<Integer>();

  }

}