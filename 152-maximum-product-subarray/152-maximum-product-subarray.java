class Solution {
    public int maxProduct(int[] nums) {
        int ans =nums[0];
        int min= ans;
        int max=ans;
        int n=nums.length;
        
        for(int i=1; i<n;i++){
            if(nums[i]<0){
                max=max^min;
                min=max^min;
                max=max^min;
                
            }
            
            max=Math.max(nums[i],max*nums[i]);
            min=Math.min(nums[i],min*nums[i]);
            ans=Math.max(ans,max);
            
        }
        
        return ans;
        
    }

}