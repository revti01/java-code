import java.util.*;

public class hashing3 {
    public static void main(String args[]) {
        int arr[] = {10, 2, -2, -20, 10}; // Input array
        int k = -10; // Target sum

        HashMap<Integer, Integer> map = new HashMap<>(); // <Sum, Frequency>

        map.put(0, 1); // To handle subarrays that start from index 0
        int ans = 0;
        int sum = 0;

        for (int j = 0; j < arr.length; j++) {
            sum += arr[j];

            if (map.containsKey(sum - k)) {
                ans += map.get(sum - k);
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        System.out.println("Number of subarrays with sum " + k + " is: " + ans);
    }
}
