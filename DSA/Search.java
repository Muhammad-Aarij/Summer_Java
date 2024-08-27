package DSA;

public class Search {

    public static void main(String[] args) {
        int nums[] = new int[1000];
        int target = 900;
        int result1 = LinearSearch(nums, target);
        int result2 = BinarySearch(nums, target);
        System.out.println(result1);
        System.out.println(result2);
    }

    public static int LinearSearch(int[] nums, int target) {
        int steps = 0;
        for (int i = 0; i < nums.length; i++) {
            steps++;
            if (nums[i] == target) {
                System.out.println("Steps in Linear Search: " + steps);
                return i;
            }
        }
        System.out.println("Steps in Linear Search: " + steps);
        return -1;
    }

    public static int BinarySearch(int[] nums,int target) {
        int steps = 0;
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            steps++;
            int mid = (left + right) / 2;

            if (nums[mid] == target) {
                System.out.println("Steps in Binary Search: " + steps);
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println("Steps in Binary Search: " + steps);
        return -1;
    }

}
