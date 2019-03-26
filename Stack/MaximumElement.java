import java.io.*;
import java.util.*;

public class MaximumElement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> s = new Stack<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int t = sc.nextInt();
        while(t-- > 0){
            int ch = sc.nextInt();
            if(ch == 1){
                int n = sc.nextInt();
                s.push(n);
                pq.add(n);
            }
            else if(ch == 2){
               int n =  s.pop();
                pq.remove(n);
            }
            else{
                System.out.println(pq.peek());
            }
        }
    }
}

