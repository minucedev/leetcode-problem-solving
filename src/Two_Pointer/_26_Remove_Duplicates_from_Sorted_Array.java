package Two_Pointer;

import java.util.Arrays;

public class _26_Remove_Duplicates_from_Sorted_Array {
    //Memory: 44.68Mb   Beats: 49.83%
    public static int removeDuplicates(int[] nums) {
        int arrLen = nums.length;
        for (int i = 0; i < arrLen - 1; ) {
            int cp = 0;
            for (int j = i + 1; j < arrLen; j++) {
                if (nums[i] == nums[j]) {
                    xoaPhanTuTrungLap(nums, j, arrLen);
                    arrLen--;
                    cp++;
                }
            }
            if (cp == 0) i++;
        }
        return arrLen;
    }

    private static void xoaPhanTuTrungLap(int[] nums, int i, int a) {
        for(int j = i ; j < a - 1 ; j++) {
            nums[j] = nums[j + 1];
        }
    }

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int arrLen = removeDuplicates(nums);
        System.out.println(arrLen);
        System.out.println(Arrays.toString(nums));
    }
}
