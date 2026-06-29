import java.util.*;

public class Main
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = 3;
		int m = 4;
		int p = 5;
		
		int[][][] arr = new int[n][m][p];
	    
	    for(int i=0; i<n; i++){
	        for(int j=0; j<m; j++){
	            for(int k=0; k<n; k++){
    	            int x = sc.nextInt();
    	            arr[i][j][k]3 = x;
	        }
	    }
	    
	    System.out.print("2D Array: ");
	    for(int i=0; i<n; i++){
	        for(int j=0; j<m; j++){
	            for(int k=0; k<n; k++){
	                System.out.print(arr[i][j][k]+ ", ");    
	            }
	        }
	        System.out.print("\n");
	    }
		
	}
}