import java.util.Arrays;

public class _88_Merge_Sorted_Array_two_pointer {
    //Memory using: 41.66MB     Beats: 71.00%

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        while(i >= 0 || j >= 0)
        {
            if(i>= 0 && j >= 0)// Ca i va j deu hop le
            {
                // Tim phan tu lon hon nhet vao mang ai
                if(nums1[i] >= nums2[j])
                {
                    nums1[k--] = nums2[i--];
                }
                else
                {
                    nums1[k--] = nums2[j--];
                }
            }
            else if( i >= 0)// Chi co i hop le
            {
                nums1[k--] = nums2[i--];
            }
            else // Chi co j hop le
            {
                nums1[k--] = nums2[j--];
            }
        }
    }


    public static void main(String[] args) {
        int[] nums1 = {1, 2, 4, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int m = 3;
        int n = 3;
        merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }
}
