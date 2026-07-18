public class FindGCD {
    
}
class Solution {
    public int findGCD(int[] nums)
    {
        int small=nums[0];
        int large=nums[0];
        int i;
       for(i=0;i<nums.length;i++)
       {
        if(nums[i]<small)
          {
            small=nums[i];
          }
          if(nums[i]>large)
          {
            large=nums[i];
          }
        }
        
         for(int j = small; j >= 1; j--)
         {
             if (small % j == 0 && large % j == 0)
             {
            return j;
             }
         }
        return 1;
    }
}