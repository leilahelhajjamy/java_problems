import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {


    public Set maxLength(String word) {
       Set<Character> setOfCharacters  = new HashSet();
       int i = 0 ;
       int j = 0 ;
       int res = 0;
       while(j<word.length()){
           if(setOfCharacters.contains(word.charAt(j))){
               setOfCharacters.remove(word.charAt(i));
               i++;

           } else {
               setOfCharacters.add(word.charAt(j));
               j++;
           }
       }

    res = Math.max(res, setOfCharacters.size());
    return setOfCharacters;

    }

    public static void main(String[] args){

        LongestSubstring longestSub = new LongestSubstring();
        System.out.println(longestSub.maxLength("laila"));


    }
}
