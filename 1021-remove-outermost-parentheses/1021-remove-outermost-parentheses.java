class Solution {
    public String removeOuterParentheses(String s) {

        int count =0;

        StringBuilder st = new StringBuilder();

        for(char c : s.toCharArray())
        {
            // Check if first one is opening ( dont append it to StringBuilder as we increment 
            //counter to 1 next ( will be added to StringBuilder
              if(c == '(')
              {
                  if(count !=0)
                  {
                      st.append(c);
                  }
                  ++count;
              }
              else
              {
                  // IF char is ) and count not equal to 1 so that first and last () cancels
                  // remaining will be added to StringBuilder
                  if(count !=1)
                  {
                      st.append(c);
                  }
                  count--;
              }

        }
          // return the string after After removing outer parentheses of each part
        return st.toString();
        
    }
}