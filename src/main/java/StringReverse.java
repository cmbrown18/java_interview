public class StringReverse {

    /**
     * A simple reverse method that returns a reversed String.
     *  There is a simpler way of doing this but this is what
     *  I came up with first.
     */
    public String reverse(String toReverse){
        String temp = toReverse.toLowerCase();
        char[] tempChar = temp.toCharArray();
        char[] reverseChar = new char[tempChar.length];

        int countDown = tempChar.length;
        int countUp = 0;

        while(countDown > 0){
            reverseChar[countUp] = tempChar[countDown-1];
            countDown--;
            countUp++;
        }
        return new String(reverseChar);
    }
}
