import java.util.HashMap;

public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
      HashMap<Integer,Integer>map=new HashMap<>();
      for(int i=0;i<nums.length;i++)
      {
        int a=nums[i];
        int b=a;
        if(map.containsKey(b))
        {
            int j=map.get(b);
            if(i-j<=k)
            {
                return true;
            }
        }
        map.put(a,i);
    }
    return false;
}
} {
    
}
