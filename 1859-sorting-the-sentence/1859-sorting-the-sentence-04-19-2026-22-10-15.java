class Solution {
    public String sortSentence(String s) {
     
      String[ ] word = s.split(" ");
      String[] result = new String[word.length];

      for(int i = 0 ; i< word.length ; i++){
        String words = word[i];
        int pos = words.charAt(words.length()-1 )-'0';

        result[pos-1] = words.substring(0, words.length() -1 );
      }
      return String.join(" " , result);
    }
}