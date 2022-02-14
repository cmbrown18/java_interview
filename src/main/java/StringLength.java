public class StringLength {

    public int counting(String toFind){
        int length = 0;
        char[] charArr = toFind.toCharArray();
        for(char c : charArr){
            length++;
        }
        return length;
    }
}
