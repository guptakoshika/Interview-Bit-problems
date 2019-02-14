import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        PriorityQueue<Integer> pq1 = new PriorityQueue<>(Collections.reverseOrder());
        
        long sum = 1;
        for(int i  = 0 ; i< n ; i++)
        {
            pq.add(sc.nextInt());
            if(pq.size() < 3 )
                System.out.println("-1");
            else {
                sum = 1;
                for(int k = 0 ; k< 3 ; k++)
                {
                    sum *= pq.peek();
                    //System.out.println("peek is " + pq.peek());
                    pq1.add(pq.peek());
                    pq.poll();
                }
                for(int k = 0 ; k< 3 ;k++)
                {
                    pq.add(pq1.peek());
                    pq1.poll();
                }
                System.out.println(sum);
            }
        }

    }
}
