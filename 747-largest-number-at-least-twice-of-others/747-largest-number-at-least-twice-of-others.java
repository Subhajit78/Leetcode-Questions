class Solution {
    public int dominantIndex(int[] nums) {
        int len =nums.length, max=0 , maxIndex=0;
        
        for(int i=0; i<len; i++){
            if(nums[i] > max){
                max=nums[i];
                maxIndex=i;
            }
            
        }
        for(int i=0; i<len; i++){
            if(i!=maxIndex &&(nums[i]*2 > max)){
                return -1;
                
            }
        }
        return maxIndex;
        
    }
}