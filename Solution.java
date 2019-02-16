import java.util.* ;

class Solution {
    public static void main(String args[] ) throws Exception {
    
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0 ; i< m ;i++ )
        {
            pq.add(sc.nextInt());
        }
        int sum = 0;
        for(int i =0 ; i < n ; i++)
        {
            int b = pq.peek();
            pq.poll();
            sum += b;
            b -= 1;
            pq.add(b);
        }
        System.out.println(sum);
    }
}
