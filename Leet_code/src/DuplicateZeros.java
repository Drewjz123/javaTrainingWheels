public class DuplicateZeros {
    public static void main(String[] args) {
        int[] array1 = new int[]{1, 0, 2, 3, 0, 4, 5, 0};

        duplicateZeros(array1);
    }


    public static void duplicateZeros(int[] array1) {
        int[] array2 = new int[array1.length];
        int counter = 0;

        for (int i = 0; i < array1.length; i++) {
            if (counter == array1.length) {
                break;
            }
            array2[counter] = array1[i];
            if (array1[i] == 0) {
                counter++;
                array2[counter] = 0;
            }
            counter++;
        }
        array1 = array2;

        for (int nums1 : array1) {
            System.out.print(nums1);
        }
    }


}

