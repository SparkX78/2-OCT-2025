public class SubArraySum {
    public static int arraySum(int[] arr){
        int curr = arr[0];
        int maxSofar = arr[0];
        for(int i = 1; i < arr.length; i++){
            curr = Math.max(arr[i] , curr + arr[i]);
            maxSofar = Math.max(curr, maxSofar);
        }
        return maxSofar;
    }
    public static void main(String[] args) {
        int[] arr = {2,-1,4,1,2,6,-2};
        System.out.println(arraySum(arr));
    }
}
