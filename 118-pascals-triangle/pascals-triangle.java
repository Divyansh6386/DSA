class Solution {
    public List<List<Integer>> generate(int numRows) {
      List<List<Integer>> nums = new ArrayList<>();
        for(int i=0; i<numRows; i++){
            List<Integer> row = new ArrayList<>();
            for(int j=0; j<=i; j++){
                row.add(icj(i,j));
            }
             nums.add(row);
        }
  return nums;
        
    }
    static int icj(int r, int c){
        if(c==0 || c==r){
            return 1;
        }
        else{
         return icj(r, c -1) * (r - c + 1) / c;
         
         
       
        }

    }
   
}