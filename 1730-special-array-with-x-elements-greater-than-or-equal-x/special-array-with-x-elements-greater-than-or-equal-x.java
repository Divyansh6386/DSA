import java.util.Arrays;

class Solution {
    public int specialArray(int[] nums) {
        Arrays.sort(nums);

        int i = 0;
        int j = nums.length;

        while (i <= j) {
            int m = i + (j - i) / 2;

            int count = 0;
            for (int num : nums) {
                if (num >= m) {
                    count++;
                }
            }

            if (count == m) {
                return m;
            } else if (count > m) {
                i = m + 1;
            } else {
                j = m - 1;
            }
        }

        return -1;
    }
}