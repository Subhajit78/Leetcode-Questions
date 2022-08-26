class Solution {
    public int[] sortArrayByParity(int[] nums) {
//         int ans[]= new int[nums.length];
//         int counter =0;
//         for(int i=0;i<nums.length;i++){
//             if(nums[i]%2==0){
//                 ans[counter]=nums[i];
//                 counter++;
//             }
                
//         }
//           for(int i=0;i<nums.length;i++){
//             if(nums[i]%2==1){
//                 ans[counter]=nums[i];
//                 counter++;
//             }
                
//         }

//          return  ans;   
        
        
        int i=0;
        int j= nums.length-1;
        while(i < j){
            if(nums[i] % 2 > nums[j] %2 ){
                nums[i]=nums[i] ^ nums[j];
                nums[j]=nums[i] ^ nums[j];
                nums[i]=nums[i] ^ nums[j];
            }
            
            if(nums[i]%2==0) i++;
            if(nums[j]%2==1) j--;
        }
        
        return nums;
      }
}