public class Solution {
	public ArrayList<ArrayList<Integer>> prettyPrint(int N) {

        int M = 2*N -1;
        int[][] matrix = new int[M][M];
        
        int count = 0;
        int padding = 0;
        while(count <= M/2){
          
          if(count+1 > M/2){
          	matrix[count][count] = 1;
            break;
          }
          
          Arrays.fill(matrix[count], count, M-count, N-count);
          Arrays.fill(matrix[M-1-count], count, M-count, N-count);
          for(int i=count; i<M-count; i++){
          	matrix[i][count] =  N-count;
          }
          for(int i=count; i<M-count; i++){
            matrix[i][M-1-count] = N-count;
          }
          count++;      
          padding++;
        }
        
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        for(int i=0; i < M; i++){
          ArrayList<Integer> temp = new ArrayList<Integer>();    
          for(int j=0; j < M; j++){
    		temp.add(matrix[i][j]);
          }
          result.add(temp);
        }
        return result;
	}
}

