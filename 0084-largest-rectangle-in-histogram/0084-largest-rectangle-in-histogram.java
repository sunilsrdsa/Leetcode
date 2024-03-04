class Solution {
    public int largestRectangleArea(int[] heights) {
        
		// TODO Auto-generated method stub
		
		Stack<Integer> s = new Stack<>();
        int n = heights.length;
		int res =0;
		int tp;
		int curr;
		
		for(int i=0; i<n; i++)
		{
			while(s.isEmpty() == false && heights[s.peek()] >= heights[i])
			{
				tp = s.peek();
				s.pop();
				curr = heights[tp] *(s.isEmpty()? i: i-s.peek()-1);
				res = Math.max(curr, res);
			}
			s.push(i);
		}
		
		while(!s.isEmpty())
		{
			tp =  s.peek();
			s.pop();
			curr = heights[tp]*(s.isEmpty()? n: n-s.peek()-1);
			res = Math.max(curr, res);
		}
		
		
		return res;
	
        
    }
}