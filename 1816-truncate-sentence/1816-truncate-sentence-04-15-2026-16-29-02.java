class Solution {
    public String truncateSentence(String s, int k) {
        String[] str = s.split(" ");
            StringBuilder mk = new StringBuilder();

         for(int i = 0 ; i< k ; i++){
            mk.append(str[i]);


            if(i != k-1){
                  mk.append(" ");
             }
         }
            return mk.toString() ;    
            }
}