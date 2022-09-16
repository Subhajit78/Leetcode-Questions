class Solution {
    public int[] numsSameConsecDiff(int n, int k) {
        List<Integer> res = new ArrayList<Integer>();
        if(n==1)
            return new int[] {0,1,2,3,4,5,6,7,8,9};
        for(int i=1;i<10;++i)
            dfs(n-1,i,k,res);
        return res.stream().mapToInt(i->i).toArray();
        
        
    }
    
    private void dfs(int n,int i,int k,List<Integer> res){
        if(n==0){
            res.add(i);
            return;
        }
        Integer tailDigit=i%10;
        if(tailDigit + k<10)
            dfs(n-1,i*10+tailDigit+k,k,res);
        if(k>0 &&tailDigit-k>=0)
            dfs(n-1,i*10+tailDigit-k,k,res);
       
            
    }
}