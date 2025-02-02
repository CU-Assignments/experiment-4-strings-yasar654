class Solution {
    public List<Boolean> camelMatch(String[] queries, String pattern) {
        List<Boolean> ans = new ArrayList<>();
            for (String query : queries) {
            ans.add(isMatch(query, pattern));
        }
        return ans;
    }

    static boolean isMatch(String query, String pattern) {
        int count=0;
        for(char ch : query.toCharArray()){
            if(count < pattern.length() && ch == pattern.charAt(count)){
                count++;
            }else if(Character.isUpperCase(ch)){
                return false;
            }
        }
        return count == pattern.length();
    }
}
