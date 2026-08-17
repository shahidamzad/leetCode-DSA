class Solution {
   static List<String> ans;

   public void print(int n, int close, int open , String s){
    if(s.length() == 2*n ){
        ans.add(s);
        return;
    }
    if (open < n) 
            print(n, close, open + 1, s + "(" );
        

        if (close < open) 
            print(n, close + 1, open, s + ")");
        
   }
    public List<String> generateParenthesis(int n) {
        ans = new ArrayList<>();

        print(n,0,0,"");

        return ans;
    }
}