class Solution {
    public int fib(int n) {
        if (n==0) return 0;
        if (n==1) return 1;
        int fib1=0;
        int fib2=1;
        int fib=fib1+fib2;
        
        while(n > 1){
            fib=fib1 + fib2;
            fib1=fib2;
            fib2=fib;
            
            n--;
        }
        return fib;
        
    }
}