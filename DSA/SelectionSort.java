package DSA;

public class SelectionSort {

    public static void main(String[] args) {

        int nums[] = { 6, 5, 2, 8, 9, 4 };
        int size = nums.length;
        System.out.println(size);
        int temp = 0;
        int minIndex = -1;

        for (int i = 0; i < size-1; i++) {
            minIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (nums[minIndex] > nums[j]) {
                    minIndex = j;
                    // System.out.println(minIndex);
                }
            }
            temp = nums[i];
            nums[i] = nums[minIndex];
            nums[minIndex] = temp;

            System.out.println();
            for (int j = 0; j < nums.length; j++) {
                System.out.print(nums[j] + "  ");
            }
        }
    }

}
