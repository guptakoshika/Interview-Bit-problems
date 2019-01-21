public class Solution {
    public int evalRPN(ArrayList<String> str) {
        //System.out.println(str);
        Stack<Integer> st  = new Stack<>();
        for(int i = 0 ; i < str.size() ; i++)
        {
            String ch = str.get(i);
            if(ch.equals("+") || ch.equals("-") || ch.equals("*") || ch.equals("/")){
                int s = st.peek();
                st.pop();
                int f = st.peek();
                st.pop();
                
                if(ch.equals("+"))
                   st.push(s+f);
                
                else if (ch.equals("*"))
                 st.push(s*f);
                 
                else if(ch.equals("-"))
                  st.push(f -s);
                else if(ch.equals("/"))
                    st.push(f/s);
            }
            else{
                st.push(Integer.parseInt(ch));
            }
        }
        return st.peek();
    }
}
