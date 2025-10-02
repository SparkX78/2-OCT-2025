import java.util.Arrays;

public class plusOne {
    
    public static int[] plus(int[] digits) {
        int n = digits.length;
        for(int i = n-1; i >= 0; i--){
            if(digits[i] < 9){
                digits[i] = digits[i] + 1;
                return digits;
            }
            digits[i] = 0;
        }
        int[] result = new int[n+1];
        result[0] = 1;
        return result;
        
    }
    public static void main(String[] args) {
        int[] digits = {1,0,9,9};
        int[] ans = plusOne.plus(digits);
        System.out.println(Arrays.toString(ans));
    }
}

