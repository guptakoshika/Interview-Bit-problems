import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int n = sc.nextInt();
        int k = sc.nextInt();
        for(int i  = 0 ; i< n ; i++){
            pq.add(sc.nextInt());
        }
        int count =0;
        while(pq.peek() < k && pq.size() > 1){
        int f = pq.poll();
        int s = pq.poll();
        pq.add((1*f)+2*s);
        count++;
        }
        if(pq.peek() >= k)
             System.out.println(count);
        else
           System.out.println("-1");
    }
}
