class Solution {
    public int[][] merge(int[][] internals) {
        int n = internals.length;
        Arrays.sort(internals, (a,b) -> Integer.compare(a[0] , b[0]));

        List <int[]> result = new ArrayList<>();

        result.add(internals[0]);

        for(int i =1 ; i<n ; i++ ){
            int[] lastInternal = result.get(result.size() - 1);
            if(lastInternal[1] >= internals[i][0] && lastInternal[1]    <=  
                internals [i][1]){
                    lastInternal[1] = internals[i][1];
                }
                else if(lastInternal[1] < internals[i][0]) {
                    result.add(internals[i]);
                }
        }
        return result.toArray(new int[result.size()][]);
    }
}