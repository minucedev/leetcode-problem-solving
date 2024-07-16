public class _27_Remove_Element_two_pointer {
    //Memory using: 41.66MB     Beats: 71.00%
    public static int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,2,3,3,4};
        int val = 2;
        System.out.println(removeElement(nums, val));
    }
}
