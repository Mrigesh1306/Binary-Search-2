// TC : O(logn)
// SC : O(1)

class Solution {
    public int[] searchRange(int[] nums, int target) {
        //find the start and end range
        int result[] = new int[2];
        result[0]= findStartIndex(nums,target);
        result[1]= findEndIndex(nums,target);
        return result;
    }
    
    public int findStartIndex(int[] nums, int target){
       int index =-1; 
        int low = 0;
        int high = nums.length-1;
        
        
        while(low<=high){
            int mid = low+(high-low)/2;
            if(nums[mid] >= target){
                high = mid-1;
            }else{
                low=mid+1;
            }
            if(nums[mid]==target) index=mid;
        }
        
        return index;
    }
    
    public int findEndIndex(int[] nums, int target){
        int index =-1; 
        int low = 0;
        int high = nums.length-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(nums[mid] <= target){
                
                low=mid+1;
            }else{
                high = mid-1;
            }
            if(nums[mid]==target) index=mid;
        }
        
        return index;
    }
    
}
