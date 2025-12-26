/*
 * @lc app=leetcode id=3 lang=java
 *
 * [3] Longest Substring Without Repeating Characters
 */

// @lc code=start
class Solution {
	class Solution {
		public int lengthOfLongestSubstring(String s) {
			String maxSubString = "";
			String currentSubString = "";
			
			if (s.length() > 1) {
				
				for (int i = 0; i < s.length(); i++) {
					char j = s.charAt(i);
					
					if (i > 0) {
						int index = currentSubString.indexOf(j);
						if (index != -1) {
							
							String temp = currentSubString.substring(index + 1);
							
							if (currentSubString.length() > maxSubString.length()) {
								maxSubString = currentSubString;
							}
							
							currentSubString = temp;
						}
					}
					
					currentSubString += j;
					
				}
				if (currentSubString.length() > maxSubString.length()) {
					maxSubString = currentSubString;
				}
			} else {
				maxSubString = s;
			}
			
			
			return maxSubString.length();
		}
	}
}
// @lc code=end

