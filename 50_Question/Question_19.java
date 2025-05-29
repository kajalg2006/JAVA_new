public class Question_19 {
    public static int maxProduct(int[] nums) {
        if (nums.length == 0) return 0;

        int maxEndingHere = nums[0];
        int minEndingHere = nums[0];
        int maxSoFar = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int curr = nums[i];
            if (curr < 0) {
                
                int temp = maxEndingHere;
                maxEndingHere = minEndingHere;
                minEndingHere = temp;
            }

            maxEndingHere = Math.max(curr, maxEndingHere * curr);
            minEndingHere = Math.min(curr, minEndingHere * curr);

            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }

        return maxSoFar;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, -2, 4};
        System.out.println("Maximum product subarray: " + maxProduct(nums));

        int[] nums2 = {-2, 0, -1};
        System.out.println("Maximum product subarray: " + maxProduct(nums2));
    }
}
