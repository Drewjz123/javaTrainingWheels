public class LeetCodeSolution {
    static int count = 0;
    static int[] nums = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
    static int length = nums.length;

    public static void main(String[] args) {
        printArray(nums);
        removeElement(nums, 2);
        System.out.println();
        printArray(nums);
        System.out.println();
        System.out.print("Length of the array is: " + length);
    }

    public static int removeElement(int[] nums, int val) {

        for (int i = 0; i < length; i++) {
            if (nums[i] == val) {
                shiftElements(nums, i);
            }
        }

        return length;
    }


    public static void shiftElements(int[] nums, int postion) {

        if (postion != length - 1) {
            for (int i = postion + 1; i < length; i++) {

                nums[i - 1] = nums[i];

            }
            length--;

        } else {
            length--;
        }
    }

    public static void printArray(int nums[]) {
        for (int iterator : nums) {
            System.out.print(iterator);
        }
    }

    public static void countVal(int nums[], int val) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                count++;
            }
        }
    }
}
