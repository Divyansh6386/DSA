class Solution {
    public boolean isPerfectSquare(int num) {
        int i =1;
        int j = num;
        while(i<=j){
            int a = i+(j-i)/2;
            long m =(long)a*a; 
            if(m == num){
                return true;
            }
            else if(m < num){
                i =a+1;
            
            }
            else{ 
                j=a-1;
            }
        }
        return false;
        
    }
}