package strings;

import java.util.HashMap;

import java.util.HashMap;

public class LongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        // Map to store characters and their last seen indices
        HashMap<Character, Integer> charMap = new HashMap<>();
        
        // Sliding window [start, end]
        int start = 0;
        int end = 0;
        
        while (end < n) {
            char ch = s.charAt(end);
            
            if (charMap.containsKey(ch) && charMap.get(ch) >= start) {
                start = charMap.get(ch) + 1;
            }
            
            charMap.put(ch, end);
           
            maxLength = Math.max(maxLength, end - start + 1);
            end++;
        }
        
        return maxLength;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s)); // Output: 3 (length of "abc")
        
        String s2 = "keep";
        System.out.println(lengthOfLongestSubstring(s2)); // Output: 1 (length of "b")
        
        String s3 = "pwwkew";
        System.out.println(lengthOfLongestSubstring(s3)); // Output: 3 (length of "wke")
    }
}
