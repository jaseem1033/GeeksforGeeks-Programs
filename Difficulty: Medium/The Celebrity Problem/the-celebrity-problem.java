class Solution {
    public int celebrity(int mat[][]) {
        int arr[] = new int[mat.length];
        
        Stack<Integer> s = new Stack<>();
        for(int i = 0; i < mat.length; i++) {
            s.push(i);
        }
        
        while(s.size() > 1) {
            int temp1 = s.pop();
            int temp2 = s.pop();
            
            if(mat[temp1][temp2] == 1 && mat[temp2][temp1] == 1
               || mat[temp1][temp2] == 0 && mat[temp2][temp1] == 0) continue;
               
            else if(mat[temp1][temp2] == 1) s.push(temp2);
            else s.push(temp1);
        }
        
        if(s.isEmpty()) return -1;
        
        else {
            int temp = s.pop();
            
            for(int i = 0; i < mat.length; i++) {
                if(i == temp) continue;
                if(mat[i][temp] != 1) return -1;
                if(mat[temp][i] != 0) return -1;
                
            }
            
            return temp;
        }
    }
}