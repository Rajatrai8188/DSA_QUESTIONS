class Solution {
    public int trap(int[] height) {
        int ans = 0;
        int l=0 ; int r=height.length-1;
        int lmax=0,rmax=0;

        while(l<r){
            lmax = Math.max(lmax,height[l]);
            rmax = Math.max(rmax,height[r]);

            if(lmax<rmax){
                ans += lmax-height[l];
                l++;
            }else{
                ans += rmax-height[r];
                r--;
            }
        }
        return ans;
    }
}







// int n = height.length;
//         int lmax[] = new int[n];
//         int rmax[] = new int[n];
//         int ans = 0;
//         lmax[0] = height[0];
//         rmax[n-1] = height[n-1];
//         for(int i=1 ; i<n ; i++){
//             lmax[i] = Math.max(lmax[i-1] , height[i]);
//         }  

//         for(int j=n-2 ; j>=0 ; j--){
//             rmax[j] = Math.max(rmax[j+1] , height[j]);
//         }

//         for(int i=0 ; i<n ; i++){
//             ans += (Math.min(lmax[i] , rmax[i]) - height[i]);
//         }