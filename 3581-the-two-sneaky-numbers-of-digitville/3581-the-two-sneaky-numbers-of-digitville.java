import java.util.*;
class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
         List<Integer> res = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
        
        if(list.contains(nums[i])) res.add(nums[i]); 
        if(res.size()==2) break;
        else{
            list.add(nums[i]);
        }
        }
       //.stream() to [2,4,6] and .mapToInt(i->i) it means each integer 
       // extracted one by one;
        return res.stream().mapToInt(i->i).toArray();
    }
}