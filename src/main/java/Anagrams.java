import java.util.Arrays;
public class Anagrams {

    public boolean checkAnagram(String one, String two){
        if(one.length() != two.length()){
            return false;
        }

        String sortedOne = sortChars(one);
        String sortedTwo = sortChars(two);

        return sortedOne.equals(sortedTwo);
    }

    public String sortChars(String toSort){
        char[] charArr = toSort.toLowerCase().toCharArray();
        Arrays.sort(charArr);
        return new String(charArr);
    }
}
