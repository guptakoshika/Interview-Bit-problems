public class Solution {
    private void check(ArrayList<String> A , int index , int r )
    {
        String str = A.get(r);
        str = str.substring(0,index)+'O'+str.substring(index+1);
       A.set(r , str);
       
       // A.set(r , A.get(r).replace(A.get(r).charAt(index),'O'));
       
        if(index-1 >= 0 && A.get(r).charAt(index-1) == 'X')
        {
            check(A , index-1 , r);
        }
        
        if(index+1 < A.get(r).length() && A.get(r).charAt(index+1) == 'X')
        {
            check( A , index+1 , r);
        }
        
        if(r-1 >= 0 )
        {
            
            if(A.get(r-1).charAt(index) == 'X')
            {
                 check(A , index , r-1);
            }
        }
        
        if(r+1 < A.size() )
        {
            
            if(A.get(r+1).charAt(index) == 'X')
            {
                check(A , index , r+1);
            }
        }
        return ;
    }
    public int black(ArrayList<String> A) {
        int count = 0 ;
        int r = 0;
        for(int j=0;j<A.size();j++)
        {
          for(int i = 0 ; i < A.get(j).length() ; i++)
          {
              
              if(A.get(j).charAt(i) == 'X')
                {
                    //System.out.println("im calling check " + A);
                    check(A , i , r);
                    //System.out.println("after calling check " + A);
                    count ++;
                }
          }
          r++;
        }
        return count;
    }
}
