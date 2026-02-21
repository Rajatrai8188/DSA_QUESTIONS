// class Solution {
//     public boolean isPowerOfFour(int n) {
//         if(n <= 0 ) return false;
//         if(Math.pow(4,15) % n == 0) return true;
//         return false;
//     }
// }
class Solution {
    public boolean isPowerOfFour(int n) {
        if(n <= 0 ) return false;
        if(n == 1) return true;
        if(n % 4 == 0){
            return isPowerOfFour(n/4);
        }
        return false;
    }
}