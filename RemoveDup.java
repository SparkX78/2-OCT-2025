public class RemoveDup {
    public static int removedup(int[] arr){
        int j = 0;
        for(int i = 0; i< arr.length; i++){
            if(arr[j] != arr[i]){
                arr[++j] = arr[i];
            }

        }
        return j+1;
    }
    public static void main(String[] args) {
        int[] arr = {2,2,4,4,5,5,7,7,7,7,1,1,6};
        System.out.println(removedup(arr));
    }
}
