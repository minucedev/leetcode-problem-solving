
public class _1295_Find_Numbers_with_Even_Number_of_Digits {
    // Memory: 42.78MB   Beats: 41.54%
    public static int countNums(int nums){
        int flag = 10;
        int count = 1;
        while(true){
            int check = flag - nums;
            if(check >0) break;
            if(check == 0) {
                count++;
                break;
            }
            flag = flag*10;
            count++;
        }
        return count;
    }

    // Memory: 42.34MB   Beats: 89.18%
    public static int newCount(int nums){
        int count = 0;
        while(true){
            count++;
            nums = nums/10;
            if(nums == 0) break;
        }
        return count;
    }

    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            int flag = newCount(num);
            if (flag % 2 == 0) count++;
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = {123, 12, 322, 3123, 1222, 1000};
        System.out.println(findNumbers(nums));

    }
}
