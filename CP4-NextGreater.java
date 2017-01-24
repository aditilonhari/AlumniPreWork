public class Solution {
	public ArrayList<Integer> nextGreater(ArrayList<Integer> a) {
	    
	    if(a.size() == 0)
	        return null;
	        
	    ArrayList<Integer> result = new ArrayList<>();
	    for(int i=0; i<a.size(); i++){
	        int currentValue = a.get(i);
	        boolean foundMaxValue = false;
	        
	        for(int j=i+1; j<a.size(); j++){
	           int nextValue = a.get(j);
	           if(nextValue > currentValue){
	               result.add(nextValue);
	               foundMaxValue = true;
	               break;
	           } 
	        }
	        
	        if(!foundMaxValue){
	            result.add(-1);
	        }
	    }
	    
	    return result;
	}
}
	
