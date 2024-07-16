public class _27_Remove_Element {
//Memory using: 41.71MB     Beats: 52.55%
    public static int removeElement(int[] nums, int val) {
        int arrLength = nums.length;
        for(int i = 0; i < arrLength; ){
            if(nums[i] == val){
                moveElement(i, nums);
                arrLength--;
                // Sau khi thực hiện xong thì i vẫn giữ nguyên và chạy tiếp chứ không tăng giá trị
            }
            else{
                i++;
                // Nếu không bằng thì tăng để tránh trường hợp sau khi xóa thì phần tử xét vẫn bằng val

            }
        }
        return arrLength;
    }
// Cách làm đầu tiên
    //     int count = 0;
    //     for(int i = 0; i < nums.length; i++){
    //         if(nums[i] == val){
    //             xoaPhanTu(i, nums);
    //             count++;
    //             if(i != 0) i--;
    //         }
    //     }
    //     return nums.length - count;
    // }
// Xét i-- rồi i++ làm tăng thời gian thực thi --> Gây ra việc quá thời gian

    public static void moveElement(int index, int[] nums) {
        for(int i = index; i < nums.length - 1; i++) {
            nums[i] = nums[i + 1];
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,2,2,3,4};
        int val = 2;
        System.out.println(removeElement(nums, val));
        System.out.println("hehehehehehe");
    }
}
