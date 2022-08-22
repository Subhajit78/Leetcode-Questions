class Solution {
    public int numSubarrayBoundedMax(int[] nums, int left, int right) {
        int start=-1,end=-1,result=0;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]>right){
                start=end=i;
                continue;
            }
            if(nums[i]>=left){
                end=i; 
            }
            result=result+end-start;
        }
        return result;
    }
}