import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    public int maxProduct(String[] words) {
        int n = words.length;
        List<Set<Character>> listOfSets = new ArrayList(n);
        int max  =0;

       for(String word : words) {
           Set<Character> set = new HashSet();
           listOfSets.add(set);
           for(int i=0; i<word.length() ; i++){
               set.add(word.charAt(i));
           }
       }


       for(int i =0 ; i<n ; i++) {
          Set<Character> setI = listOfSets.get(i);
          for(int j=i+1 ; j<n; j++){
              boolean hasCommon = false;
              Set<Character> setJ = listOfSets.get(j);
              for(Character c : setI) {
                  if(setJ.contains(c)){
                      hasCommon= true;
                      break;
                  }
              }
              if(!hasCommon) {
                  max= Math.max(max, words[i].length() * words[j].length());
              }
          }
       }

        return max;

    }

    public static void main(String[] args){
        Solution sol = new Solution();
        String[] arrayOfnames = new String[]{"laila","nadia", "smai", "vcg"};
        System.out.println(sol.maxProduct(arrayOfnames));
    }




}
