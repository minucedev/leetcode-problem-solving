package Two_Pointer;

import java.util.Arrays;

//Cho dãy số nguyên dương a1,a2,…,an đã được sắp xếp tăng dần và số nguyên dương k. Tìm 2 số i, j sao cho tổng ai+aj (i<j) có giá trị đúng bằng k.
//Input:
//Dòng đầu tiên ghi số nguyên dương n (1<n≤106) và số nguyên dương k.
//Dòng tiếp theo ghi n số nguyên dương lần lượt là a1,a2,…,an.
//Output:
//Dòng duy nhất in ra 2 số nguyên dương lần lượt là giá trị i, j thỏa mãn bất kỳ. Nếu không có cặp giá trị thỏa mãn, in ra −1.
public class Study_Bai1 {

    public static int[] findSum(int[] nums, int target) {
        int[] arr = new int[2];
        int left = 0;
        int right = nums.length - 1;
        int sum = 0;

        while (left < right) {
            sum = nums[left] + nums[right];
            if(sum == target) {
                arr[0] = left;
                arr[1] = right;
                return arr;
            }
            else if(sum > target) {
                right--;
            }
            else{
                left++;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 5, 8};
        // [1, 3, 4, 5, 8]
        //  0  1  2  3  4
        int target = 8;
        int[]result = findSum(nums, target);
        if(result == null) System.out.println(-1);
        else System.out.println(Arrays.toString(result));
    }
}
