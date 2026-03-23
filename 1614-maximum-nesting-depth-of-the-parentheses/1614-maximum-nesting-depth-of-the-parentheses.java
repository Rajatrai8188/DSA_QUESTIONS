class Solution {
    public int maxDepth(String s) {
        int maxopen =0;
        int result =0;
        for(int i =0;i<s.length();i++){
            if(s.charAt(i) == '('){
                maxopen++;
            }
            else if(s.charAt(i) == ')'){
                maxopen--;
            }
            result = Math.max(maxopen,result);
        }
        return result;
    }
}