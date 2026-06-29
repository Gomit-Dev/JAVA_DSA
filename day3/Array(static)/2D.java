import java.util.*;

public class Main
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = 3;
		int m = 4;
		
		int[][] arr = new int[n][m];
	    
	    for(int i=0; i<n; i++){
	        for(int j=0; j<m; j++){
	            int x = sc.nextInt();
	            arr[i][j] = x;
	        }
	    }
	    
	    System.out.print("2D Array: ");
	    for(int i=0; i<n; i++){
	        for(int j=0; j<m; j++){
	            System.out.print(arr[i][j]+ ", ");
	        }
	        System.out.print("\n");
	    }
		
	}
}
