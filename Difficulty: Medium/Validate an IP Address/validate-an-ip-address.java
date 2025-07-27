class Solution {
    public boolean isValid(String s) {
        String[] arr = s.split("\\.");
        if(arr.length != 4) return false;
        
        for(String temp : arr) {
            if(temp.length() == 0) return false;
            int x = Integer.parseInt(temp);
            if(String.valueOf(x).length() != temp.length()) return false;
            
            
            if(x < 0 || x > 255) return false;
        }
        return true;
    }
}