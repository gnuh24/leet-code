/*
 * @lc app=leetcode id=14 lang=java
 *
 * [14] Longest Common Prefix
 */

// @lc code=start
class Solution {
    public String longestCommonPrefix(String[] strs) {
        String longestCommonPrefix = "";
        String shortestString = strs[0];
        String currentLogest = "";

        for (int i = 0; i < shortestString.length(); i++) {
            currentLogest += shortestString.charAt(i);

            for (int j = 0; j < strs.length; j++) {

                if (strs[j].length() > i) {

                    if (strs[j].charAt(i) != shortestString.charAt(i)) {
                        i = shortestString.length();
                        break;
                    }

                    if (j == strs.length - 1) {
                        if (longestCommonPrefix.length() < currentLogest.length()) {
                            longestCommonPrefix = currentLogest;
                        }
                    }
                } else {
                    i = shortestString.length();
                    break;
                }

            }

        }

        return longestCommonPrefix;
    }

}
// @lc code=end
