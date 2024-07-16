import java.util.Arrays;

public class _88_Merge_Sorted_Array {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int numsi : nums2) {
            chenphantuvaomang(nums1, m, numsi);
            m++;
        }
    }

    private static void chenphantuvaomang(int[] nums1, int m, int nums2i) {
        for (int i = 0; i < m; i++) {
            if(nums2i < nums1[i]) {
                dichchuyenvitri(nums1, nums2i, i, m);
                return;
            }
        }
        nums1[m] = nums2i;

    }

    private static void dichchuyenvitri(int[] nums1, int nums2i, int index, int m) {
        for(int i = m; i > index; i--) {
            nums1[i] = nums1[i - 1];
        }
        nums1[index] = nums2i;
    }

    public static void main(String[] args) {
        int[] nums1 = {2, 3, 4, 5, 0, 0, 0};
        int[] nums2 = {3, 0, 6};
        int m = 4, n = 2;
        merge(nums1, m, nums2, n);

    }
}
