class Solution {
    public int nthUglyNumber(int n) {
        int p2 = 0; 
        int p3 = 0; 
        int p5 = 0; 
        int result[] = new int[n];
        result[0] = 1;
        int n2 = 2 * result[p2];
        int n3 = 3 * result[p3];
        int n5 = 5 * result[p5];
        
        for(int i = 1; i < n; i++){
            int min = Math.min(n2, Math.min(n3, n5));
            result[i] = min;
            if(min == n2){
                p2++;
                n2 = 2 * result[p2];
            }
            if(min == n3){
                p3++;
                n3 = 3 * result[p3];
            }
            if(min == n5){
                p5++;
                n5 = 5 * result[p5];
            }
        }
        return result[n-1];
    }
}
