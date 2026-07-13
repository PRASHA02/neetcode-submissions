class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length() == 0)
            return true;
        if(t.length() == 0)
            return false;
        int sIdx = 0;
        for (int tIdx = 0; tIdx < t.length() && sIdx < s.length(); tIdx++) {
            if (s.charAt(sIdx) == t.charAt(tIdx)) {
                sIdx++;
            }
        }
        if(sIdx == s.length())
            return true;
        return false;
    }
}