
public class DavidsSolution extends LeetCodeSolution{
    public static void main(String[] args) {
        int[] nums = new int[]{3, 2, 2, 3};
        printArray(nums);
        System.out.println();
        removeElement(nums, 2);
        printArray(nums);
    }

    public static int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {

            if (nums[j] != val) {
                nums[i++] = nums[j];
            }

        }
        return i;
    }

}

