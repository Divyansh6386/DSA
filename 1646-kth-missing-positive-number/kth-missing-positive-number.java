class Solution {
    public int findKthPositive(int[] arr, int k) {
      int i=1;
      int j=0;
      while(k>0){
        if(j < arr.length &&i == arr[j]){
          j++;
        }
        else{
            k--;
            
        }
        i++;
      }
      return i-1;
    }
}