import java.util.*;
public class SearchInsert {
    public static int insertPos(int[] nums, int left, int right, int target){
        Arrays.sort(nums);
        if(left >= right){
            return left;
        }
        else{
            int mid = left + (right - left)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] < target){
                return insertPos(nums, mid +1, right, target);
            }
            else{
                return insertPos(nums, left, mid-1, target);
            }

        }
        

    }
    public static void main(String[] args) {
        int[] nums = {2,4,7,9,12,15,19};
        int left = 0;
        int right = nums.length;
        int target = 16;
        System.out.println(insertPos(nums, left, right, target));
    }
}
