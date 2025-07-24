// User function Template for Java

class Solution {
    public static ArrayList<Integer> bitonicGenerator(int arr[]) {
        int n = arr.length;
        List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();
        ArrayList<Integer> res = new ArrayList<>();
        
        for(int i = 0; i < n; i++) {
            if(i % 2 == 0) even.add(arr[i]);
            else odd.add(arr[i]);
        }
        
        Collections.sort(even);
        Collections.sort(odd, Collections.reverseOrder());
        
        int k = 0;
        for(int i : even) res.add(i);
        for(int i : odd) res.add(i);
        return res;
    }
}
