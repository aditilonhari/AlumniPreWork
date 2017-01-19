public class Solution {
	public int longestConsecutive(final List<Integer> a) {
	    
	    if(a.size() == 0)
	        return 0;
	    
	    HashSet<Integer> S = new HashSet<Integer>();
        int ans = 0;
        int n = a.size();
        
        // Hash all the array elements
        for (int i=0; i<n; ++i)
            S.add(a.get(i));
 
        // check each possible sequence from the start
        // then update optimal length
        for (int i=0; i<n; ++i)
        {
            // if current element is the starting
            // element of a sequence
            if (!S.contains(a.get(i)-1))
            {
                // Then check for next elements in the
                // sequence
                int j = a.get(i);
                while (S.contains(j))
                    j++;
 
                // update  optimal length if this length
                // is more
                if (ans<j-a.get(i))
                    ans = j-a.get(i);
            }
        }
        return ans;
	}
}	
