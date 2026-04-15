import java.util.*;

class Solution {
    public int[] intersection(int[] arr1, int[] arr2) {
        
        Set<Integer> resultSet = new HashSet<>();
        
        int n1 = arr1.length;
        int n2 = arr2.length;
        
        for(int i = 0; i < n1; i++){
            for(int j = 0; j < n2; j++){
                if(arr1[i] == arr2[j]){
                    resultSet.add(arr1[i]); // store unique
                }
            }
        }
        
        // convert set to array
        int[] result = new int[resultSet.size()];
        int i = 0;
        
        for(int num : resultSet){
            result[i++] = num;
        }
        
        return result;
    }
}