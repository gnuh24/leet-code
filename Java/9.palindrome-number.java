/*
 * @lc app=leetcode id=9 lang=java
 *
 * [9] Palindrome Number
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(int x) {
        String string = String.valueOf(x);
        int length = string.length();

        for (int i =0, j = length - 1; 
            i <= j ; 
            i++, j--){
            if (string.charAt(i) != string.charAt(j) ){
                return false;
            }
        }
        return true;
    }
}
// @lc code=end

