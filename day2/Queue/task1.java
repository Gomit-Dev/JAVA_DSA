import java.util.*;

public class Main {
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    Queue<Integer> q = new Linkedlist<>();
	    
	    int n = sc.nextInt();
	    for(int i=0; i<n; i++){
	        int x = sc.nextInt(); 
	        q.offer(x);
	    }
	    
	    System.out.print("Queue: ");
	    while(!isEmpty()){
	        System.out.print( q.peek() + " ");
	        q.poll();
	    }
    }
}