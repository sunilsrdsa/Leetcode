class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<Character>();

        for(char c : s.toCharArray())
        {
            if(c == '(' || c == '{' || c =='[')
            {  
                //push values to stack only if its opening parenthesis
                st.push(c);
            }
            else
            {
                if(st.empty())
                {
                    return false;
                }
                else if(matching(st.peek(), c) == false)
                {
                    return false;
                }
                else
                {
                    // remove the top of stack value if its matching with string value 
                    st.pop();
                }
            }
        }

       // If stack is empty means valid paraenthesis
        return st.empty();
        
    }
  // to check top of stack has opening parenthesis and string has closing parenthesis so it g  gets cancels out
    static boolean matching(char a, char b)
    {
        return ((a == '(' && b == ')')|| (a == '{' && b == '}') || (a == '[' && b == ']'));
    }
}