class Solution {
    boolean twoSum(int arr[], int target) {
        int left = 0;
        int right = arr.length - 1;
        
        Arrays.sort(arr);
        
        while(left < right) {
            int sum = arr[left] + arr[right];
            if(sum == target) return true;
            else if(sum > target) right--;
            else left++;
        }
        return false;
    }
}