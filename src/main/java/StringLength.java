public class StringLength {

    public int counting(String toFind){
        int length = 0;
        char[] charArr = toFind.toCharArray();
        for(char ignored : charArr){
            length++;
        }
        return length;
    }
}
