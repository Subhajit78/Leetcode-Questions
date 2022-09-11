class Solution {
    public boolean validPalindrome(String s) {
        int i =0;
        int j= s.length()-1;
        
        while(i< j){
            if(s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            }else{
           // skip from left or right --> delete atmost one element 
                return IsPalindrome(s ,i+1,j) || IsPalindrome(s,i,j-1);
            }
        }
        return true;
    }
    
    public static boolean IsPalindrome(String s, int i, int j){
         
        while(i< j){
            if(s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            }
            else{
               return false; 
            }
           
    }
         return true;
  }
}