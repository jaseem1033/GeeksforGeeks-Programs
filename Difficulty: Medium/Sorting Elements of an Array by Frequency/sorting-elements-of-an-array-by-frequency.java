import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int p = 1; p <= t; p++) {
            int n = sc.nextInt();
            Integer arr[] = new Integer[n];
            
            for(int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            }
            
            Arrays.sort(arr, (a,b) -> {
               if(map.get(a) == map.get(b)) return a-b;
               return map.get(b) - map.get(a);
            });
            
            for(int i : arr) System.out.print(i + " ");
            System.out.println();
            map.clear();
        }
    }
}