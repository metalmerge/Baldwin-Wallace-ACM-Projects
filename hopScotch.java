public class hopScotch {
  public static void main(String[] args) {
    int num = 7;
    int[] arr = {1, 3, 6, 7, 2, 5, 4 };

    int Bestdistance = 0;
    for (int i = 1; i <= num; i++) {
      int index = findIndex(arr, i);
      int index2 = findIndex(arr, (i + 1)); // might error
      int distance = Math.abs(index2 - index) - 1;
      if (Bestdistance < distance) {
        Bestdistance = distance;
      }
    }
		if (Bestdistance >= 4)
    System.out.println("Case 2: INVALID " + Bestdistance);
		else 
			System.out.println("Case 2: VALID " + Bestdistance);

  }
  public static int findIndex(int arr[], int t) {
    if (arr == null) {
      return -1;
    }
    int len = arr.length;
    int i = 0;
    while (i < len) {
      if (arr[i] == t) {
        return i;
      } else {
        i = i + 1;
      }
    }
    return -1;
  }
}