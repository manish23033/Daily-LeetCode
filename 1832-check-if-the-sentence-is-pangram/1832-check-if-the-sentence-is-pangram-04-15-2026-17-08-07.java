class Solution {
    public boolean checkIfPangram(String word) {
            boolean[] seen = new boolean[26];

        for(int i = 0 ; i < word.length() ; i++){
            char ch = word.charAt(i);
            seen[ch - 'a'] =true ;
        }
        for(boolean b : seen ){
            if(!b) return false ;
        }
        return true; 
    }
}