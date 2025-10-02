import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {
    public static  boolean containsDup(int[] nums) {
        Map<Integer, Boolean> map = new HashMap<>();
        for(int num : nums){
            if(map.containsKey(num)){
                return true;
            }
            map.put(num, true);
        }
        return false;
        
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,0,4};
        System.out.println(containsDup(nums));
    }
}
