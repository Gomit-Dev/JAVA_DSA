import java.util.*;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Stack<Integer>st = new Stack<>():

        int n = sc.nextInt();
        while(n == 0 ){
            int x = sc.nextInt();
            st.push(x);
            n--;
        }

        System.out.print("Stack: ");
        while(!st.empty()){
            System.out.print(st.peek() + " ")
            st.pop();
        }
    }
}