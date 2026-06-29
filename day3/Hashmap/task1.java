import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		
		HashMap<Integer,Integer> mp = new HashMap<>();
		
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++){
		    int x = sc.nextInt();
		    arr[i] = x;
		}
		
		for(int x: arr){
		    mp.put(x,mp.getOrDefault(x,0)+1);
		}
		
		
		System.out.println(mp.containsKey(2));
		System.out.println(mp.get(2));
		System.out.println(mp.containsValue(2));
// 		System.out.println(mp.getByValue(2));
		
		mp.remove(1);
		System.out.println(mp);
		
		mp.replace(2,0);
		System.out.println(mp);
		
		System.out.println("Size of array: " + mp.size());
		
		System.out.println(mp.keySet());
		
		System.out.println(mp.values());
		
		mp.clear();
		
		System.out.println("Is empty: " + mp.isEmpty());
		
	}
}