import java.util.Arrays;

public class MoveZeros {
    public static void move(int[] nums){
        int pos = 0 ;
        for(int num: nums){
            if(num != 0){
                nums[pos++] = num;
            }
        }
        while(pos < nums.length){
            nums[pos++] = 0;
        }
    }
    public static void main(String[] args) {
        int[] nums = {2,0,5,0,7,0,9,9,0};
        move(nums);
        System.out.println(Arrays.toString(nums));
    }
}
