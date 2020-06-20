import java.util.Arrays;

public class FindBestValue {
    
    public static void main(String[] args) {

        int[] arr = new int[]{1,2,23,24,34,36};
    
        int target = 110;

        System.out.println(findBestValue(arr, target));
    }

    private static int findBestValue(int[] arr, int target) {
        if (0 == target) {
            return 0;
        }
        Arrays.sort(arr);
        int avrage = Math.round((float)target / arr.length);
        int sum = 0;
        for (int i = 0;i < arr.length;i++) {
            sum += arr[i];
            if (arr[i] > avrage && i != arr.length -1) {
                
                if (i == 0) {
                    return avrage;

                } else {

                    return (Math.round((target - arr[i - 1])/(arr.length - i)));
                }
            }
            if (sum > target && i == arr.length - 1) {
                return target - sum + arr[arr.length - 1];
            }
        }
        
        return arr[arr.length - 1];
       
    }

    
}