class Solution {
    public void sortColors(int[] nums) {
       int i=0;
       int k=0;
       int j= nums.length-1;
       int temp=0;
       while(i<=j){
        if(nums[i] == 0){
            temp = nums[k];
            nums[k] = nums[i];
            nums[i] = temp;
            i++;
           k++;
        }
        else if(nums[i] == 1){
           i++;
        }
        else{
         temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;

                j--;
        }
       }
        
    }
}