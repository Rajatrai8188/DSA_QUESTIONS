class Solution{
    public int maxArea(int[] height){
        int maxarea =0;
        int i=0, j=height.length-1;
        while(i<j){
            int mheight = Math.min(height[i],height[j]);
            int width = j-i;
            int water = mheight * width;
            maxarea = Math.max(water,maxarea);
            if(height[i]< height[j]){
                i++;
            }else
            j--;
        }
        return maxarea;
    }
}





// class Solution {
//     public int maxArea(int[] height) {
//         int max = Integer.MIN_VALUE;
//         int max_water = 0;
//         for(int i = 0; i < height.length; i++){
//             for( int j = i+1; j < height.length; j++){
//                 int high = Math.min(height[i] , height[j]);
//                 int width = j-i;
//                 max_water = high * width;
//                 max = Math.max(max , max_water);
//             }
//         }
//         return max;    
//     }
// }