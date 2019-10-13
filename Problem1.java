
/*

Linear Approach :

perform the sum of all the numbers which are given in the array.

There are 2 cases:

a) when the missing number is less than the highest number in the array.
b) when the missing number is greater than the highest number in the array.

Case a) we simply add the entrire array and call it sum1;
then we add the integers from 0 to n, call it sum2;
the difference betweent the sum1 and sum2 would give us the desired result.

Case b) we check if length of the array is equal to the highest element, if yes, that means one number is missing 

*/

class Solution {
    
    
    
    public int missingNumber(int[] nums) {
    
        
    
        int sum=0;
        int n=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            sum=sum+nums[i];
            if(nums[i]>n)
            {
                n=nums[i];
            }
        }
        
        if(n==nums.length-1)
        {
            return n+1;
        }
        
        int sum1=0;
        for(int j=0;j<=n;j++)
        {
            sum1=sum1+j;
        }
        
        return sum1-sum;
    }
    
}
