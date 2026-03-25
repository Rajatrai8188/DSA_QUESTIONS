class Solution {
    public int beautySum(String s){
        int beauty =0;
        for(int i =0;i<s.length();i++){
            int freq[] = new int[26];
            for(int j =i;j<s.length();j++){
                char ch = s.charAt(j);
                int idx = ch - 'a';
                freq[idx]++;

                int max =0;
                int min =Integer.MAX_VALUE;
                for(int k =0;k<26;k++){
                    if(freq[k] > 0){
                        min = Math.min(min,freq[k]);
                        max = Math.max(max,freq[k]);
                    }
                }
                beauty += (max-min);
            }
        }
        return beauty;
    }
}
