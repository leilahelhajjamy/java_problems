import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class LongestCommonPrefix {



    public String longestPrefix(String[] strings){
        List<Prefix> listOfPrefixes = new ArrayList();
        List<Character> listOfCharacters = new ArrayList();
        String Prefix ="";
        int maxOccurrence = 0 ;
        for(int i =0 ; i< strings.length ; i++) {
            if(!listOfCharacters.contains(strings[i].charAt(0))){
                listOfPrefixes.add(new Prefix(String.valueOf(strings[i].charAt(0)) , 1));
                listOfCharacters.add(strings[i].charAt(0));
            } else {
                listOfPrefixes.get(listOfCharacters.indexOf(strings[i].charAt(0))).occurrences ++;
                continue;
            }
        }
        for(Prefix prefix : listOfPrefixes){
            maxOccurrence = Math.max(maxOccurrence , prefix.occurrences);
             System.out.println("prefix " + prefix.content +" appears" +prefix.occurrences);
        }
        System.out.println(String.valueOf(maxOccurrence));


        return String.valueOf(maxOccurrence);

    }
    public static void main(String[] args){
        String[] strings = new String[] {"laila" ,"fatiha","lailahajj","lailahajjamy"};
        LongestCommonPrefix longPrefix = new LongestCommonPrefix();
        longPrefix.longestPrefix(strings);
    }

}



class Prefix{
    String content;
    int occurrences;
    Prefix(String content, int occurrences) {
        this.content = content;
        this.occurrences = occurrences;
    }
}



