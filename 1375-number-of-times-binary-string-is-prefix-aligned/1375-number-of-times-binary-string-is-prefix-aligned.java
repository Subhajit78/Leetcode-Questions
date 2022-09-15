class Solution {
    public int numTimesAllBlue(int[] flips) {
        int rightMax=1;
        int count = 0;
        for(int i=0;i<flips.length;i++){
            if(flips[i]>rightMax){
                rightMax=flips[i];
            }
            if(rightMax==i+1)
                count++;
        }
        return count;
    }
}