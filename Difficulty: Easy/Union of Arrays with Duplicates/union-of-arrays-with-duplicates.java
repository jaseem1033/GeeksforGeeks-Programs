class Solution {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<Integer>();
        
        for(int i : a)  set.add(i);
        for(int i : b)  set.add(i);
        
        for(int i : set) list.add(i);
        
        return list;
    }
}