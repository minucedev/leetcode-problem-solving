package Two_Pointer;

import java.util.Arrays;

public class _26_Remove_Duplicates_from_Sorted_Array_two_pointer {
    public static int removeDuplicates(int[] nums) {
        int arrLen = nums.length;
        int left = 0;
        int right = 1;
        while (right < arrLen) {
            if(nums[right] != nums[left] ) {
                nums[left] = nums[right];
                arrLen--;
            }
            else {
                left = right;
                right = right + 1;
            }
        }
        return arrLen;
    }

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int arrLen = removeDuplicates(nums);
        System.out.println(arrLen);
        System.out.println(Arrays.toString(nums));

    }
}
