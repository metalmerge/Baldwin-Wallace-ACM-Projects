import java.util.*;
public class replacementTiles {
	public static void main(String[] args) {
		int num = 2;
	    int[] arr = {3,5,4,6};
//	    int[][] grid = new int[100][100];
	    int count = 100;
//	    for (int e = 0; e < 100; e++) {
//	    	for (int j = 0; j < 100; j++) {
//	    		grid[e][j] = 0;
//	    	}
//	    }
	    for (int i = 0; i < num * 2; i += 2) {
	    	if (arr[i] % 5 != 0 && arr[i+1] % 5 != 0) 
	    		count--;
	    	//corner
	    	else if ((arr[i] == 99 && arr[i+1] == 0) || (arr[i] == 99 && arr[i+1] == 99) ||(arr[i] == 0 && arr[i+1] == 0) ||(arr[i] == 0 && arr[i+1] == 99)) {
	    		count--;
	    	}
	    	//centers
			else if (arr[i] % 10 == 0 && arr[i+1] % 10 == 0) {
				count -= 4;
			}
			else if (arr[i] % 5 == 0 && arr[i+1] % 5 == 0) {
				count -= 2;
			}
//	    	sides
			else {
				count--;
			}
	    	//need edges
	    }
	    System.out.println("Case 1: " + (100-count));
	}
	
}
/*
2
3 5
4 6
*/

/* all cases
 *  corner, edge, centers, sides, non
 */
