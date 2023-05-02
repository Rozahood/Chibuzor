public class lcm {
    public static void main(String[] args) {
        int[] nums = new int[1,2,3,4,5,6,7];

        int lcm = findLCM(nums);
        for (int i = 1; i < nums.length; i++) {
            lcm = findLCM(lcm, nums[i]);
        }
        return lcm;
    }

    private static int findLCM(int[] nums) {
        int max, min;
        int lcm = 0;

        // Find the maximum and minimum of the two numbers
        int num1 = 0;
        int num2 = 0;
        if (num1 > num2) {
            max = num1;
            min = num2;
        } else {
            max = num2;
            min = num1;
        }
        for (int i = 1; i <= max; i++) {
            lcm = max * i;
            if (lcm % min == 0) {
                break;
            }
        }

        return lcm;
    }
}