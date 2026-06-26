import java.util.*;

class Main {
    public static void main(String[] args) {
        
        Scanner sc  = new Scanner(System.in);
        
        ArrayList<Integer> arr= new ArrayList<>();

        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            int x = sc.nextInt();
            arr.add(x);
        }

        System.out.println("Before Element at 0: " + arr.get(0) );
        arr.set(0,0);
        System.out.println("After Element at 0: " + arr.get(0) );
        System.out.println("Size of Array: " + arr.size());
        System.out.println("Array: " + arr);
    }
}