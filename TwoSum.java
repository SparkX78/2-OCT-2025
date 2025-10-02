import java.util.*;
public  class TwoSum{
    public static int[] sum2(int[] arr, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i =0; i < arr.length; i++){
            int complement = target - arr[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            }
            map.put(arr[i], i);
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        int[] arr = {5,7,9,12,1,3};
        int target = 16;
        int[] result = TwoSum.sum2(arr, target);
        System.out.println(Arrays.toString(result));
    } 

}