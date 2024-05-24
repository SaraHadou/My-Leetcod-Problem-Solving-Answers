// Given an array of integers nums which is sorted in ascending order,
// and an integer target, write a function to search target in nums. If target exists,
// then return its index. Otherwise, return -1.
//
// You must write an algorithm with O(log n) runtime complexity.
//
// Example 1:
//
// Input: nums = [-1,0,3,5,9,12], target = 9
// Output: 4
// Explanation: 9 exists in nums and its index is 4

// https://leetcode.com/problems/binary-search/description/

public class BinarySearch {

    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;
        int output = search(nums, target);
        System.out.println(output);
    }

    public static int search(int[] nums, int target) {

        int first = 0;
        int last = nums.length - 1;

        while (first <= last) {
            int middle = first + (last - first) / 2;
            if (target > nums[middle]) {
                first = middle + 1;
            } else if (target < nums[middle]) {
                last = middle - 1;
            } else {
                return middle;
            }
        }

        return -1;
    }

}
