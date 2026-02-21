// class Solution {
//     public boolean isPowerOfTwo(int n) {
//         if(n < 0) return false;
//         if(Math.pow(2,30) % n == 0) return true;
//         return false;
//     }
// }
class Solution{
    public boolean isPowerOfTwo(int n){
        if(n <= 0) return false;
        if(n == 1) return true;
        if(n % 2 == 0){
            return isPowerOfTwo(n/2);
        }
        return false;
    }
}