import java.util.Scanner;

public class SearchInRotatedSortedArray {

    public int search(int[] nums, int target) {
        int n = nums.length;
        int low = 0, high = n - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            if (nums[low] <= nums[mid]) {
                if (target >= nums[low] && target < nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (target > nums[mid] && target <= nums[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SearchInRotatedSortedArray searchObj = new SearchInRotatedSortedArray();

        System.out.print("Enter the number of elements in the rotated sorted array: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter the elements of the rotated sorted array:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.print("Enter the target element to search for: ");
        int target = scanner.nextInt();

        int result = searchObj.search(nums, target);

        if (result != -1) {
            System.out.println("Target element " + target + " is found at index " + result);
        } else {
            System.out.println("Target element " + target + " is not found in the array.");
        }

        scanner.close();
    }
}
