class Solution {
    public int mySqrt(int x) {
        if(x==0){
            return 0;
        }
        int i=1;
        int j =x;
        int ans =0;
        
        while(i<=j){
            int m = i+(j-i)/2;
            long mid = (long)m*m;
            if(mid == x){
                 return m;
            }
            else if(mid > x){
                j = m-1;
            }
            else {
                ans = m;
                i = m+1;
            }
        }
        return ans;
        
    }
}