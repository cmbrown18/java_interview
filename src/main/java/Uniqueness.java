import java.util.HashSet;

public class Uniqueness {

    public boolean unique(String check){
        char[] charArr = check.toLowerCase().toCharArray();
        HashSet<Character> hashSet = new HashSet<>();

        for(int i = 0; i < charArr.length; i++){
            if (!hashSet.add(charArr[i])) {
                return false;
            }
        }
        return true;
    }
}
