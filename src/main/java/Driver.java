public class Driver {


    public static void main(String[] args){

        //Reverse a String without using the builtins
        StringReverse reversal = new StringReverse();
        String[] strings = new String[5];
        strings[0] = "Hannah";
        strings[1] = "Table";
        strings[2] = "Rusty";
        strings[3] = "Sage";
        strings[4] = "Random";

        System.out.println("########## TESTING REVERSAL ##########");
        for(int i = 0; i < strings.length; i++){
            System.out.println("Original: " + strings[i] + " Reverse: " + reversal.reverse(strings[i]));
        }

        //Check if a string is a palindrome, using the reverse method above
        String[] strings2 = new String[6];
        strings2[0] = "hannah";
        strings2[1] = "table";
        strings2[2] = "madam";
        strings2[3] = "refer";
        strings2[4] = "Racecar";
        strings2[5] = "random";

        System.out.println("\n########## TESTING PALINDROME ##########");
        for(int i = 0; i < strings2.length; i++){
            System.out.println("Original: " + strings2[i] + " Reverse: " + reversal.reverse(strings2[i]));
            System.out.println("Is a palindrome: " + strings2[i].equalsIgnoreCase(reversal.reverse(strings2[i])));
        }
    }
}
