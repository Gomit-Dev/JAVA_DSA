import java.util.*;

public class Main {

	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    LinkedList<Integer> ll = new LinkedList<>();
	    
	    int n = sc.nextInt();
	    for(int i=0; i<n; i++){
	        int x = sc.nextInt();
	        ll.add(x);
	    }
	    
	    System.out.println("LinkedList: " + ll);
		
        System.out.println(ll.get(0));
	    
	    //inserting at first 
	    
	    ll.addFirst(0);
	    
	    //inserting at end
	    
	    ll.addLast(10);
	    
	    System.out.println("LinkedList: " + ll);
	    
	    ll.removeFirst();
	    
	    System.out.println( "LinkedList: " + ll );
	    
	}
}