import java.util.HashMap;
import java.util.Map;
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> indexMap = new HashMap<>();
        int maxLength = 0;
        int left = 0;
        for (int right = 0; right < s.length(); right++) {
            if (indexMap.containsKey(s.charAt(right))) {
                left = Math.max(left, indexMap.get(s.charAt(right)) + 1);
            }
            indexMap.put(s.charAt(right), right);
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}
