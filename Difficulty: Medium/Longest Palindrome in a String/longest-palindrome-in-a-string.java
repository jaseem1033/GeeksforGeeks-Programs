
class Solution {
    static String max = "";
    
    static String palindrome(String s, int l, int r) {
        while(l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
        }
        return s.substring(l+1,r);
    }
    
    static String longestPalindrome(String s) {
        max = "";
        
        for(int i = 0; i < s.length(); i++) {
            
            String l = palindrome(s, i, i);
            String r = palindrome(s, i, i+1);
            
            String res = (l.length() > r.length()) ? l : r;
            max = (max.length() >= res.length()) ? max : res;
        }
        return max;
    }
}