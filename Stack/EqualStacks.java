import java.math.*;
import java.util.*;
public class EqualStacks {

    /*
     * Complete the equalStacks function below.
     */
    static int equalStacks(int[] h1, int[] h2, int[] h3 , int[] sum) {
        int minsum = 0;

        minsum = (int)Math.min(sum[2],(int)Math.min(sum[1] ,sum[0]));
        //System.out.println(sum[0] + " " + sum[1] + " " + sum[2] + " " + minsum);
        int i = 0 ;
        int j = 0;
        int k = 0;
        boolean f = true;
        while(f){
            f = false;
            while(sum[0] > minsum){
                f = true;
                sum[0] = sum[0] - h1[i];
                i++;
                if(minsum > sum[0]){
                    minsum = sum[0];
                    break;
                }
            }
             if(i == h1.length)
            {
                return 0;
            }
            while(sum[1] >minsum){
                f = true;
                sum[1] = sum[1] - h2[j];
                j++;
                if(minsum > sum[1]){
                    minsum = sum[1];
                    break;
                }
            }
            if(j == h2.length)
            {
                return 0;
            }
            while(sum[2] >minsum){
                f = true;
                sum[2] = sum[2] - h3[k];
                k++;
                if(minsum > sum[2]){
                    minsum = sum[2];
                    break;
                }
            }
            if(k == h3.length)
            {
                return 0;
            }
        }
        return minsum;
    }

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        int[] h1 = new int[n1];
        int[] sum = new int[3];

        for (int h1Itr = 0; h1Itr < n1; h1Itr++) {
            h1[h1Itr] = sc.nextInt();
            sum[0] = sum[0] + h1[h1Itr];
        }

        int[] h2 = new int[n2];


        for (int h2Itr = 0; h2Itr < n2; h2Itr++) {
            h2[h2Itr] = sc.nextInt();
            sum[1] = sum[1] + h2[h2Itr];
        }

        int[] h3 = new int[n3];

        for (int h3Itr = 0; h3Itr < n3; h3Itr++) {
            h3[h3Itr] = sc.nextInt();
            sum[2] = sum[2] + h3[h3Itr];
        }

        int result = equalStacks(h1, h2, h3,sum);

        System.out.println(result);
    }
}
