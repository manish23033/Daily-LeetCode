class Solution {
    public int scoreOfString(String s) {
        if(s.length() < 0 ){
            return 0 ;
        }
        char[] ch = s.toCharArray();
        int sum = 0;
        for(int i = 1 ; i< s.length() ; i++){
                  sum +=Math.abs(ch[i] - ch[i-1]);
            }
            
            return sum;
    }
}