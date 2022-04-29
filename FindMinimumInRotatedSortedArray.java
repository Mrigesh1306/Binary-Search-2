// TC : O(logn)
//SC : O(1)
class Solution {
    public int findMin(int[] nums) {
        if(nums.length==0) return -1;
        if(nums.length==1) return nums[0];
        
        int low = 0;
        int high = nums.length-1;
        
        while(low< high){
            int mid = low+(high-low)/2;
// checks if midpoint is the minnimum element. (element before mid will always be greater)
            if(mid > 0 && nums[mid]<nums[mid-1]) return nums[mid];
    
    //left sorted side and right unsorted side. Minimum will be present in unosrted side
            else if(nums[low] <= nums[mid] && nums[high] < nums[mid]){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return nums[low];
    }
}
