// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :
 /* 
 Bruteforce
 1. Use new array and place in right positions.
 */

class Solution {
    public void rotate(int[] nums, int k) {
        
        if(nums == null || nums.length==0) return;
        if(nums.length==1) return;
        
        int n = nums.length;
        
        if(k > n){
            k= k%n;
        }
        
        int j = 0;
        
        int[] temp = new int[n];
        for(int i=0;i<n;i++){
            temp[i] = nums[i];
        }
        for(int i=(n-k);i<n;i++){
            nums[j++] = temp[i];
        }
        for(int i=0;i<(n-k);i++){
            nums[j++] = temp[i];
        }
        
    }
}


// Time Complexity : O(Nk)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :
 /* 
 Shift 1 by 1 element for k times 
 */

class Solution {
    public void rotate(int[] nums, int k) {
        
        if(nums == null || nums.length==0) return;
        if(nums.length==1) return;
        
        int n = nums.length;
        
        if(k > n){
            k= k%n;
        }

        
        for(int i=0;i<(n-k);i++){
            int x = nums[0];
            for(int l=1;l<n;l++){
                nums[l-1] = nums[l];
            }
            nums[n-1] = x;
        }
        
    }
}




// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :
 /* Reverse
 1. Reverse 0 to n-k and then n-k+1 to n
 2. Reverse the entire array
 */
class Solution {
    public void rotate(int[] nums, int k) {
        
        if(nums == null || nums.length==0) return;
        if(nums.length==1) return;
        
        int n = nums.length;
        
        if(k > n){
            k= k%n;
        }
        
        reverse(nums, 0, (n-k-1));
        reverse(nums, n-k, n-1);
        reverse(nums, 0, n-1);
        
    }
    
    private void reverse(int[] nums, int i, int j){
        while(i<j){
            swap(nums, i, j);
            i++; j--;
        }
    }
    
    private void swap(int[] nums, int i, int j){
        int temp = nums[j];
        nums[j] = nums[i];
        nums[i] = temp;
    }
}